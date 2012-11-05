package com.renda.etc.test.study;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * 参数测试
 * 在 JUnit 4 中创建参数测试只需要五个步骤：
 *1、创建一个不含参数的通用测试。
 *2、创建一个返回 Collection 类型的 static feeder 方法，并用 @Parameter 注释加以修饰。
 *3、为在步骤 1 中定义的通用方法所要求的参数类型创建类成员。
 *4、创建一个持有这些参数类型的构造函数，并把这些参数类型和步骤 3 中定义的类成员相应地联系起来。
 *5、通过 @RunWith 注释，指定测试用例和 Parameterized 类一起运行。
 * 2010-2-23
 */

//5、通过 @RunWith 注释，指定测试用例和 Parameterized 类一起运行。
@RunWith(Parameterized.class)
public class ParameterTest {
	
	private static String zipRegEx = "^\\d{5}([\\-]\\d{4})?$";
	private static Pattern pattern;

	//3、为在步骤 1 中定义的通用方法所要求的参数类型创建类成员。
	private String phrase;
	private boolean match;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		pattern = Pattern.compile(zipRegEx);
	}

	//4、创建一个持有这些参数类型的构造函数，并把这些参数类型和步骤 3 中定义的类成员相应地联系起来。
	public ParameterTest(String phrase, boolean match) {
		this.phrase = phrase;
		this.match = match;
	}
	
	//1、创建一个不含参数的通用测试。
	@Test
	public void verifyGoodZipCode() throws Exception {
		Matcher mtcher = this.pattern.matcher(phrase);
		boolean isValid = mtcher.matches();
		assertEquals("Pattern did not validate zip code", isValid, match);
	}
	
	//2、创建一个返回 Collection 类型的 static feeder 方法，并用 @Parameter 注释加以修饰。
	@Parameters
	public static Collection regExValues() {
		return Arrays.asList(new Object[][] { { "22101", true },
				{ "221x1", false }, { "22101-5150", true },
				{ "221015150", false } });
	}
	
	
}
