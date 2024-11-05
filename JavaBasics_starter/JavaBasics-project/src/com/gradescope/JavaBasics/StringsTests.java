package com.gradescope.JavaBasics;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringsTests {

	@Test
	public void testNotString() {
		assertEquals("not candy", Strings.notString("candy"));
		assertEquals("not x", Strings.notString("x"));
		assertEquals("not bad", Strings.notString("not bad"));
		assertEquals("not bad", Strings.notString("bad"));
		assertEquals("not", Strings.notString("not"));
		assertEquals("not is not", Strings.notString("is not"));
		assertEquals("not no", Strings.notString("no"));
	}

	@Test
	public void testMissingChar() {
		assertEquals("ktten", Strings.missingChar("kitten", 1));
		assertEquals("itten", Strings.missingChar("kitten", 0));
		assertEquals("kittn", Strings.missingChar("kitten", 4));
		assertEquals("i", Strings.missingChar("Hi", 0));
		assertEquals("H", Strings.missingChar("Hi", 1));
		assertEquals("ode", Strings.missingChar("code", 0));
		assertEquals("cde", Strings.missingChar("code", 1));
		assertEquals("coe", Strings.missingChar("code", 2));
		assertEquals("cod", Strings.missingChar("code", 3));
		assertEquals("chocolat", Strings.missingChar("chocolate", 8));
	}

	@Test
	public void testfrontBack0() {
		assertEquals("eodc", Strings.frontBack("code"));
		assertEquals("a", Strings.frontBack("a"));
		assertEquals("ba", Strings.frontBack("ab"));
		assertEquals("cba", Strings.frontBack("abc"));
		assertEquals("", Strings.frontBack(""));
		assertEquals("ehocolatC", Strings.frontBack("Chocolate"));
		assertEquals("Java", Strings.frontBack("aavJ"));
		assertEquals("oellh", Strings.frontBack("hello"));
	}

	@Test
	public void testfront3() {
		assertEquals("JavJavJav", Strings.front3("Java"));
		assertEquals("ChoChoCho", Strings.front3("Chocolate"));
		assertEquals("abcabcabc", Strings.front3("abc"));
		assertEquals("abcabcabc", Strings.front3("abcXYZ"));
		assertEquals("ababab", Strings.front3("ab"));
		assertEquals("aaa", Strings.front3("a"));
		assertEquals("", Strings.front3(""));
	}

	@Test
	public void testBackAround() {
		assertEquals("tcatt", Strings.backAround("cat"));
		assertEquals("oHelloo", Strings.backAround("Hello"));
		assertEquals("aaa", Strings.backAround("a"));
		assertEquals("cabcc", Strings.backAround("abc"));
		assertEquals("dreadd", Strings.backAround("read"));
		assertEquals("obooo", Strings.backAround("boo"));
	}

	@Test
	public void testfront22() {
		assertEquals("kikittenki", Strings.front22("kitten"));
		assertEquals("HaHaHa", Strings.front22("Ha"));
		assertEquals("ababcab", Strings.front22("abc"));
		assertEquals("ababab", Strings.front22("ab"));
		assertEquals("aaa", Strings.front22("a"));
		assertEquals("", Strings.front22(""));
		assertEquals("LoLogicLo", Strings.front22("Logic"));
	}

	@Test
	public void teststartHi() {
		assertTrue(Strings.startHi("hi there"));
		assertTrue(Strings.startHi("hi"));
		assertTrue(Strings.startHi("hi ho"));
		assertFalse(Strings.startHi("hello hi"));
		assertFalse(Strings.startHi("he"));
		assertFalse(Strings.startHi("h"));
		assertFalse(Strings.startHi(""));
		assertFalse(Strings.startHi("ho hi"));
	}

	@Test
	public void teststartOz() {
		assertEquals("oz", Strings.startOz("ozymandias"));
		assertEquals("z", Strings.startOz("bzoo"));
		assertEquals("o", Strings.startOz("oxx"));
		assertEquals("oz", Strings.startOz("oz"));
		assertEquals("o", Strings.startOz("ounce"));
		assertEquals("o", Strings.startOz("o"));
		assertEquals("", Strings.startOz("abc"));
		assertEquals("", Strings.startOz(""));
		assertEquals("", Strings.startOz("zoo"));
		assertEquals("z", Strings.startOz("aztec"));
		assertEquals("z", Strings.startOz("zzzz"));
		assertEquals("oz", Strings.startOz("oznic"));
	}
}
