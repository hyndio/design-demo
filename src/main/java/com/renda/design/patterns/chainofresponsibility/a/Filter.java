/**
 * @Package com.renda.design.patterns.chainofresponsibility.a
 * @author hyd
 * @date 2011-12-15 上午9:52:03
 * @version v1.0
 */
package com.renda.design.patterns.chainofresponsibility.a;

/**
 * 
 */
public interface Filter {
	void doFilter(Request request, Response response,
			FilterChain filterChain);
}
