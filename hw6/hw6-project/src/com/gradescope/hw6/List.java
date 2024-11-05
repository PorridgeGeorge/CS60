package com.gradescope.hw6;

import java.util.NoSuchElementException;

/**
 * A singly-linked list in which each element references the next element.
 */
public class List<DataType extends Comparable<DataType>> {

	private ListNode head;
	private int size;

	/**
	 * Constructs an empty list
	 */
	public List() {
		head = null;
		size = 0;
	}

	/**
	 * A node in a list that contains data and references the next node.
	 */
	private class ListNode {

		private DataType myData;
		private ListNode myNext;

		private ListNode(DataType element, ListNode next) {
			myData = element;
			myNext = next;
		}

		private ListNode(DataType element) {
			this(element, null);
		}
	}

	/**
	 * Returns the number of elements in this list.
	 * 
	 * @return the number of elements in this list
	 */
	public int length() {
		return size;
	}

	/**
	 * Returns true if this list contains no elements.
	 * 
	 * @return true if this collection contains no elements
	 */
	public boolean isEmpty() {
		return length() == 0;
	}

	/**
	 * Returns a string representation of this list.
	 * 
	 * The string representation consists of the list's elements in order, separated
	 * by a space. Elements are converted to strings by object.toString().
	 * 
	 * @return a string representation of this list
	 */
	public String toString() {
		String result = "( ";
		ListNode node = head;
		while (node != null) {
			result = result + node.myData.toString() + " ";
			node = node.myNext;
		}
		return result + ")";
	}

