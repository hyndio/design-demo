/**
 * @date 2012-10-10 下午12:05:26 
 * @version V1.0   
 */
package com.renda.design.patterns.singlecall;

/**
 * <p>
 * Description: 组合的实现
 * </p>
 * 
 * @author yuandong.huang@gmail.com
 * @date 2012-10-10 下午12:05:26
 * 
 */
public class Car {
	private Engine engine;
	private boolean can_load = false;

	public Car() {
		engine = get_engine();
	}

	final public boolean can_load() {
		return can_load;
	}

	private Engine get_engine() {
		Engine my_engine;
		can_load = true;
		my_engine = Engine.getobject(this);
		can_load = false;
		return my_engine;
	}

	public void start() {
		if (engine != null) {
			engine.start();
		}
	}

	public void stop() {
		if (engine != null) {
			engine.stop();
		}
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.start();
		car.stop();
	}
}
