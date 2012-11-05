/**
 * @Package com.renda.design.patterns.chainofresponsibility
 * @author hyd
 * @date 2011-12-15 上午10:01:15
 * @version v1.0
 */
package com.renda.design.patterns.chainofresponsibility;

/**
 * 
 */
public class FirstHandler implements Handler {

	/**
	 * 
	 * @param req
	 * @param res
	 */
	public void handler(Req req, Res res) {
		req.setStuff(req.getStuff() + "First-req-");
		
		res.setStuff("First-res");
	}

}
