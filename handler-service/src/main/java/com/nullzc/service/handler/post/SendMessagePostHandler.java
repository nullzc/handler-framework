package com.nullzc.service.handler.post;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.nullzc.service.enums.HandlerEnum.BussinessType;
import com.nullzc.service.enums.HandlerEnum.Order;
import com.nullzc.service.handler.AbstractPostHandler;
import com.nullzc.service.handler.entity.RequestParam;
import com.nullzc.service.handler.entity.Result;
/**
 * 业务后置处理  发送短信
 * @author nullzc
 *
 */
@Service
public class SendMessagePostHandler extends AbstractPostHandler {

	@Override
	public Result<?> postHandle(RequestParam<?> param) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void fallback(RequestParam<?> param) {
		super.fallback(param);
		// 消息发送失败 预警
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
