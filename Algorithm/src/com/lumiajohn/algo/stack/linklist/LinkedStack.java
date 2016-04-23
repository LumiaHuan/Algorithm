package com.lumiajohn.algo.stack.linklist;

import java.util.Iterator;

public class LinkedStack<Item> implements Iterable<Item>{
	private int N;
	private Node first;
	private class Node{
		Item item;
		Node next;
	}
	public LinkedStack(){
		N = -1;
		first = null;
	}
	public boolean isEmpty(){return first == null;}
	public int size(){return N+1;}
	public void push(Item item){
		Node inserted = new Node();
		inserted.item = item;
		inserted.next = first;
		first = inserted;
		N++;
	}
	public Item pop(){
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new LinkedStackIterator();
	}
	
	private class LinkedStackIterator implements Iterator<Item>{
		private Node currentNode = first;
		@Override
		public boolean hasNext() {
			return currentNode != null;
		}

		@Override
		public Item next() {
			Item item = currentNode.item;
			currentNode = currentNode.next;
			return item;
		}
		
	}
}
