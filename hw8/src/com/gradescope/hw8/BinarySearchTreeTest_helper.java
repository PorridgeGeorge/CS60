package com.gradescope.hw8;

public class BinarySearchTreeTest_helper {
	/********************
	 * trees to test
	 ********************/

	protected static BinarySearchTree<Integer, String> makeTree0() {
		// empty tree
		BinarySearchTree<Integer, String> tree = new BinarySearchTree<Integer, String>();
		return tree;
	}

	protected static BinarySearchTree<Integer, String> makeTree1() {
		// ..... 42 .....
		BinarySearchTree<Integer, String> tree = new BinarySearchTree<Integer, String>();
		tree.put(Integer.valueOf(42), "Dodds");
		return tree;
	}

	protected static BinarySearchTree<Integer, String> makeTree2right() {
		// ..... 42 .....
		// ....... \ ....
		// ........ 52 ..
		BinarySearchTree<Integer, String> tree = new BinarySearchTree<Integer, String>();
		tree.put(Integer.valueOf(42), "Dodds");
		tree.put(Integer.valueOf(52), "Colleen");
		return tree;
	}

	protected static BinarySearchTree<Integer, String> makeTree2left() {
		// ..... 42 .....
		// .... / .......
		// .. 26 ........
		BinarySearchTree<Integer, String> tree = new BinarySearchTree<Integer, String>();
		tree.put(Integer.valueOf(42), "Dodds");
		tree.put(Integer.valueOf(26), "Ben");
		return tree;
	}

	protected static BinarySearchTree<Integer, String> makeTree3() {
		// ..... 42 .....
		// .... /..\ ....
		// .. 26 .. 52 ..
		BinarySearchTree<Integer, String> tree = new BinarySearchTree<Integer, String>();
		tree.put(Integer.valueOf(42), "Dodds");
		tree.put(Integer.valueOf(26), "Ben");
		tree.put(Integer.valueOf(52), "Colleen");
		return tree;
	}

	protected static BinarySearchTree<Integer, String> makeTree4a() {
		// ..... 42 .....
		// .... /..\ ....
		// .. 26 .. 52 ..
		// . / ..........
		// 18 ...........
		BinarySearchTree<Integer, String> tree = new BinarySearchTree<Integer, String>();
		tree.put(Integer.valueOf(42), "Dodds");
		tree.put(Integer.valueOf(26), "Ben");
		tree.put(Integer.valueOf(52), "Colleen");
		tree.put(Integer.valueOf(18), "Beth");
		return tree;
	}

	protected static BinarySearchTree<Integer, String> makeTree4b() {
		// ..... 42 .....
		// .... /..\ ....
		// .. 26 .. 52 ..
		// .... \ .......
		// ..... 30 .....
		BinarySearchTree<Integer, String> tree = new BinarySearchTree<Integer, String>();
		tree.put(Integer.valueOf(42), "Dodds");
		tree.put(Integer.valueOf(26), "Ben");
		tree.put(Integer.valueOf(52), "Colleen");
		tree.put(Integer.valueOf(30), "Stone");
		return tree;
	}

	protected static BinarySearchTree<Integer, String> makeTree4c() {
		// ..... 42 .....
		// .... /..\ ....
		// .. 26 .. 52 ..
		// ....... / ....
		// ..... 45 .....
		BinarySearchTree<Integer, String> tree = new BinarySearchTree<Integer, String>();
		tree.put(Integer.valueOf(42), "Dodds");
		tree.put(Integer.valueOf(26), "Ben");
		tree.put(Integer.valueOf(52), "Colleen");
		tree.put(Integer.valueOf(45), "Julie");
		return tree;
	}

	protected static BinarySearchTree<Integer, String> makeTree4d() {
		// ..... 42 .....
		// .... /..\ ....
		// .. 26 .. 52 ..
		// .......... \ .
		// ........... 60
		BinarySearchTree<Integer, String> tree = new BinarySearchTree<Integer, String>();
		tree.put(Integer.valueOf(42), "Dodds");
		tree.put(Integer.valueOf(26), "Ben");
		tree.put(Integer.valueOf(52), "Colleen");
		tree.put(Integer.valueOf(60), "Ran");
		return tree;
	}

	protected static BinarySearchTree<Integer, String> makeTree7() {
		// ...... 42 ......
		// ..... /..\ .....
		// ... 26 .. 52 ...
		// .. /..\../..\ ..
		// ..18.30..45.60..
		BinarySearchTree<Integer, String> tree = new BinarySearchTree<Integer, String>();
		tree.put(Integer.valueOf(42), "Dodds");
		tree.put(Integer.valueOf(26), "Ben");
		tree.put(Integer.valueOf(52), "Colleen");
		tree.put(Integer.valueOf(60), "Ran");
		tree.put(Integer.valueOf(18), "Beth");
		tree.put(Integer.valueOf(45), "Julie");
		tree.put(Integer.valueOf(30), "Stone");
		return tree;
	}

	protected static BinarySearchTree<Integer, String> makeTree4leftUnbalanced() {
		// ...... 4 ......
		// ..... / .......
		// .... 3 ........
		// ... / .........
		// .. 2 ..........
		// . / ...........
		// .1 ............
		BinarySearchTree<Integer, String> tree = new BinarySearchTree<Integer, String>();
		tree.put(Integer.valueOf(4), "Dodds");
		tree.put(Integer.valueOf(3), "Colleen");
		tree.put(Integer.valueOf(2), "Beth");
		tree.put(Integer.valueOf(1), "A Prof");
		return tree;
	}

}
