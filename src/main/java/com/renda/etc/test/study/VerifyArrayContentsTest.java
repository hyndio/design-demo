package com.renda.etc.test.study;
/**
 * JUnit 4 添加了一个用于比较数组内容的新断言方法。
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class VerifyArrayContentsTest {
	@Test
	public void verifyArrayContents() throws Exception {
		String[] actual = new String[] { "JUnit 3.8.x", "JUnit 4.1", "TestNG" };
		String[] var = new String[] { "JUnit 3.8.x", "JUnit 4.1", "TestNG" };
		assertArrayEquals("the two arrays should not be equal",actual, var);
	}

}
