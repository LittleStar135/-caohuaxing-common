package com.caohuaxing.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilsTest {

	@Test
	public void testRandom() {
		int i = RandomUtils.random(1,120);
		System.out.println(i);
	}

	@Test
	public void testSubRandom() {
		int[] is = RandomUtils.subRandom(1,10, 3);
		for (int i : is) {
			System.out.println(i);
		}
		
	}

	@Test
	public void testRandomCharacter() {
		
		char c = RandomUtils.randomCharacter();
		System.out.println(c);
		
	}

	@Test
	public void testRandomString() {
		String string = RandomUtils.randomString(5);
		
		System.out.println(string);

	}

}
