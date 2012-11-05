/**
 * @Title: Language.java
 * @Package hyd.finance.iworkflow
 * @Description: 
 * @author yuandong.huang@gmail.com
 * @date 2010-11-4 上午11:53:31
 * @version v1.0
 */
package com.renda.etc.constant;

/**
 * @ClassName: Language
 * @Description: 语言类型
 */
public enum Language {
	JAVA("一直在用！") {
		@Override
		public String doSomething() {
			return "java";
		}
	},
	PHP("曾经用过！") {
		@Override
		public String doSomething() {
			return "php";
		}
	},
	RUBY("从未用过！"){
		@Override
		public String doSomething() {
			return "ruby";
		}
	},
	GROOVY("想学习！"){
		@Override
		public String doSomething() {
			return "groovy";
		}
	};
	
	private final String using;

	private Language(String using) {
		this.using = using;
	}

	public String getUsing() {
		return using;
	}
	
	abstract String doSomething();
	
}