	/**
	 * Returns true if this list contains the specified element.
	 * 
	 * More formally, if o==null, this list returns true if and only if this list
	 * contains at least one null element. Otherwise, this list returns true if and
	 * only if this list contains at least one element e such that o.equals(e).
	 * 
	 * @param o - element whose presence in this list is to be tested
	 * @return true if this list contains the specified element
	 */
	public boolean contains(DataType o) {
		if (o == null) {
			for (ListNode node = head; node != null; node = node.myNext) {
				if (node.myData == null) {
					return true;
				}
			}
		} else {
			for (ListNode node = head; node != null; node = node.myNext) {
				if (o.equals(node.myData)) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Returns the element at the specified position in this list.
	 * 
	 * @param index - index of the element to return
	 * @return the element at the specified position in this list
	 * @throws IndexOutOfBoundsException if the index is out of range (index < 0 ||
	 *                                   index >= size())
	 */
	public DataType get(int index) {
		// check that index is within the bounds of the list
		if (index < 0) {
			throw new IndexOutOfBoundsException("Index to get must be at least 0.");
		}
		if (index >= length()) {
			throw new IndexOutOfBoundsException("Index to get is too large.");
		}

		// iterate through the list and find the right node
		int currentIndex = 0;
		ListNode currentNode = head;
		while (currentIndex != index) {
			currentIndex++;
			currentNode = currentNode.myNext;
		}

		return currentNode.myData;
	}

	/**
	 * Compares the specified object with this list for equality.
	 * 
	 * Returns true if and only if the specified object is also a list, both lists
	 * have the same size, and all corresponding pairs of elements in the two lists
	 * are equal. In other words, two lists are defined to be equal if they contain
	 * the same elements in the same order.
	 * 
	 * @param obj - the object to be compared for equality with this list
	 * @return true if the specified object is equal to this list
	 */
	public boolean equals(Object obj) {
		// @CS60: You do not need to understand the code in this method,
		// but feel free to take a look and ask questions about it,
		// if you are interested!

		// if obj is not of type List, they are not equal
		if (!(obj instanceof List)) {
			return false;
		}

		// cast the object to a List and use the overloaded version of equals
		@SuppressWarnings("unchecked")
		List<DataType> other = (List<DataType>) obj;
		// if the two lists are different sizes, they are not equal
		if (this.size != other.size) {
			return false;
		}

		// compare element by element
		ListNode node1 = this.head;
		ListNode node2 = other.head;
		for (int i = 0; i < this.size; i++) {
			// get the two strings, so we can compare them
			DataType s1 = node1.myData;
			DataType s2 = node2.myData;
			if (!s1.equals(s2)) {
				return false;
			}
			node1 = node1.myNext; // walk down this list
			node2 = node2.myNext; // walk down other list
		}
		return true;
	}

	/**
	 * Inserts the specified element at the beginning of this list.
	 * 
	 * Note that the list is modified. Nothing is returned. It is different than the
	 * constructor, which does create a new list.
	 * 
	 * @param e - the element to add
	 */
	public void addFirst(DataType e) {
		this.size++; // increases list size
		ListNode n = new ListNode(e); //  sets new node
		n.myNext = this.head; // rest of list is the old list
		this.head = n; // first index is e
	}

	/**
	 * Removes and returns the first element from this list.
	 * 
	 * @return the first element from this list
	 * @throws NoSuchElementException if this list is empty
	 */
	public DataType removeFirst() {
		if (this.head == null){
			throw new NoSuchElementException();
		}
		DataType updatedData = this.head.myData;
		this.size--;
		this.head = this.head.myNext;
		return updatedData;
	}

	/**
	 * Removes the first element from this list and adds it at the beginning of the
	 * other list.
	 * 
	 * @param other - the list to which to move the element
	 * @throws NoSuchElementException if this list is empty
	 */
	public void moveFirstElementTo(List<DataType> other) {
		if (this.head == null){
			throw new NoSuchElementException();
		}
		ListNode n = this.head; // n is the first element of this list
		this.head = n.myNext; // removes head of this list
		n.myNext = other.head;
		other.head = n;
		this.size--;
		other.size++;
	}

	/**
	 * Appends the specified element to the end of this list.
	 * 
	 * Note that the list is modified. Nothing is returned. It is different than the
	 * constructor, which does create a new list.
	 * 
	 * @param e - element to be appended to this list
	 */
	public void add(DataType e) {
		ListNode z = new ListNode(e);
		if (this.head == null){
			this.head = z;
		}
		else{
			ListNode out = this.head;
			ListNode old = out.myNext;
			while (out.myNext != null) {
				out = old;
				old = out.myNext;
			}
			out.myNext = z;
		}
		this.size++;
	}

	/**
	 * Constructs a list containing containing the elements of the string array, in
	 * the same order.
	 * 
	 * This static method can be thought of as another constructor.
	 * 
	 * @param stringArray - the array whose elements are to be placed into this list
	 */
	public static List<String> makeFromStringArray(String[] stringArray) {
		List<String> str = new List<String>();
		int i = stringArray.length-1;
		while (i >= 0) {
			str.addFirst(stringArray[i]);
			i--;
		}
		return str;
	}

	/**
	 * Returns an array containing all of the elements in this list in proper
	 * sequence (from first to last element). Elements are converted to strings by
	 * object.toString().
	 * 
	 * @return an array containing all of the elements in this list in proper
	 *         sequence
	 */
	public String[] toStringArray() {
		// make a string
		String[] str = new String[this.size];
		ListNode n = this.head;
		for (int i = 0; i < this.size; i++){
			str[i] = n.myData.toString();
			n = n.myNext;
		}
		return str;
		// itterate through this list assigining string[i] equal to head then n = n.myNext
	}

	/**
	 * Appends all of the elements in the other list to the end of this list, in the
	 * order that they are stored by the other list.
	 * 
	 * This operation is in-place. Note that the other list should not be modified
	 * while the operation is in progress. (This will occur if the specified
	 * collection is this list, and it is nonempty.)
	 * 
	 * @param other - list containing elements to be added to this list
	 */
	public void append(List<DataType> other) {
		this.size =  this.size + other.size;
		if (this.head == null){
			this.head = other.head;
		}
		ListNode i = this.head;
		while (i.myNext != null) {
			i = i.myNext;
		}
		i.myNext = other.head;
	}

	/**
	 * Reverses the elements of this list.
	 * 
	 * This operation is in-place.
	 */
	public void reverse() {
		if (this.head == null) {
			// no list to be reversed
		}
		else {
			ListNode p = null; //reversed list
			ListNode c = this.head; 
			ListNode n = c.myNext;
			while (c != null){
				n = c.myNext;
				c.myNext = p;
				p = c; // builds p from back to front
				c = n; // current to next in list
			}
			this.head = p;
		}
	}
	/**
	 * Splits this list in two.
	 * 
	 * Afterwards, this list contains only elements from the first half, and the
	 * returned list contains only elements from the second half.
	 * 
	 * If this list has an odd number of elements, afterwards, it should contain one
	 * more element than the list that is returned. If this list has one element, it
	 * is unmodified, and an empty list is returned.
	 * 
	 * @return a new list that contains the second half of the elements in the
	 *         original list
	 */
	public List<DataType> split() {
		List<DataType> lastHalf = new List<DataType>();
		// null or size == 1 case
		if (this.head == null || this.size == 1){
			return lastHalf;
		}
		else {
			int s = this.size;
			this.reverse();
			int i = 0;
			while (i < s/2) {
				lastHalf.addFirst(this.removeFirst());
				i++;
			}
			this.reverse();
			return lastHalf;
		} 
	}

	/**
	 * Merges this list with the other list.
	 * 
	 * Both this list and other list should already be in sorted order.
	 * 
	 * This method will modify this list and the other list. When completed, other
	 * should be empty and this list should contain all elements in sorted order.
	 * 
	 * @param other - the list to be merged with this list
	 */
	public void merge(List<DataType> other) {
		List<DataType> mergedList = new List<DataType>();
		while (this.head != null && other.head != null) {
			//removes smalles number in the head of either of the lists and puts it in the first element of mergedList
			if (this.head.myData.compareTo(other.head.myData) > 0) { // will be 0 or negative if this.head is less than other.head
				other.moveFirstElementTo(mergedList);
			}
			else {
				this.moveFirstElementTo(mergedList);
			}
		}
		if (this.head == null) {
			while (other.head != null) {
				other.moveFirstElementTo(mergedList);
			}
		}
		else {
			while (this.head != null) {
				this.moveFirstElementTo(mergedList);
			}
		}
		this.head = mergedList.head;
		this.size = mergedList.size;
		this.reverse();
	}

	/**
	 * Sorts this list using merge sort.
	 */
	public void mergeSort() {
		List<DataType> lastHalf = new List<DataType>();
		if (this.head == null || this.head.myNext == null){
			// return L in racket example
	}
		else {
			lastHalf = this.split();
			lastHalf.mergeSort();
			this.mergeSort();
			this.merge(lastHalf);
		}
	}

	public static void main(String[] args) {
		System.out.println();
		System.out.println();

		// For example, you might start like this:
		// List<Dog> myList = new List<Dog>();
		// System.out.println(myList.head.myData);
	}
}
