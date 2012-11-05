/**
 * @date 2012-10-9 下午5:35:53 
 * @version V1.0   
 */
package com.renda.design.patterns.mediator.a;

import java.util.Hashtable;

/** 
 * <p>Description: TODO</p>
 * @author yuandong.huang@gmail.com
 * @date 2012-10-9 下午5:35:53 
 *  
 */
public abstract class AbstractMediator {
	//中介者肯定需要保持有若干同事的联系方式  
    protected Hashtable<String, AbstractColleague> colleagues = new Hashtable<String, AbstractColleague>();  
      
    //中介者可以动态地与某个同事建立联系  
    public void addColleague(String name, AbstractColleague c) {  
        // 在中介者这里帮助具体同事建立起于中介者的联系  
        c.setMediator(this);  
        this.colleagues.put(name, c);  
    }     
      
    //中介者也可以动态地撤销与某个同事的联系  
    public void deleteColleague(String name) {  
        this.colleagues.remove(name);  
    }  
      
    //中介者必须具备在同事之间处理逻辑、分配任务、促进交流的操作  
    public abstract void execute(String name, String method); 
}
