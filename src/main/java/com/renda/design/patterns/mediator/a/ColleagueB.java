/**
 * @date 2012-10-9 下午5:38:19 
 * @version V1.0   
 */
package com.renda.design.patterns.mediator.a;

/** 
 * <p>Description: TODO</p>
 * @author yuandong.huang@gmail.com
 * @date 2012-10-9 下午5:38:19 
 *  
 */
public class ColleagueB extends AbstractColleague {
	public void self() {  
        System.out.println("同事B --> 做好自己分内的事情 ...");  
    }  
      
    public void out() {  
        System.out.println("同事B --> 请求同事A做好分内工作  ...");  
        super.mediator.execute("ColleagueA", "self");  
    }  
}
