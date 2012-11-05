/**
 * @date 2012-10-9 下午5:56:32 
 * @version V1.0   
 */
package com.renda.design.patterns.mediator.b;

/**
 * <p>
 * Description: 具体的中介者
 * </p>
 * 
 * @author yuandong.huang@gmail.com
 * @date 2012-10-9 下午5:56:32
 * 
 */
public class MainBoard implements Mediator {

	private CDDriver cdDriver;
	private CPU cpu;
	private VideoCard videoCard;
	private SoundCard soundCard;

	public void changed(Colleague colleague) {
		if (colleague == cdDriver) {
			// 表示光驱读取了数据
			this.operateCDDriverReadData((CDDriver) colleague);
		} else if (colleague == cpu) {
			// 表示CPU处理完数据
			this.operateCPU((CPU) colleague);
		}
	}

	public void setCdDriver(CDDriver cdDriver) {
		this.cdDriver = cdDriver;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public void setVideoCard(VideoCard videoCard) {
		this.videoCard = videoCard;
	}

	public void setSoundCard(SoundCard soundCard) {
		this.soundCard = soundCard;
	}

	/**
	 * 处理光驱读取数据后与其他对象的交互
	 * 
	 * @param cd
	 */
	public void operateCDDriverReadData(CDDriver cd) {
		String data = cd.getData();
		this.cpu.executeData(data);
	}

	/**
	 * 处理CPU处理完数据后与其他对象的交互
	 * 
	 * @param cpu
	 */
	public void operateCPU(CPU cpu) {
		String videoData = cpu.getVideoData();
		String soundData = cpu.getSoundData();
		this.videoCard.showData(videoData);
		this.soundCard.soundData(soundData);
	}

}
