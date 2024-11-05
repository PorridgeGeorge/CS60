package com.gradescope.hw8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * An unbalanced binary search tree, which implements the Map interface (i.e.
 * maps keys to values). The map is sorted according to the natural ordering of
 * its keys (as defined by the Comparable interface).
 */
public class BinarySearchTree<KeyType extends Comparable<KeyType>, ValueType> implements Map<KeyType, ValueType> {

	private BSTNode root;
	private int size;

	/**
	 * Constructs an empty binary search tree
	 */
	public BinarySearchTree() {
		root = null;
		this.size = 0;
	}

	/**
	 * A node in a binary search tree that contains a key, a value, and references
	 * to the left and right nodes.
	 */
	private class BSTNode {
		// NOTE: BSTNode has only fields and constructors
		private KeyType key;
		private ValueType value;
		private BSTNode left;
		private BSTNode right;

		private BSTNode(KeyType key, ValueType value) {
			if (key == null || value == null) {
				throw new IllegalArgumentException("Inserted keys and values must be non-null");
			}
			this.key = key;
			this.value = value;
		}

		private BSTNode(KeyType key, ValueType value, BSTNode leftTree, BSTNode rightTree) {
			if (key == null || value == null) {
				throw new IllegalArgumentException("Inserted keys and values must be non-null");
			}
			this.key = key;
			this.value = value;
			this.left = leftTree;
			this.right = rightTree;
		}
	}

	////////////////////////////////////////////////////////////////////
	// Query Operations
	// Methods: isEmpty, size, height, containsKey, containsValue, get, getMinKey
	////////////////////////////////////////////////////////////////////

	/**
	 * Returns true if this binary search tree contains no items.
	 * 
	 * @return true if this collection contains no elements
	 */
	public boolean isEmpty() {
		return root == null;
	}

	/**
	 * @see java.util.Map#size()
	 */
	@Override
	public int size() {
		return this.size;
	}

	/**
	 * Returns the number of key-value mappings for the subtree rooted at root.
	 * 
	 * @return the number of key-value mappings in the map rooted at root.
	 */
	private int size(BSTNode root) {
		if (root == null) {
			return 0;
		} else {
			return 1 + size(root.left) + size(root.right);
		}
	}

	/**
	 * Returns the height of this tree.
	 * 
	 * The height is defined as the number of edges on the longest path from the
	 * root to a leaf. The height of an empty tree is -1.
	 * 
	 * @return the height of this tree
	 */
	public int height() {
		return height(root);
	}

	/**
	 * Returns the height in a subtree.
	 * 
	 * @param root - root of the tree
	 * @return the height of the tree rooted at root
	 */
	private int height(BSTNode root) {
		if (root == null) {
			return -1;
		}

		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		return 1 + Math.max(leftHeight, rightHeight);
	}

	/**
	 * @see java.util.Map#containsKey(java.lang.Object)
	 */
	@Override
	public boolean containsKey(Object key) {
		return get(key) != null;
	}

	/**
	 * @see java.util.Map#containsValue(java.lang.Object)
	 */
	public boolean containsValue(Object value) {
		// search through all keys
		for (KeyType key : getAllKeysInOrder()) {
			ValueType rootValue = get(key);
			if (rootValue.equals(value)) {
				return true;
			}
		}

		return false; // key not found
	}

	/**
	 * @see java.util.Map#get(java.lang.Object)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public ValueType get(Object key) {
		return get((KeyType) key, root);
	}

	/**
	 * Returns the value to which the specified key is mapped in a subtree.
	 * 
	 * @param key  - key whose associated value is to be returned
	 * @param root - root of the tree to search
	 * @return the value to which the specified key is mapped, or null if this map
	 *         contains no mapping for the key
	 */
	private ValueType get(KeyType key, BSTNode root) {
		// base case - empty tree: return null
		if (root == null) {
			return null;
		}

		KeyType rootKey = root.key;

		// base case - found key at root: return associated value
		if (key.equals(rootKey)) {
			return root.value;
		}

		// key < rootKey: search the left subtree
		if (inOrderKeys(key, rootKey)) {
			return get(key, root.left);
		}

		// rootKey < key: search the right subtree
		return get(key, root.right);
	}

	/**
	 * Returns the minimum key in this tree.
	 * 
	 * @return the value of the smallest key in this tree
	 * @throws IllegalArgumentException if this tree is empty
	 */
	public KeyType getMinKey() {
		return getMinKey(root);
	}

	/**
	 * Returns the minimum key in a subtree.
	 * 
	 * @param root - root of the tree to search
	 * @return the value of the smallest key in the tree rooted at root
	 * @throws IllegalArgumentException if root is null
	 */
	private KeyType getMinKey(BSTNode root) {
		if (root == null) {
			throw new IllegalArgumentException("Inserted root must be non-null");
		}
		else if (root.left != null) {
			return getMinKey(root.left);
		}
		else{
			return root.key;
		}
	}

	////////////////////////////////////////////////////////////////////
	// Modification Operations
	// Methods: clear, put, putAll, remove
	////////////////////////////////////////////////////////////////////

	/*
	 * @see java.util.Map#clear()
	 */
	@Override
	public void clear() {
		root = null;
		this.size = 0;
	}

	/**
	 * @see java.util.Map#put(java.lang.Object, java.lang.Object)
	 */
	@Override
	public ValueType put(KeyType key, ValueType value) {
		ValueType oldValue = get(key);
		root = put(key, value, root);
		return oldValue;
	}

