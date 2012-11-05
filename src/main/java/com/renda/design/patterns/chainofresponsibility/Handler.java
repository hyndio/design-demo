/**
 * @Package com.renda.design.patterns.chainofresponsibility
 * @author hyd
 * @date 2011-12-15 上午9:43:07
 * @version v1.0
 */
package com.renda.design.patterns.chainofresponsibility;

/**
 * 
 */
public interface Handler {

	void handler(Req req, Res res);
}
