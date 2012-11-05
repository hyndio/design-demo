/**
 * @Package com.renda.design.patterns.chainofresponsibility.a
 * @author hyd
 * @date 2011-12-15 上午9:55:04
 * @version v1.0
 */
package com.renda.design.patterns.chainofresponsibility.a;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class FilterChain implements Filter {

	List<Filter> filters = new ArrayList<Filter>();

	private int i = 0;

	public FilterChain addFilter(Filter filter) {
		filters.add(filter);
		return this;
	}

	public void doFilter(Request request, Response response,
			FilterChain filterChain) {
		if (i == filters.size())
			return;
		Filter filter = filters.get(i);
		i++;
		filter.doFilter(request, response, filterChain);
	}

}
