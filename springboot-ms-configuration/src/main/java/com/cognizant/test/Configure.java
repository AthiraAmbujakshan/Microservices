@RestController
public class Configure {
	
	
	@Value("${data}")
	private String message;
	
	//if data property doesnot exist in property file
	@Value("${param: not exists}")
	private String noparameter;
	
	//to return list
	@Value("${my.list.values}")
	private List<String> listValues;
	
	
	//values inside the code
	@Value("some static message")
	private String StaticMessage;
	
	//to return map- key values pairs from property file
		@Value("#{${dbValues}}")
		private Map<String,String> dbValues;
		
		
		@Autowired
		private DbSetting dbsetting;
		
		
		@Autowired
		private Environment env;
	
	
	@GetMapping("/config")
	public String getData() {
		//return  message +" " + noparameter+ " "+ listValues+" "+StaticMessage +" "+dbValues;
		return dbsetting.getConnection() +dbsetting.getHost() + dbsetting.getPort();
	}
	
	
	
	@GetMapping("/envdetails")
	public String getEnvData() {
		
		return env.toString();
	}

}
