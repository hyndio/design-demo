/**
 * @Package com.renda.design.patterns.chainofresponsibility.a
 * @author hyd
 * @date 2011-12-15 上午9:56:44
 * @version v1.0
 */
package com.renda.design.patterns.chainofresponsibility.a;

/**
 * 
 */
public class Filter1 implements Filter {

	/**
	 * 
	 * @param request
	 * @param response
	 * @param filterChain
	 */
	public void doFilter(Request request, Response response,
			FilterChain filterChain) {
		String str = request.getRequestParameter();
		str += "request pass filter1 ";
		request.setRequestParameter(str);
		filterChain.doFilter(request, response, filterChain);
		str = response.getResponseParameter();
		str += "response pass filter1";
		response.setResponseParameter(str);
	}

}
