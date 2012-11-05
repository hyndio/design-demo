/**
 * @Package com.renda.design.patterns.chainofresponsibility
 * @author hyd
 * @date 2011-12-15 上午10:05:42
 * @version v1.0
 */
package com.renda.design.patterns.chainofresponsibility;

import org.junit.Test;

/**
 * 
 */
public class HandlerTest {

	@Test
	public void hanlder() {
		
		HandlerChain chain = new HandlerChain();
		chain.addHandler(new FirstHandler()).addHandler(new SecondHandler());
		
		Req req = new Req();
		req.setStuff("init-");
		Res res = new Res();
		chain.handler(req, res);
		
		System.out.println("---------------------------");
		
		System.out.println(req.getStuff());
		System.out.println(res.getStuff());
		
		System.out.println("---------------------------");
		
	}
}
