package com.ximu.consumter.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PayService {

	@Resource
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="payFallback")
	public String pay(String orderNo,String amount){
		return this.restTemplate.getForEntity("http://cf-cloud-provider/pay", String.class, orderNo,amount).getBody();
	}
	
	/**
	 * hystrix fallback
	 * @param orderNo
	 * @param amount
	 * @return
	 */
	public String payFallback(String orderNo,String amount){
		log.error("call pay method error,so call fallback,params  value is :"+orderNo);
		return "error";
	}
}
