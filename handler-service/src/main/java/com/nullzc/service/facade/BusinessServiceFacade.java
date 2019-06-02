package com.nullzc.service.facade;

import org.springframework.stereotype.Service;

import com.nullzc.service.handler.HandlerDispatch;
import com.nullzc.service.handler.entity.RequestParam;

@Service
public class BusinessServiceFacade extends HandlerDispatch implements BusinessService {
	
	@Override
	public String type1(RequestParam<String> param) {
		return dispatch(param, String.class);
	}

	@Override
	protected void doBusiness(RequestParam<?> param) {
		switch (param.getBussinessType()) {
		case "":
			
			break;

		default:
			break;
		}
		
	}

}
