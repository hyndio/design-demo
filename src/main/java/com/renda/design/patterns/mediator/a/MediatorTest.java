/**
 * @date 2012-10-9 下午5:39:48 
 * @version V1.0   
 */
package com.renda.design.patterns.mediator.a;

import org.junit.Test;

/** 
 * <p>Description: TODO</p>
 * @author yuandong.huang@gmail.com
 * @date 2012-10-9 下午5:39:48 
 *  
 */
public class MediatorTest {
	
	@Test
	public void md() {
		//创建一个中介者  
        AbstractMediator mediator = new ConcreteMediator();  
          
        ColleagueA colleagueA = new ColleagueA(); 
        ColleagueB colleagueB = new ColleagueB(); 
          
        //中介者分别与每个同事建立联系  
        mediator.addColleague("ColleagueA", colleagueA);  
        mediator.addColleague("ColleagueB", colleagueB);  
          
        //同事们开始工作  
        colleagueA.self();  
        colleagueA.out();  
        System.out.println("======================合作愉快，任务完成！\n");  
          
        colleagueB.self();  
        colleagueB.out();  
        System.out.println("======================合作愉快，任务完成！");  
	}

}
