package com.lumiajohn.algo.linkedlist;

public class TestLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>(1);
		linkedList.insert(2,0);
		System.out.println(linkedList.toString());
		System.out.println(linkedList.max(linkedList.head()));
		linkedList.insert(3,1);
		linkedList.insert(4);
		System.out.println(linkedList.toString());
		System.out.println(linkedList.max(linkedList.head()));
		linkedList.insert(5,-1);
		System.out.println(linkedList.max(linkedList.head()));
		System.out.println(linkedList.toString());
		System.out.println(linkedList.find(10));
		linkedList.delete();
		System.out.println(linkedList.toString());
		linkedList.delete(2);
		System.out.println(linkedList.toString());
		linkedList.delete(1);
		System.out.println(linkedList.toString());
		linkedList.delete();
		linkedList.delete();
		linkedList.delete();
		System.out.println(linkedList.toString());
		linkedList.insert(5,-1);
		System.out.println(linkedList.toString());
		linkedList.delete(0);
		System.out.println(linkedList.toString());

		
	}
}
