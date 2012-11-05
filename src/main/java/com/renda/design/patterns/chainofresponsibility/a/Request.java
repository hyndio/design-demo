/**
 * @Package com.renda.design.patterns.chainofresponsibility.a
 * @author hyd
 * @date 2011-12-15 上午9:52:53
 * @version v1.0
 */
package com.renda.design.patterns.chainofresponsibility.a;

/**
 * 
 */
public class Request {
	private String requestParameter = "";

	public String getRequestParameter() {
		return requestParameter;
	}

	public void setRequestParameter(String requestParameter) {
		this.requestParameter = requestParameter;
	}
}
