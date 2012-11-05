/**
 * @Package com.renda.design.patterns.chainofresponsibility.a
 * @author hyd
 * @date 2011-12-15 上午9:56:05
 * @version v1.0
 */
package com.renda.design.patterns.chainofresponsibility.a;

/**
 * 
 */
public class Filter2 implements Filter {

	/**
	 * 
	 * @param request
	 * @param response
	 * @param filterChain
	 */
	public void doFilter(Request request, Response response,
			FilterChain filterChain) {

		String str = request.getRequestParameter();
		str += "request pass filter2 ";
		request.setRequestParameter(str);
		filterChain.doFilter(request, response, filterChain);

		str = response.getResponseParameter();
		str += "response pass filter2";
		response.setResponseParameter(str);
	}

}
