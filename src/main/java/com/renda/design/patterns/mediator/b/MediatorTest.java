/**
 * @date 2012-10-9 下午6:00:35 
 * @version V1.0   
 */
package com.renda.design.patterns.mediator.b;

import org.junit.Test;

/**
 * <p>
 * Description: TODO
 * </p>
 * 
 * @author yuandong.huang@gmail.com
 * @date 2012-10-9 下午6:00:35
 * 
 */
public class MediatorTest {

	@Test
	public void md() {
		MainBoard mediator = new MainBoard();
		CDDriver cd = new CDDriver(mediator);
		CPU cpu = new CPU(mediator);
		VideoCard vc = new VideoCard(mediator);
		SoundCard sc = new SoundCard(mediator);

		mediator.setCdDriver(cd);
		mediator.setCpu(cpu);
		mediator.setVideoCard(vc);
		mediator.setSoundCard(sc);

		cd.readCD();
	}

}
