/**
 * @date 2012-10-9 下午5:57:38 
 * @version V1.0   
 */
package com.renda.design.patterns.mediator.b;

/**
 * <p>
 * Description: TODO
 * </p>
 * 
 * @author yuandong.huang@gmail.com
 * @date 2012-10-9 下午5:57:38
 * 
 */
public class CDDriver extends Colleague {
	/**
	 * 光盘数据
	 */
	private String data;

	public CDDriver(Mediator mediator) {
		super(mediator);
	}

	/**
	 * 获取光盘读取出来的数据
	 * 
	 * @return 光盘数据
	 */
	public String getData() {
		return data;
	}

	/**
	 * 读取光盘
	 */
	public void readCD() {
		// 逗号前是视频数据，逗号后是音频数据
		this.data = "Video Data,Sound Data";
		// 通知主板，自己的状态发生了变化
		this.getMediator().changed(this);
	}
}
