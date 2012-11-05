/**
 * @date 2012-10-9 下午5:59:32 
 * @version V1.0   
 */
package com.renda.design.patterns.mediator.b;

/**
 * <p>
 * Description: TODO
 * </p>
 * 
 * @author yuandong.huang@gmail.com
 * @date 2012-10-9 下午5:59:32
 * 
 */
public class VideoCard extends Colleague {
	public VideoCard(Mediator mediator) {
		super(mediator);
	}

	/**
	 * 显示视频数据
	 * 
	 * @param data
	 *            被显示的数据
	 */
	public void showData(String data) {
		System.out.println("你正在观看的是：" + data);
	}
}
