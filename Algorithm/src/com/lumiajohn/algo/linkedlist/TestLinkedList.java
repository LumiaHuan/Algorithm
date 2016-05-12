package com.lumiajohn.algo.linkedlist;

public class TestLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>(1);
		linkedList.insert(2,0);
		linkedList.insert(3,1);
		linkedList.insert(4);
		linkedList.insert(5,-1);
		System.out.println(linkedList.toString());
		linkedList.delete();
		System.out.println(linkedList.toString());
		linkedList.delete();
		linkedList.delete();
		linkedList.delete();
		linkedList.delete();
		linkedList.delete();
		System.out.println(linkedList.toString());
		linkedList.insert(5,-1);
		System.out.println(linkedList.toString());
		linkedList.delete();
		linkedList.insert(5,0);
		System.out.println(linkedList.toString());
		
	}
}
