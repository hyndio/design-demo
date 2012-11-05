/**
 * @Package com.renda.design.patterns.chainofresponsibility.a
 * @author hyd
 * @date 2011-12-15 上午9:57:31
 * @version v1.0
 */
package com.renda.design.patterns.chainofresponsibility.a;

import org.junit.Test;

/**
 * 
 */
public class FilterTest {

	@Test
	public void filter() {
		Request request = new Request();
		Response response = new Response();

		FilterChain chain1 = new FilterChain();
		chain1.addFilter(new Filter1()).addFilter(new Filter2());

		chain1.doFilter(request, response, chain1);

		System.out.println(request.getRequestParameter());
		System.out.println(response.getResponseParameter());
	}
}
