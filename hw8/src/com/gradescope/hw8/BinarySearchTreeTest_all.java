package com.gradescope.hw8;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class BinarySearchTreeTest_all {

	/********************
	 * constructors
	 ********************/

	@Test
	@SuppressWarnings("unused")
	public void testConstructors() {
		// only checking for compile and runtime errors
		Map<String, String> mapStrStr = new BinarySearchTree<String, String>();
		Map<Integer, Object> mapIntOb = new BinarySearchTree<Integer, Object>();
		Map<Date, int[]> mapDateIntAr = new BinarySearchTree<Date, int[]>();
	}

	/********************
	 * isEmpty
	 ********************/

	@Test
	public void testIsEmpty_tree0() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree0();
		assertTrue(tree.isEmpty());
	}

	@Test
	public void testIsEmpty_tree1() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree1();
		assertFalse(tree.isEmpty());
	}

	/********************
	 * size
	 ********************/

	@Test
	public void testSize_tree0() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree0();
		assertEquals(0, tree.size());
	}

	@Test
	public void testSize_tree1() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree1();
		assertEquals(1, tree.size());
	}

	@Test
	public void testSize_tree1_update() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree1();
		tree.put(Integer.valueOf(42), "Prof Dodds");
		assertEquals(1, tree.size());
	}

	@Test
	public void testSize_tree2right() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree2right();
		assertEquals(2, tree.size());
	}

	@Test
	public void testSize_tree2left() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree2left();
		assertEquals(2, tree.size());
	}

	@Test
	public void testSize_tree3() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree3();
		assertEquals(3, tree.size());
	}

	@Test
	public void testSize_tree4a() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree4a();
		assertEquals(4, tree.size());
	}

	@Test
	public void testSize_4b() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree4b();
		assertEquals(4, tree.size());
	}

	@Test
	public void testSize_tree4c() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree4c();
		assertEquals(4, tree.size());
	}

	@Test
	public void testSize_tree4d() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree4d();
		assertEquals(4, tree.size());
	}

	@Test
	public void testSize_tree7() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree7();
		assertEquals(7, tree.size());
	}

	/********************
	 * height
	 ********************/

	@Test
	public void testHeight_tree0() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree0();
		assertEquals(-1, tree.height());
	}

	@Test
	public void testHeight_tree1() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree1();
		assertEquals(0, tree.height());
	}

	@Test
	public void testHeight_tree2right() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree2right();
		assertEquals(1, tree.height());
	}

	@Test
	public void testHeight_tree2left() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree2left();
		assertEquals(1, tree.height());
	}

	@Test
	public void testHeight_tree3() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree3();
		assertEquals(1, tree.height());
	}

	@Test
	public void testHeight_tree4a() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree4a();
		assertEquals(2, tree.height());
	}

	@Test
	public void testHeight_tree4b() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree4b();
		assertEquals(2, tree.height());
	}

	@Test
	public void testHeight_tree4c() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree4c();
		assertEquals(2, tree.height());
	}

	@Test
	public void testHeight_tree4d() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree4d();
		assertEquals(2, tree.height());
	}

	@Test
	public void testHeight_tree7() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree7();
		assertEquals(2, tree.height());
	}

	/********************
	 * containsKey
	 ********************/

	@Test
	public void testContainsKey_tree0() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree0();
		assertFalse(tree.containsKey(Integer.valueOf(10)));
		assertFalse(tree.containsKey(Integer.valueOf(18)));
		assertFalse(tree.containsKey(Integer.valueOf(26)));
		assertFalse(tree.containsKey(Integer.valueOf(30)));
		assertFalse(tree.containsKey(Integer.valueOf(42)));
		assertFalse(tree.containsKey(Integer.valueOf(45)));
		assertFalse(tree.containsKey(Integer.valueOf(52)));
		assertFalse(tree.containsKey(Integer.valueOf(60)));
		assertFalse(tree.containsKey(Integer.valueOf(90)));
	}

	@Test
	public void testContainsKey_tree1() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree1();
		assertFalse(tree.containsKey(Integer.valueOf(10)));
		assertFalse(tree.containsKey(Integer.valueOf(18)));
		assertFalse(tree.containsKey(Integer.valueOf(26)));
		assertFalse(tree.containsKey(Integer.valueOf(30)));
		assertTrue(tree.containsKey(Integer.valueOf(42)));
		assertFalse(tree.containsKey(Integer.valueOf(45)));
		assertFalse(tree.containsKey(Integer.valueOf(52)));
		assertFalse(tree.containsKey(Integer.valueOf(60)));
		assertFalse(tree.containsKey(Integer.valueOf(90)));
	}

	@Test
	public void testContainsKey_tree2right() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree2right();
		assertFalse(tree.containsKey(Integer.valueOf(10)));
		assertFalse(tree.containsKey(Integer.valueOf(18)));
		assertFalse(tree.containsKey(Integer.valueOf(26)));
		assertFalse(tree.containsKey(Integer.valueOf(30)));
		assertTrue(tree.containsKey(Integer.valueOf(42)));
		assertFalse(tree.containsKey(Integer.valueOf(45)));
		assertTrue(tree.containsKey(Integer.valueOf(52)));
		assertFalse(tree.containsKey(Integer.valueOf(60)));
		assertFalse(tree.containsKey(Integer.valueOf(90)));
	}

	@Test
	public void testContainsKey_tree2left() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree2left();
		assertFalse(tree.containsKey(Integer.valueOf(10)));
		assertFalse(tree.containsKey(Integer.valueOf(18)));
		assertTrue(tree.containsKey(Integer.valueOf(26)));
		assertFalse(tree.containsKey(Integer.valueOf(30)));
		assertTrue(tree.containsKey(Integer.valueOf(42)));
		assertFalse(tree.containsKey(Integer.valueOf(45)));
		assertFalse(tree.containsKey(Integer.valueOf(52)));
		assertFalse(tree.containsKey(Integer.valueOf(60)));
		assertFalse(tree.containsKey(Integer.valueOf(90)));
	}

	@Test
	public void testContainsKey_tree3() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree3();
		assertFalse(tree.containsKey(Integer.valueOf(10)));
		assertFalse(tree.containsKey(Integer.valueOf(18)));
		assertTrue(tree.containsKey(Integer.valueOf(26)));
		assertFalse(tree.containsKey(Integer.valueOf(30)));
		assertTrue(tree.containsKey(Integer.valueOf(42)));
		assertFalse(tree.containsKey(Integer.valueOf(45)));
		assertTrue(tree.containsKey(Integer.valueOf(52)));
		assertFalse(tree.containsKey(Integer.valueOf(60)));
		assertFalse(tree.containsKey(Integer.valueOf(90)));
	}

	@Test
	public void testContainsKey_tree4a() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree4a();
		assertFalse(tree.containsKey(Integer.valueOf(10)));
		assertTrue(tree.containsKey(Integer.valueOf(18)));
		assertTrue(tree.containsKey(Integer.valueOf(26)));
		assertFalse(tree.containsKey(Integer.valueOf(30)));
		assertTrue(tree.containsKey(Integer.valueOf(42)));
		assertFalse(tree.containsKey(Integer.valueOf(45)));
		assertTrue(tree.containsKey(Integer.valueOf(52)));
		assertFalse(tree.containsKey(Integer.valueOf(60)));
		assertFalse(tree.containsKey(Integer.valueOf(90)));
	}

	@Test
	public void testContainsKey_tree4b() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree4b();
		assertFalse(tree.containsKey(Integer.valueOf(10)));
		assertFalse(tree.containsKey(Integer.valueOf(18)));
		assertTrue(tree.containsKey(Integer.valueOf(26)));
		assertTrue(tree.containsKey(Integer.valueOf(30)));
		assertTrue(tree.containsKey(Integer.valueOf(42)));
		assertFalse(tree.containsKey(Integer.valueOf(45)));
		assertTrue(tree.containsKey(Integer.valueOf(52)));
		assertFalse(tree.containsKey(Integer.valueOf(60)));
		assertFalse(tree.containsKey(Integer.valueOf(90)));
	}

	@Test
	public void testContainsKey_tree4c() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree4c();
		assertFalse(tree.containsKey(Integer.valueOf(10)));
		assertFalse(tree.containsKey(Integer.valueOf(18)));
		assertTrue(tree.containsKey(Integer.valueOf(26)));
		assertFalse(tree.containsKey(Integer.valueOf(30)));
		assertTrue(tree.containsKey(Integer.valueOf(42)));
		assertTrue(tree.containsKey(Integer.valueOf(45)));
		assertTrue(tree.containsKey(Integer.valueOf(52)));
		assertFalse(tree.containsKey(Integer.valueOf(60)));
		assertFalse(tree.containsKey(Integer.valueOf(90)));
	}

	@Test
	public void testContainsKey_tree4d() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree4d();
		assertFalse(tree.containsKey(Integer.valueOf(10)));
		assertFalse(tree.containsKey(Integer.valueOf(18)));
		assertTrue(tree.containsKey(Integer.valueOf(26)));
		assertFalse(tree.containsKey(Integer.valueOf(30)));
		assertTrue(tree.containsKey(Integer.valueOf(42)));
		assertFalse(tree.containsKey(Integer.valueOf(45)));
		assertTrue(tree.containsKey(Integer.valueOf(52)));
		assertTrue(tree.containsKey(Integer.valueOf(60)));
		assertFalse(tree.containsKey(Integer.valueOf(90)));
	}

	@Test
	public void testContainsKey_tree7() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree7();
		assertFalse(tree.containsKey(Integer.valueOf(10)));
		assertTrue(tree.containsKey(Integer.valueOf(18)));
		assertTrue(tree.containsKey(Integer.valueOf(26)));
		assertTrue(tree.containsKey(Integer.valueOf(30)));
		assertTrue(tree.containsKey(Integer.valueOf(42)));
		assertTrue(tree.containsKey(Integer.valueOf(45)));
		assertTrue(tree.containsKey(Integer.valueOf(52)));
		assertTrue(tree.containsKey(Integer.valueOf(60)));
		assertFalse(tree.containsKey(Integer.valueOf(90)));
	}

	/********************
	 * get
	 ********************/

	@Test
	public void testGet_tree0() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree0();
		assertEquals(null, tree.get(Integer.valueOf(42)));
	}

	@Test
	public void testGet_tree1() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree1();
		assertEquals("Dodds", tree.get(Integer.valueOf(42)));
	}

	@Test
	public void testGet_tree2right() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree2right();
		assertEquals("Dodds", tree.get(Integer.valueOf(42)));
		assertEquals("Colleen", tree.get(Integer.valueOf(52)));
	}

	@Test
	public void testGet_tree2left() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree2left();
		assertEquals("Ben", tree.get(Integer.valueOf(26)));
		assertEquals("Dodds", tree.get(Integer.valueOf(42)));
	}

	@Test
	public void testGet_tree3() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree3();
		assertEquals("Ben", tree.get(Integer.valueOf(26)));
		assertEquals("Dodds", tree.get(Integer.valueOf(42)));
		assertEquals("Colleen", tree.get(Integer.valueOf(52)));
	}

	@Test
	public void testGet_tree4a() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree4a();
		assertEquals("Beth", tree.get(Integer.valueOf(18)));
		assertEquals("Ben", tree.get(Integer.valueOf(26)));
		assertEquals("Dodds", tree.get(Integer.valueOf(42)));
		assertEquals("Colleen", tree.get(Integer.valueOf(52)));
	}

	@Test
	public void testGet_tree4b() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree4b();
		assertEquals("Ben", tree.get(Integer.valueOf(26)));
		assertEquals("Stone", tree.get(Integer.valueOf(30)));
		assertEquals("Dodds", tree.get(Integer.valueOf(42)));
		assertEquals("Colleen", tree.get(Integer.valueOf(52)));
	}

	@Test
	public void testGet_tree4c() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree4c();
		assertEquals("Ben", tree.get(Integer.valueOf(26)));
		assertEquals("Dodds", tree.get(Integer.valueOf(42)));
		assertEquals("Julie", tree.get(Integer.valueOf(45)));
		assertEquals("Colleen", tree.get(Integer.valueOf(52)));
	}

	@Test
	public void testGet_tree4d() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree4d();
		assertEquals("Ben", tree.get(Integer.valueOf(26)));
		assertEquals("Dodds", tree.get(Integer.valueOf(42)));
		assertEquals("Colleen", tree.get(Integer.valueOf(52)));
		assertEquals("Ran", tree.get(Integer.valueOf(60)));
	}

	@Test
	public void testGet_tree7() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree7();
		assertEquals("Beth", tree.get(Integer.valueOf(18)));
		assertEquals("Ben", tree.get(Integer.valueOf(26)));
		assertEquals("Stone", tree.get(Integer.valueOf(30)));
		assertEquals("Dodds", tree.get(Integer.valueOf(42)));
		assertEquals("Julie", tree.get(Integer.valueOf(45)));
		assertEquals("Colleen", tree.get(Integer.valueOf(52)));
		assertEquals("Ran", tree.get(Integer.valueOf(60)));
	}

	/********************
	 * clear
	 ********************/

	@Test
	public void testClear_tree0() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree0();
		assertEquals(0, tree.size());
		tree.clear();
		assertEquals(0, tree.size());
	}

	@Test
	public void testClear_tree1() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree1();
		assertEquals(1, tree.size());
		tree.clear();
		assertEquals(0, tree.size());
	}

	@Test
	public void testClear_tree2right() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree2right();
		assertEquals(2, tree.size());
		tree.clear();
		assertEquals(0, tree.size());
	}

	@Test
	public void testClear_tree2left() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree2left();
		assertEquals(2, tree.size());
		tree.clear();
		assertEquals(0, tree.size());
	}

	/********************
	 * put
	 ********************/

	@Test
	public void testPut_checkReturn() {
		BinarySearchTree<Integer, String> tree = new BinarySearchTree<Integer, String>();
		assertNull(tree.put(Integer.valueOf(42), "Dodds"));
		assertNull(tree.put(Integer.valueOf(26), "Ben"));
		assertNull(tree.put(Integer.valueOf(52), "Colleen"));
		assertNull(tree.put(Integer.valueOf(60), "Ran"));
		assertNull(tree.put(Integer.valueOf(18), "Beth"));
		assertNull(tree.put(Integer.valueOf(45), "Julie"));
		assertNull(tree.put(Integer.valueOf(30), "Stone"));
	}

	/********************
	 * putAll
	 ********************/

	@Test
	public void testPutAll_tree7() {
		// we do not have a guarantee of the structure when using putAll
		Map<Integer, String> otherMap = new HashMap<Integer, String>();
		otherMap.put(Integer.valueOf(42), "Dodds");
		otherMap.put(Integer.valueOf(26), "Ben");
		otherMap.put(Integer.valueOf(52), "Colleen");
		otherMap.put(Integer.valueOf(60), "Ran");
		otherMap.put(Integer.valueOf(18), "Beth");
		otherMap.put(Integer.valueOf(45), "Julie");
		otherMap.put(Integer.valueOf(30), "Stone");

		BinarySearchTree<Integer, String> tree = new BinarySearchTree<Integer, String>();
		tree.putAll(otherMap);
		assertFalse(tree.containsKey(Integer.valueOf(10)));
		assertTrue(tree.containsKey(Integer.valueOf(18)));
		assertTrue(tree.containsKey(Integer.valueOf(26)));
		assertTrue(tree.containsKey(Integer.valueOf(30)));
		assertTrue(tree.containsKey(Integer.valueOf(42)));
		assertTrue(tree.containsKey(Integer.valueOf(45)));
		assertTrue(tree.containsKey(Integer.valueOf(52)));
		assertTrue(tree.containsKey(Integer.valueOf(60)));
		assertFalse(tree.containsKey(Integer.valueOf(90)));
	}

	/********************
	 * getMinKey
	 ********************/

	@Test(expected = IllegalArgumentException.class)
	public void testGetMinKey_tree0() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree0();
		tree.getMinKey(); // should produce an error!
	}

	@Test
	public void testGetMinKey_tree1() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree1();
		assertEquals(Integer.valueOf(42), tree.getMinKey());
	}

	@Test
	public void testGetMinKey_tree1_swap() {
		// same test as getMinKey1 but the key and values swapped
		BinarySearchTree<String, Integer> tree = new BinarySearchTree<String, Integer>();
		tree.put("Dodds", Integer.valueOf(42));
		assertEquals("Dodds", tree.getMinKey());
	}

	@Test
	public void testGetMinKey_tree2right() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree2right();
		assertEquals(Integer.valueOf(42), tree.getMinKey());
	}

	@Test
	public void testGetMinKey_tree2left() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree2left();
		assertEquals(Integer.valueOf(26), tree.getMinKey());
	}

	@Test
	public void testGetMinKey_tree3() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree3();
		assertEquals(Integer.valueOf(26), tree.getMinKey());
	}

	@Test
	public void testGetMinKey_tree4a() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree4a();
		assertEquals(Integer.valueOf(18), tree.getMinKey());
	}

	@Test
	public void testGetMinKey_tree4b() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree4b();
		assertEquals(Integer.valueOf(26), tree.getMinKey());
	}

	@Test
	public void testGetMinKey_tree4c() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree4c();
		assertEquals(Integer.valueOf(26), tree.getMinKey());
	}

	@Test
	public void testGetMinKey_tree4d() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree4d();
		assertEquals(Integer.valueOf(26), tree.getMinKey());
	}

	@Test
	public void testGetMinKey_tree7() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree7();
		assertEquals(Integer.valueOf(18), tree.getMinKey());
	}

	/********************
	 * toString
	 ********************/

	@Test
	public void testToString_tree0() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree0();
		assertEquals("[]", tree.toString());
	}

	@Test
	public void testToString_tree1() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree1();
		assertEquals("[42]", tree.toString());
	}

	@Test
	public void testToString_tree2right() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree2right();
		assertEquals("[42, 52]", tree.toString());
	}

	@Test
	public void testToString_tree2left() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree2left();
		assertEquals("[26, 42]", tree.toString());
	}

	@Test
	public void testToString_tree3() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree3();
		assertEquals("[26, 42, 52]", tree.toString());
	}

	@Test
	public void testToString_tree4a() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree4a();
		assertEquals("[18, 26, 42, 52]", tree.toString());
	}

	@Test
	public void testToString_tree4b() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree4b();
		assertEquals("[26, 30, 42, 52]", tree.toString());
	}

	@Test
	public void testToString_tree4c() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree4c();
		assertEquals("[26, 42, 45, 52]", tree.toString());
	}

	@Test
	public void testToString_tree4d() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree4d();
		assertEquals("[26, 42, 52, 60]", tree.toString());
	}

	@Test
	public void testToString_tree7() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree7();
		assertEquals("[18, 26, 30, 42, 45, 52, 60]", tree.toString());
	}

	/********************
	 * containsValue
	 ********************/

	@Test
	public void testContainsValue_tree0() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree0();
		assertFalse(tree.containsValue("Dodds"));
		assertFalse(tree.containsValue("Ben"));
		assertFalse(tree.containsValue("Colleen"));
		assertFalse(tree.containsValue("Ran"));
		assertFalse(tree.containsValue("Beth"));
		assertFalse(tree.containsValue("Julie"));
		assertFalse(tree.containsValue("Stone"));
		assertFalse(tree.containsValue("Breeden"));
		assertFalse(tree.containsValue("Wu"));
	}

	@Test
	public void testContainsValue_tree1() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree1();
		assertTrue(tree.containsValue("Dodds"));
		assertFalse(tree.containsValue("Ben"));
		assertFalse(tree.containsValue("Colleen"));
		assertFalse(tree.containsValue("Ran"));
		assertFalse(tree.containsValue("Beth"));
		assertFalse(tree.containsValue("Julie"));
		assertFalse(tree.containsValue("Stone"));
		assertFalse(tree.containsValue("Breeden"));
		assertFalse(tree.containsValue("Wu"));
	}

	@Test
	public void testContainsValue_tree2right() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree2right();
		assertTrue(tree.containsValue("Dodds"));
		assertFalse(tree.containsValue("Ben"));
		assertTrue(tree.containsValue("Colleen"));
		assertFalse(tree.containsValue("Ran"));
		assertFalse(tree.containsValue("Beth"));
		assertFalse(tree.containsValue("Julie"));
		assertFalse(tree.containsValue("Stone"));
		assertFalse(tree.containsValue("Breeden"));
		assertFalse(tree.containsValue("Wu"));
	}

	@Test
	public void testContainsValue_tree2left() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree2left();
		assertTrue(tree.containsValue("Dodds"));
		assertTrue(tree.containsValue("Ben"));
		assertFalse(tree.containsValue("Colleen"));
		assertFalse(tree.containsValue("Ran"));
		assertFalse(tree.containsValue("Beth"));
		assertFalse(tree.containsValue("Julie"));
		assertFalse(tree.containsValue("Stone"));
		assertFalse(tree.containsValue("Breeden"));
		assertFalse(tree.containsValue("Wu"));
	}

	@Test
	public void testContainsValue_tree3() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree3();
		assertTrue(tree.containsValue("Dodds"));
		assertTrue(tree.containsValue("Ben"));
		assertTrue(tree.containsValue("Colleen"));
		assertFalse(tree.containsValue("Ran"));
		assertFalse(tree.containsValue("Beth"));
		assertFalse(tree.containsValue("Julie"));
		assertFalse(tree.containsValue("Stone"));
		assertFalse(tree.containsValue("Breeden"));
		assertFalse(tree.containsValue("Wu"));
	}

	@Test
	public void testContainsValue_tree4a() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree4a();
		assertTrue(tree.containsValue("Dodds"));
		assertTrue(tree.containsValue("Ben"));
		assertTrue(tree.containsValue("Colleen"));
		assertFalse(tree.containsValue("Ran"));
		assertTrue(tree.containsValue("Beth"));
		assertFalse(tree.containsValue("Julie"));
		assertFalse(tree.containsValue("Stone"));
		assertFalse(tree.containsValue("Breeden"));
		assertFalse(tree.containsValue("Wu"));
	}

	@Test
	public void testContainsValue_tree4b() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree4b();
		assertTrue(tree.containsValue("Dodds"));
		assertTrue(tree.containsValue("Ben"));
		assertTrue(tree.containsValue("Colleen"));
		assertFalse(tree.containsValue("Ran"));
		assertFalse(tree.containsValue("Beth"));
		assertFalse(tree.containsValue("Julie"));
		assertTrue(tree.containsValue("Stone"));
		assertFalse(tree.containsValue("Breeden"));
		assertFalse(tree.containsValue("Wu"));
	}

	@Test
	public void testContainsValue_tree4c() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree4c();
		assertTrue(tree.containsValue("Dodds"));
		assertTrue(tree.containsValue("Ben"));
		assertTrue(tree.containsValue("Colleen"));
		assertFalse(tree.containsValue("Ran"));
		assertFalse(tree.containsValue("Beth"));
		assertTrue(tree.containsValue("Julie"));
		assertFalse(tree.containsValue("Stone"));
		assertFalse(tree.containsValue("Breeden"));
		assertFalse(tree.containsValue("Wu"));
	}

	@Test
	public void testContainsValue_tree4d() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree4d();
		assertTrue(tree.containsValue("Dodds"));
		assertTrue(tree.containsValue("Ben"));
		assertTrue(tree.containsValue("Colleen"));
		assertTrue(tree.containsValue("Ran"));
		assertFalse(tree.containsValue("Beth"));
		assertFalse(tree.containsValue("Julie"));
		assertFalse(tree.containsValue("Stone"));
		assertFalse(tree.containsValue("Breeden"));
		assertFalse(tree.containsValue("Wu"));
	}

	@Test
	public void testContainsValue_tree7() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree7();
		assertTrue(tree.containsValue("Dodds"));
		assertTrue(tree.containsValue("Ben"));
		assertTrue(tree.containsValue("Colleen"));
		assertTrue(tree.containsValue("Ran"));
		assertTrue(tree.containsValue("Beth"));
		assertTrue(tree.containsValue("Julie"));
		assertTrue(tree.containsValue("Stone"));
		assertFalse(tree.containsValue("Breeden"));
		assertFalse(tree.containsValue("Wu"));
	}

	/********************
	 * put that updates value
	 ********************/

	@Test
	public void testPut_tree1_replace() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree1();
		assertEquals("Dodds", tree.get(Integer.valueOf(42)));

		// replace "Dodds" with "Beth" as the value for 42
		assertEquals("Dodds", tree.put(Integer.valueOf(42), "Beth"));
		assertEquals("Beth", tree.get(Integer.valueOf(42)));
		assertFalse(tree.containsValue("Dodds"));
		assertTrue(tree.containsValue("Beth"));
	}

	@Test
	public void testPut_tree2right_replace() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree2right();
		assertEquals("Colleen", tree.get(Integer.valueOf(52)));

		// replace "Colleen" with "Julie" as the value for 52
		assertEquals("Colleen", tree.put(Integer.valueOf(52), "Julie"));
		assertEquals("Julie", tree.get(Integer.valueOf(52)));
		assertFalse(tree.containsValue("Colleen"));
		assertTrue(tree.containsValue("Julie"));
	}

	@Test
	public void testPut_tree2left_replace() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree2left();
		assertEquals("Ben", tree.get(Integer.valueOf(26)));

		// replace "Ben" with "Colleen" as the value for 26
		assertEquals("Ben", tree.put(Integer.valueOf(26), "Colleen"));
		assertEquals("Colleen", tree.get(Integer.valueOf(26)));
		assertFalse(tree.containsValue("Ben"));
		assertTrue(tree.containsValue("Colleen"));
	}

	@Test
	public void testPut_tree3_replace() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree3();
		assertEquals("Ben", tree.get(Integer.valueOf(26)));

		// replace "Ben" with "Colleen" as the value for 26
		assertEquals("Ben", tree.put(Integer.valueOf(26), "Colleen"));
		assertEquals("Colleen", tree.get(Integer.valueOf(26)));
		assertFalse(tree.containsValue("Ben"));
		assertTrue(tree.containsValue("Colleen"));
	}

	@Test
	public void testPut_tree4a_replace() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree4a();
		assertEquals("Beth", tree.get(Integer.valueOf(18)));

		// replace "Beth" with "Julie" as the value for 18
		assertEquals("Beth", tree.put(Integer.valueOf(18), "Julie"));
		assertEquals("Julie", tree.get(Integer.valueOf(18)));
		assertFalse(tree.containsValue("Beth"));
		assertTrue(tree.containsValue("Julie"));
	}

	@Test
	public void testPut_tree4b_replace() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree4b();
		assertEquals("Stone", tree.get(Integer.valueOf(30)));

		// replace "Stone" with "Beth" as the value for 30
		assertEquals("Stone", tree.put(Integer.valueOf(30), "Beth"));
		assertEquals("Beth", tree.get(Integer.valueOf(30)));
		assertFalse(tree.containsValue("Stone"));
		assertTrue(tree.containsValue("Beth"));
	}

	@Test
	public void testPut_tree4c_replace() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree4c();
		assertEquals("Colleen", tree.get(Integer.valueOf(52)));

		// replace "Colleen" with "Julie" as the value for 52
		assertEquals("Colleen", tree.put(Integer.valueOf(52), "Julie"));
		assertEquals("Julie", tree.get(Integer.valueOf(52)));
		assertFalse(tree.containsValue("Colleen"));
		assertTrue(tree.containsValue("Julie"));
	}
	
	/********************
	 * remove
	 ********************/

	@Test
	public void testRemove_tree0() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree0();
		String value = tree.remove(Integer.valueOf(7));
		assertNull(value); // did not contain the previous key!
	}

	@Test
	public void testRemove_tree1_root() {
		// remove root in tree with 1 node
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree1();
		assertEquals("Dodds", tree.get(Integer.valueOf(42)));
		assertEquals(1, tree.size());

		assertEquals("Dodds", tree.remove(Integer.valueOf(42)));
		assertNull(tree.get(Integer.valueOf(42)));
		assertFalse(tree.containsKey(Integer.valueOf(42)));
		assertFalse(tree.containsValue("Dodds"));
		assertEquals(0, tree.size());
	}

	@Test
	public void testRemove_tree2right_root() {
		// remove root with only right subtree
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree2right();
		assertEquals("Dodds", tree.get(Integer.valueOf(42)));
		assertEquals("Colleen", tree.get(Integer.valueOf(52)));
		assertEquals(2, tree.size());

		assertEquals("Dodds", tree.remove(Integer.valueOf(42)));
		assertNull(tree.get(Integer.valueOf(42)));
		assertFalse(tree.containsKey(Integer.valueOf(42)));
		assertFalse(tree.containsValue("Dodds"));
		assertEquals("Colleen", tree.get(Integer.valueOf(52)));
		assertEquals(1, tree.size());
	}

	@Test
	public void testRemove_tree2left_root() {
		// remove root with only left subtree
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree2left();
		assertEquals("Ben", tree.get(Integer.valueOf(26)));
		assertEquals("Dodds", tree.get(Integer.valueOf(42)));
		assertEquals(2, tree.size());

		assertEquals("Dodds", tree.remove(Integer.valueOf(42)));
		assertNull(tree.get(Integer.valueOf(42)));
		assertFalse(tree.containsKey(Integer.valueOf(42)));
		assertFalse(tree.containsValue("Dodds"));
		assertEquals("Ben", tree.get(Integer.valueOf(26)));
		assertEquals(1, tree.size());
	}

	@Test
	public void testRemove_tree3_root() {
		// remove root with left and right subtrees
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree3();
		assertEquals("Ben", tree.get(Integer.valueOf(26)));
		assertEquals("Dodds", tree.get(Integer.valueOf(42)));
		assertEquals("Colleen", tree.get(Integer.valueOf(52)));
		assertEquals(3, tree.size());

		assertEquals("Dodds", tree.remove(Integer.valueOf(42)));
		assertNull(tree.get(Integer.valueOf(42)));
		assertFalse(tree.containsKey(Integer.valueOf(42)));
		assertFalse(tree.containsValue("Dodds"));
		assertEquals("Ben", tree.get(Integer.valueOf(26)));
		assertEquals("Colleen", tree.get(Integer.valueOf(52)));
		assertEquals(2, tree.size());
	}

	@Test
	public void testRemove_tree7_leftChild() {
		// remove left child node
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree7();
		assertEquals("Beth", tree.get(Integer.valueOf(18)));
		assertEquals("Ben", tree.get(Integer.valueOf(26)));
		assertEquals("Stone", tree.get(Integer.valueOf(30)));
		assertEquals("Dodds", tree.get(Integer.valueOf(42)));
		assertEquals("Julie", tree.get(Integer.valueOf(45)));
		assertEquals("Colleen", tree.get(Integer.valueOf(52)));
		assertEquals("Ran", tree.get(Integer.valueOf(60)));
		assertEquals(7, tree.size());

		assertEquals("Ben", tree.remove(Integer.valueOf(26)));
		assertNull(tree.get(Integer.valueOf(26)));
		assertFalse(tree.containsKey(Integer.valueOf(26)));
		assertFalse(tree.containsValue("Ben"));
		assertEquals("Beth", tree.get(Integer.valueOf(18)));
		assertEquals("Stone", tree.get(Integer.valueOf(30)));
		assertEquals("Dodds", tree.get(Integer.valueOf(42)));
		assertEquals("Julie", tree.get(Integer.valueOf(45)));
		assertEquals("Colleen", tree.get(Integer.valueOf(52)));
		assertEquals("Ran", tree.get(Integer.valueOf(60)));
		assertEquals(6, tree.size());
	}

	@Test
	public void testRemove_tree7_rightChild() {
		// remove right child node
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree7();
		assertEquals("Beth", tree.get(Integer.valueOf(18)));
		assertEquals("Ben", tree.get(Integer.valueOf(26)));
		assertEquals("Stone", tree.get(Integer.valueOf(30)));
		assertEquals("Dodds", tree.get(Integer.valueOf(42)));
		assertEquals("Julie", tree.get(Integer.valueOf(45)));
		assertEquals("Colleen", tree.get(Integer.valueOf(52)));
		assertEquals("Ran", tree.get(Integer.valueOf(60)));
		assertEquals(7, tree.size());

		assertEquals("Colleen", tree.remove(Integer.valueOf(52)));
		assertNull(tree.get(Integer.valueOf(52)));
		assertFalse(tree.containsKey(Integer.valueOf(52)));
		assertFalse(tree.containsValue("Colleen"));
		assertEquals("Beth", tree.get(Integer.valueOf(18)));
		assertEquals("Ben", tree.get(Integer.valueOf(26)));
		assertEquals("Stone", tree.get(Integer.valueOf(30)));
		assertEquals("Dodds", tree.get(Integer.valueOf(42)));
		assertEquals("Julie", tree.get(Integer.valueOf(45)));
		assertEquals("Ran", tree.get(Integer.valueOf(60)));
		assertEquals(6, tree.size());
	}

	@Test
	public void testRemove_tree7_none() {
		// remove keys not in tree
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree7();
		assertEquals("Beth", tree.get(Integer.valueOf(18)));
		assertEquals("Ben", tree.get(Integer.valueOf(26)));
		assertEquals("Stone", tree.get(Integer.valueOf(30)));
		assertEquals("Dodds", tree.get(Integer.valueOf(42)));
		assertEquals("Julie", tree.get(Integer.valueOf(45)));
		assertEquals("Colleen", tree.get(Integer.valueOf(52)));
		assertEquals("Ran", tree.get(Integer.valueOf(60)));
		assertEquals(7, tree.size());

		assertNull(tree.remove(Integer.valueOf(10)));
		assertNull(tree.remove(Integer.valueOf(22)));
		assertNull(tree.remove(Integer.valueOf(27)));
		assertNull(tree.remove(Integer.valueOf(34)));
		assertNull(tree.remove(Integer.valueOf(44)));
		assertNull(tree.remove(Integer.valueOf(47)));
		assertNull(tree.remove(Integer.valueOf(55)));
		assertNull(tree.remove(Integer.valueOf(65)));
		assertEquals(7, tree.size());
	}

	@Test
	public void testRemove_tree4leftUnbalancedLeft_root() {
		BinarySearchTree<Integer, String> tree = BinarySearchTreeTest_helper.makeTree4leftUnbalanced();
		assertEquals("Dodds", tree.get(Integer.valueOf(4)));
		assertEquals("Colleen", tree.get(Integer.valueOf(3)));
		assertEquals("Beth", tree.get(Integer.valueOf(2)));
		assertEquals("A Prof", tree.get(Integer.valueOf(1)));

		assertEquals("Dodds", tree.remove(Integer.valueOf(4)));
		assertNull(tree.get(Integer.valueOf(4)));
		assertEquals("Colleen", tree.get(Integer.valueOf(3)));
		assertEquals("Beth", tree.get(Integer.valueOf(2)));
		assertEquals("A Prof", tree.get(Integer.valueOf(1)));
	}

	@Test
	public void testRemove_tree4leftUnbalanced_child() {
		BinarySearchTree<Integer, String> tree = new BinarySearchTree<Integer, String>();
		tree.put(Integer.valueOf(4), "Dodds");
		tree.put(Integer.valueOf(3), "Colleen");
		tree.put(Integer.valueOf(2), "Beth");
		tree.put(Integer.valueOf(1), "A Prof");
		assertEquals("Dodds", tree.get(Integer.valueOf(4)));
		assertEquals("Colleen", tree.get(Integer.valueOf(3)));
		assertEquals("Beth", tree.get(Integer.valueOf(2)));
		assertEquals("A Prof", tree.get(Integer.valueOf(1)));

		assertEquals("Colleen", tree.remove(Integer.valueOf(3)));
		assertNull(tree.get(Integer.valueOf(3)));
		assertEquals("Dodds", tree.get(Integer.valueOf(4)));
		assertEquals("Beth", tree.get(Integer.valueOf(2)));
		assertEquals("A Prof", tree.get(Integer.valueOf(1)));
	}

	@Test
	public void testRemove_treeUnbalancedRight_root() {
		// Test tree:
		// ....1.........
		// ......2.......
		// ........3.....
		// ...........4..
		BinarySearchTree<Integer, String> tree = new BinarySearchTree<Integer, String>();
		tree.put(Integer.valueOf(1), "A Prof");
		tree.put(Integer.valueOf(2), "Beth");
		tree.put(Integer.valueOf(3), "Colleen");
		tree.put(Integer.valueOf(4), "Dodds");
		assertEquals("Dodds", tree.get(Integer.valueOf(4)));
		assertEquals("Colleen", tree.get(Integer.valueOf(3)));
		assertEquals("Beth", tree.get(Integer.valueOf(2)));
		assertEquals("A Prof", tree.get(Integer.valueOf(1)));

		assertEquals("A Prof", tree.remove(Integer.valueOf(1)));
		assertNull(tree.get(Integer.valueOf(1)));
		assertEquals("Beth", tree.get(Integer.valueOf(2)));
		assertEquals("Colleen", tree.get(Integer.valueOf(3)));
		assertEquals("Dodds", tree.get(Integer.valueOf(4)));
	}

	@Test
	public void testRemove_treeUnbalancedRight_child() {
		// Test tree:
		// ....1.........
		// ......2.......
		// ........3.....
		// ...........4..
		BinarySearchTree<Integer, String> tree = new BinarySearchTree<Integer, String>();
		tree.put(Integer.valueOf(1), "A Prof");
		tree.put(Integer.valueOf(2), "Beth");
		tree.put(Integer.valueOf(3), "Colleen");
		tree.put(Integer.valueOf(4), "Dodds");
		assertEquals("Dodds", tree.get(Integer.valueOf(4)));
		assertEquals("Colleen", tree.get(Integer.valueOf(3)));
		assertEquals("Beth", tree.get(Integer.valueOf(2)));
		assertEquals("A Prof", tree.get(Integer.valueOf(1)));

		assertEquals("Colleen", tree.remove(Integer.valueOf(3)));
		assertNull(tree.get(Integer.valueOf(3)));
		assertEquals("Dodds", tree.get(Integer.valueOf(4)));
		assertEquals("Beth", tree.get(Integer.valueOf(2)));
		assertEquals("A Prof", tree.get(Integer.valueOf(1)));
	}

}
