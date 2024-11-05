package com.gradescope.JavaBasics;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BasicsTests {

	@Test
	public void testSleepIn() {
		assertTrue(Basics.sleepIn(false, false));
		System.out.println("false, false: " + Basics.sleepIn(false, false));
		assertFalse(Basics.sleepIn(true, false));
		assertTrue(Basics.sleepIn(false, true));
		assertTrue(Basics.sleepIn(true, true));
	}

	@Test
	public void testMakes10() {
		assertTrue(Basics.makes10(9, 10));
		assertTrue(Basics.makes10(1, 9));
		assertTrue(Basics.makes10(10, 1));
		assertTrue(Basics.makes10(10, 10));
		assertTrue(Basics.makes10(8, 2));
		assertTrue(Basics.makes10(10, 42));
		assertTrue(Basics.makes10(12, -2));
		assertFalse(Basics.makes10(9, 9));
		assertFalse(Basics.makes10(8, 3));
	}

	@Test
	public void testMonkeyTrouble() {
		assertTrue(Basics.monkeyTrouble(true, true));
		assertTrue(Basics.monkeyTrouble(false, false));
		assertFalse(Basics.monkeyTrouble(true, false));
		assertFalse(Basics.monkeyTrouble(false, true));
	}

	@Test
	public void testIn1020() {
		assertTrue(Basics.in1020(12, 99));
		assertTrue(Basics.in1020(21, 12));
		assertTrue(Basics.in1020(99, 10));
		assertTrue(Basics.in1020(20, 20));
		assertFalse(Basics.in1020(8, 99));
		assertFalse(Basics.in1020(21, 21));
		assertFalse(Basics.in1020(9, 9));
	}

	@Test
	public void testIcyHot() {
		assertTrue(Basics.icyHot(120, -1));
		assertTrue(Basics.icyHot(-1, 120));
		assertFalse(Basics.icyHot(2, 120));
		assertFalse(Basics.icyHot(-1, 100));
		assertFalse(Basics.icyHot(-2, -2));
		assertFalse(Basics.icyHot(120, 120));
	}

	@Test
	public void testHasTeen() {
		assertTrue(Basics.hasTeen(13, 20, 10));
		assertTrue(Basics.hasTeen(20, 19, 10));
		assertTrue(Basics.hasTeen(20, 10, 13));
		assertTrue(Basics.hasTeen(19, 20, 12));
		assertTrue(Basics.hasTeen(12, 20, 19));
		assertTrue(Basics.hasTeen(12, 18, 20));
		assertTrue(Basics.hasTeen(14, 2, 20));
		assertFalse(Basics.hasTeen(1, 20, 12));
		assertFalse(Basics.hasTeen(12, 9, 20));
		assertFalse(Basics.hasTeen(4, 2, 20));
		assertFalse(Basics.hasTeen(11, 22, 22));
	}

	@Test
	public void testLastDigit() {
		assertTrue(Basics.lastDigit(7, 17));
		assertTrue(Basics.lastDigit(3, 113));
		assertTrue(Basics.lastDigit(114, 4));
		assertTrue(Basics.lastDigit(10, 0));
		assertFalse(Basics.lastDigit(114, 113));
		assertFalse(Basics.lastDigit(6, 17));
		assertFalse(Basics.lastDigit(11, 0));
	}

	@Test
	public void testPosNeg() {
		assertTrue(Basics.posNeg(1, -1, false));
		assertTrue(Basics.posNeg(-1, 1, false));
		assertTrue(Basics.posNeg(-4, -5, true));
		assertTrue(Basics.posNeg(-4, 5, false));
		assertTrue(Basics.posNeg(-1, -1, true));
		assertTrue(Basics.posNeg(5, -5, false));
		assertTrue(Basics.posNeg(-6, 6, false));
		assertTrue(Basics.posNeg(-5, -5, true));
		assertFalse(Basics.posNeg(-4, -5, false));
		assertFalse(Basics.posNeg(-4, 5, true));
		assertFalse(Basics.posNeg(1, 1, false));
		assertFalse(Basics.posNeg(-1, -1, false));
		assertFalse(Basics.posNeg(1, -1, true));
		assertFalse(Basics.posNeg(-1, 1, true));
		assertFalse(Basics.posNeg(1, 1, true));
		assertFalse(Basics.posNeg(-5, -6, false));
		assertFalse(Basics.posNeg(-2, -1, false));
		assertFalse(Basics.posNeg(1, 2, false));
		assertFalse(Basics.posNeg(-5, 6, true));
	}

	@Test
	public void testCalcMax2Numbers() {
		assertEquals(2, Basics.calculateMax(1, 2));
		assertEquals(2, Basics.calculateMax(2, 1));
		assertEquals(23, Basics.calculateMax(-1, 23));
		assertEquals(2, Basics.calculateMax(2, -1));
	}

	@Test
	public void testCalcMax4Numbers() {
		assertEquals(4, Basics.calculateMax(1, 2, 3, 4));
		assertEquals(7, Basics.calculateMax(7, 2, 3, 4));
		assertEquals(13, Basics.calculateMax(1, 2, 13, 4));
		assertEquals(12, Basics.calculateMax(1, 12, 3, 4));
		assertEquals(4, Basics.calculateMax(-11, -22, -33, 4));
		assertEquals(7, Basics.calculateMax(7, 2, 3, -4));
		assertEquals(4, Basics.calculateMax(1, -2, -13, 4));
		assertEquals(12, Basics.calculateMax(1, 12, -3, 4));
	}

	@Test
	public void testCalcAbsMax() {
		assertEquals(2, Basics.calculateAbsMax(1, 2));
		assertEquals(2, Basics.calculateAbsMax(2, 1));
		assertEquals(23, Basics.calculateAbsMax(-1, 23));
		assertEquals(2, Basics.calculateAbsMax(2, -1));
		assertEquals(-2, Basics.calculateAbsMax(-2, -1));
		assertEquals(-2, Basics.calculateAbsMax(-2, 1));
	}

	@Test
	public void testCalcPerimeter() {
		assertEquals(Math.PI, Basics.calculatePerimeter(0.5), 0);
		assertEquals(2 * Math.PI, Basics.calculatePerimeter(1), 0);
	}
}
