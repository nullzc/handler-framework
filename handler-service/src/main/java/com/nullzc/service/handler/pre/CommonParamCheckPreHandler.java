package com.nullzc.service.handler.pre;

import java.util.Set;

import com.nullzc.service.enums.HandlerEnum.BussinessType;
import com.nullzc.service.enums.HandlerEnum.Order;
import com.nullzc.service.handler.AbstractPreHandler;
import com.nullzc.service.handler.entity.RequestParam;
import com.nullzc.service.handler.entity.Result;

public class CommonParamCheckPreHandler extends AbstractPreHandler {

	@Override
	public Result<?> preHandle(RequestParam<?> param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<BussinessType> getBussinessType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order getOrder() {
		// TODO Auto-generated method stub
		return null;
	}

}
