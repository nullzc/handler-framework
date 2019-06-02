package com.nullzc.service.handler.chains;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nullzc.service.handler.PostHandler;

@Service
public class PostHandlerChains extends AbstractPostHandlerChains implements InitializingBean {
	
	@Autowired
	private PostHandler[] postHandlers;
	
	@Override
	protected void registerHandler(PostHandler postHandler) {
		super.register(postHandler);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		for(PostHandler postHandler : postHandlers) {
			registerHandler(postHandler);
		}
	}
	
}
