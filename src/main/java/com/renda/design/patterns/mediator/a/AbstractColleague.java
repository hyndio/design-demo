/**
 * @date 2012-10-9 下午5:33:40 
 * @version V1.0   
 */
package com.renda.design.patterns.mediator.a;

/** 
 * <p>Description: TODO</p>
 * @author yuandong.huang@gmail.com
 * @date 2012-10-9 下午5:33:40 
 *  
 */
public abstract class AbstractColleague {
	protected AbstractMediator mediator;      
      
    // 在抽象同事类中添加用于与中介者取得联系（即注册）的方法  
    public void setMediator(AbstractMediator mediator) {  
        this.mediator = mediator;  
    } 
}
