/**
 * @date 2012-10-9 下午5:41:34 
 * @version V1.0   
 */
package com.renda.design.patterns.mediator.a;

/** 
 * <p>Description: TODO</p>
 * @author yuandong.huang@gmail.com
 * @date 2012-10-9 下午5:41:34 
 *  
 */
public class ConcreteMediator extends AbstractMediator {

	/* (non-Javadoc)
	 * @see com.renda.design.patterns.mediator.a.AbstractMediator#execute(java.lang.String, java.lang.String)
	 */
	@Override
	public void execute(String name, String method) {
		if("self".equals(method)){  //各自做好分内事  
            if("ColleagueA".equals(name)) {
                ColleagueA colleague = (ColleagueA)super.colleagues.get("ColleagueA");  
                colleague.self(); 
            }else {  
                ColleagueB colleague = (ColleagueB)super.colleagues.get("ColleagueB");  
                colleague.self();  
            }  
        }else { //与其他同事合作  
            if("ColleagueA".equals(name)) {  
                ColleagueA colleague = (ColleagueA)super.colleagues.get("ColleagueA");  
                colleague.out();  
            }else {  
                ColleagueB colleague = (ColleagueB)super.colleagues.get("ColleagueB");  
                colleague.out();  
            }  
        }  

	}

}
