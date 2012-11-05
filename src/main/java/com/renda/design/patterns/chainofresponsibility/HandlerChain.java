/**
 * @Package com.renda.design.patterns.chainofresponsibility
 * @author hyd
 * @date 2011-12-15 上午10:02:35
 * @version v1.0
 */
package com.renda.design.patterns.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class HandlerChain implements Handler {
	
	private List<Handler> chains = new ArrayList<Handler>();
	
	/***
	 * 
	 * @param handler
	 * @return
	 */
	public HandlerChain addHandler(Handler handler) {
		chains.add(handler);
		return this;
	}

	/**
	 * 
	 * @param req
	 * @param res
	 */
	public void handler(Req req, Res res) {
		for (Handler handler : chains) {
			handler.handler(req, res);
		}
	}

}