	/**
	 * Associates the specified value with the specified key in a subtree. If the
	 * map previously contained a mapping for the key, the old value is replaced.
	 * 
	 * @param key   - key with which the specified value is to be associated
	 * @param value - value to be associated with the specified key
	 * @param root  - root of the tree in which to insert the new key-value pair
	 * @return the (possibly new) root of the tree
	 */
	private BSTNode put(KeyType key, ValueType value, BSTNode root) {
		// base case - empty tree: create a new node for the root and return it
		if (root == null) {
			BSTNode newNode = new BSTNode(key, value);
			this.size++;
			return newNode;
		}

		KeyType rootKey = root.key;

		// base case - found key at root: update with the new value
		if (key.equals(rootKey)) {
			root.value = value;
		}

		// key < rootKey: put in the left subtree
		else if (inOrderKeys(key, rootKey)) {
			root.left = put(key, value, root.left);
		}

		// rootKey < key: put in the right subtree
		else {
			root.right = put(key, value, root.right);
		}

		return root;
	}

	/**
	 * @see java.util.Map#putAll(java.util.Map)
	 */
	@Override
	public void putAll(Map<? extends KeyType, ? extends ValueType> map) {
		for (KeyType key : map.keySet()) {
			ValueType value = map.get(key);
			put(key, value);
		}
	}

	/**
	 * @see java.util.Map#remove(java.lang.Object)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public ValueType remove(Object key) {
		ValueType value = get(key);
		if (value != null) { // only try to remove keys that are in the tree
			root = remove((KeyType) key, root);
		}
		return value;
	}

	/**
	 * Removes the mapping for a key from this map if it is present
	 * 
	 * @param key  - key for which mapping should be removed
	 * @param root - root of the tree in which to remove the key
	 * @return the (possibly new) root of the tree
	 */
	private BSTNode remove(KeyType key, BSTNode root) {
		// base case
		if (root == null){
		}
		//found the element
		// key < rootKey: look to the left subtree
		else if (key.compareTo(root.key) < 0) {
			root.left =  remove(key, root.left);
		}
		// key > rootKey: look to the right subtree		
		else if (key.compareTo(root.key) > 0) {
			root.right = remove(key, root.right);
		}
		else { 
			// node is a leaf
			if (root.left == null && root.right == null){
				this.size--;
				root = null;
			}
			// node has one child/branch to the right
			else if (root.left == null){
				this.size--;
				root = root.right;
			}
			// node has one child/branch to the left
			else if (root.right == null){
				this.size--;
				root = root.left;
			}
			// node has two children
			else {
				KeyType successorKey = getMinKey(root.right);
				root.key = successorKey;
				root.value = get(successorKey, root.right);
				root.right = remove(successorKey, root.right);
			}
		}
		return root;
	}

	////////////////////////////////////////////////////////////////////
	// Debugging Methods
	// Methods: printTreeStructure, toString
	////////////////////////////////////////////////////////////////////

	/**
	 * Prints an indented tree structure of this tree.
	 */
	public void printTreeStructure() {
		printTreeStructure(root, 0);
	}

	/**
	 * Prints an indented tree structure of a subtree.
	 * 
	 * @param root  - the root of the tree to print
	 * @param depth - the indentation level
	 */
	private void printTreeStructure(BSTNode root, int depth) {
		if (root != null) {
			String s = "[" + root.key.toString() + " , " + root.value.toString() + "]";
			for (int count = 1; count <= depth; count++) {
				System.out.print("\t");
			}
			System.out.println(s);
			printTreeStructure(root.left, depth + 1);
			printTreeStructure(root.right, depth + 1);
		}
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		ArrayList<KeyType> allKeys = getAllKeysInOrder();
		return allKeys.toString();
	}

	////////////////////////////////////////////////////////////////////
	// Helper Methods
	// Methods: inOrderKeys, getAllKeysInOrder
	////////////////////////////////////////////////////////////////////

	/**
	 * Returns true if key1 is less than key2.
	 * 
	 * @param key1 - key to compare
	 * @param key2 - key to compare
	 * @return true if key1 is less than key2
	 */
	private boolean inOrderKeys(KeyType key1, KeyType key2) {
		return key1.compareTo(key2) < 0;
	}

	/**
	 * Returns an ordered list of the keys in this tree.
	 * 
	 * @return an ordered list of the keys in this tree
	 */
	private ArrayList<KeyType> getAllKeysInOrder() {
		ArrayList<KeyType> keys = new ArrayList<KeyType>();
		addKeysToArrayList(keys, root);
		return keys;
	}

	/**
	 * Adds the keys in a subtree to a list of keys.
	 * 
	 * @param keys - an ordered list of keys
	 * @param root - the root of the tree from which to add keys
	 */
	private void addKeysToArrayList(ArrayList<KeyType> keys, BSTNode root) {
		if (root != null) {
			addKeysToArrayList(keys, root.left); // add left (least in family)
			keys.add(root.key); // add node
			addKeysToArrayList(keys, root.right); // add right (greatest in family)	
		}
	}

	////////////////////////////////////////////////////////////////////
	// Unimplemented Methods
	// Methods: entrySet, keySet, values
	////////////////////////////////////////////////////////////////////

	/**
	 * @see java.util.Map#entrySet()
	 */
	@Override
	public Set<Entry<KeyType, ValueType>> entrySet() {
		throw new UnsupportedOperationException();
	}

	/**
	 * @see java.util.Map#keySet()
	 */
	@Override
	public Set<KeyType> keySet() {
		throw new UnsupportedOperationException();
	}

	/**
	 * @see java.util.Map#values()
	 */
	@Override
	public Collection<ValueType> values() {
		throw new UnsupportedOperationException();
	}

}
