package com.nullzc.service.handler.chains;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nullzc.service.handler.PreHandler;

@Service
public class PreHandlerChains extends AbstractPreHandlerChains implements InitializingBean {
	
	@Autowired
	private PreHandler[] preHandlers;

	@Override
	protected void registerHandler(PreHandler preHandler) {
		super.register(preHandler);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		for (PreHandler preHandler : preHandlers) {
			registerHandler(preHandler);
		}
	}
	
}
