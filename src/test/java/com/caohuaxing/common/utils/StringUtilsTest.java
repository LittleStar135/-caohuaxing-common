package com.caohuaxing.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void testHasLength() {
		String src=" ";
		boolean b = StringUtils.hasLength(src);
		System.out.println(b);
		
	}

	@Test
	public void testHasText() {
		String src=" ";
		boolean b = StringUtils.hasText(src);
		System.out.println(b);
	}

	@Test
	public void testRandomChineseString() {
		String c = StringUtils.randomChineseString(100);
		System.out.println(c);
		
	}

	@Test
	public void testGenerateChineseName() {
		String name = StringUtils.generateChineseName();
		System.out.println(name);
		
		
	}

}
