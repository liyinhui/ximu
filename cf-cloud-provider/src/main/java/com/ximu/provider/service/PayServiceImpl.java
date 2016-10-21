package com.ximu.provider.service;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ximu.common.model.HttpResponse;
import com.ximu.common.model.request.PayRequest;
import com.ximu.provider.api.PayService;

@RestController
public class PayServiceImpl implements PayService {
	
	@Override
	@GetMapping("/pay")
	public HttpResponse pay(String orderNo,String amount) {
		HttpResponse response = new HttpResponse();
		
		response.setMsg("SUCCESS");
		response.setStatus("SUCCESS");
		return response;
	}

}
