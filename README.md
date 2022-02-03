# Microservices
                   ms-apigateway-example 
this project demonstrates the implementation  of ApiGateway in microservices
there are 3 services

1>patient-service

2>doctor-service

3>disease-service

apigateway- service

  the request coming as tokens from front end are routed to  respectivs ms
  
  doctor-service:
      url: http://localhost:8082
    patient-service:
      url: http://localhost:8081
    disease-service:
      url: http://localhost:8083
      
      
      after implementing api gateway service, if we navigate the url 
      
      http://localhost:8100/doctor-service/doctors   -> o/p->list of doctors
      
      http://localhost:8100/patient-service/patients   ->o/p->list of patients
      
      http://localhost:8100/disease-service/diseases  ->o/p->list of diseases
      
      
      we have used spring boot actuator  to get list of endpoints
      
      @EnableZuulProxy provides 2endpoints
      1>Routes
      2>filters
      http://localhost:8100/actuators/routes
      http://localhost:8100/actuators/filters
