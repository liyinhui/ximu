package com.ximu.provider.api;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestParam;

import com.ximu.common.model.HttpResponse;
import com.ximu.common.model.request.PayRequest;

public interface PayService {

	public HttpResponse pay(String orderNo,String amount);
}
