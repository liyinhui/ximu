package com.ximu.consumter.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ximu.common.model.request.PayRequest;
import com.ximu.consumter.service.PayService;

@RestController
public class PayController {

	@Resource
	private PayService payService;
	
	@GetMapping("/v1/pay")
	public String pay(@RequestParam(required=false) String orderNo,@RequestParam(required=false) String amount){
		PayRequest request = new PayRequest();
		request.setOrderNo(orderNo);
		request.setAmount(amount);
		return payService.pay(orderNo, amount);
		//return this.restTemplate.postForEntity("http://cf-cloud-provider/pay", request, String.class).getBody();
	}
}
