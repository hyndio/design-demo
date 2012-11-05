/**
 * @date 2012-10-9 下午5:37:35 
 * @version V1.0   
 */
package com.renda.design.patterns.mediator.a;

/** 
 * <p>Description: TODO</p>
 * @author yuandong.huang@gmail.com
 * @date 2012-10-9 下午5:37:35 
 *  
 */
public class ColleagueA extends AbstractColleague {
	//每个具体同事必然有自己分内的事，没必要与外界相关联  
    public void self() {  
        System.out.println("同事A --> 做好自己分内的事情 ...");  
    }  
      
    //每个具体同事总有需要与外界交互的操作，通过中介者来处理这些逻辑并安排工作  
    public void out() {  
        System.out.println("同事A --> 请求同事B做好分内工作 ...");  
        super.mediator.execute("ColleagueB", "self");  
    }
}
