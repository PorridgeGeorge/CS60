package com.gradescope.JavaBasics;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecursionTests {
	
	@Test
	public void choose_4_0() {
		assertEquals(1, Recursion.choose(4, 0));
	}

	@Test
	public void choose_6_2() {
		assertEquals(15, Recursion.choose(6, 2));
	}

	@Test
	public void choose_3_1() {
		assertEquals(3, Recursion.choose(3, 1));
	}
}