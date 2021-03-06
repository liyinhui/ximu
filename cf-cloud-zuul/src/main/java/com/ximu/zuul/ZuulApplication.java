package com.ximu.zuul;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ZuulApplication 
{
    public static void main( String[] args )
    {
    	new SpringApplicationBuilder(ZuulApplication.class).web(true).run(args);
    }
}
