package com.cognizant.demo.filter;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.CharEncoding;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import com.google.common.io.CharStreams;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
@Configuration
public class Postfilter extends ZuulFilter {

	 private static  Logger logger = LoggerFactory.getLogger(Postfilter.class);
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		RequestContext ctx = RequestContext.getCurrentContext();

        HttpServletResponse response = ctx.getResponse();
       
        logger.info("Response  Status= {}", response.getStatus());
       
        
        try (InputStream is = ctx.getResponseDataStream()) {
            String respData = CharStreams.toString(new InputStreamReader(is, CharEncoding.UTF_8));
            logger.info("Response  Data = {}", respData);
            ctx.setResponseBody(respData);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "post";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
