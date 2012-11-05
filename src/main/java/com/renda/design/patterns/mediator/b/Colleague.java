/**
 * @date 2012-10-9 下午5:55:11 
 * @version V1.0   
 */
package com.renda.design.patterns.mediator.b;

/**
 * <p>
 * Description: TODO
 * </p>
 * 
 * @author yuandong.huang@gmail.com
 * @date 2012-10-9 下午5:55:11
 * 
 */
public abstract class Colleague {
	/**
	 * 持有中介者对象，每一个同事类都知道它的中介者对象
	 */
	private final Mediator mediator;

	/**
	 * 构造方法，传入中介者对象
	 * 
	 * @param mediator
	 *            中介者对象
	 */
	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}

	/**
	 * 获得当前同事类对应的中介者对象
	 * 
	 * @return 对应的中介者对象
	 */
	public Mediator getMediator() {
		return mediator;
	}

}
