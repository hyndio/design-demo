/**
 * @date 2012-10-9 下午5:58:17 
 * @version V1.0   
 */
package com.renda.design.patterns.mediator.b;

/**
 * <p>
 * Description: TODO
 * </p>
 * 
 * @author yuandong.huang@gmail.com
 * @date 2012-10-9 下午5:58:17
 * 
 */
public class CPU extends Colleague {
	/**
	 * 视频数据
	 */
	private String videoData;
	/**
	 * 音频数据
	 */
	private String soundData;

	public CPU(Mediator mediator) {
		super(mediator);
	}

	public String getVideoData() {
		return videoData;
	}

	public String getSoundData() {
		return soundData;
	}

	/**
	 * 处理数据，把数据分解成视频数据和音频数据
	 * 
	 * @param data
	 *            被处理的数据
	 */
	public void executeData(String data) {
		// 分解数据，前面是视频数据，后面是音频数据
		String[] ss = data.split(",");
		this.videoData = ss[0];
		this.soundData = ss[1];
		// 通知主板，CPU的工作完成
		this.getMediator().changed(this);
	}
}
