/**
 * @date 2012-10-9 下午5:58:55 
 * @version V1.0   
 */
package com.renda.design.patterns.mediator.b;

/**
 * <p>
 * Description: TODO
 * </p>
 * 
 * @author yuandong.huang@gmail.com
 * @date 2012-10-9 下午5:58:55
 * 
 */
public class SoundCard extends Colleague {
	public SoundCard(Mediator mediator) {
		super(mediator);
	}

	/**
	 * 发出声音
	 * 
	 * @param data
	 *            音频数据
	 */
	public void soundData(String data) {
		System.out.println("画外音：" + data);
	}
}
