package com.lumiajohn.algo.bag.linklist;

import java.util.Iterator;

public class LinkedBag<Item> implements Iterable<Item>{
	private int N;
	private class Node{
		Item item;
		Node next;
	}
	private Node first;
	public LinkedBag(){
		first = null;
		N = 0;
	}
	public int size(){return N;}
	public boolean isEmpty(){return first==null;}
	
	public void add(Item item){
		Node oldHead = first;
		first = new Node();
		first.item = item;
		first.next = oldHead;
		N++;
	}
	@Override
	public Iterator<Item> iterator() {
		return new ListIterator();
	}
	
	private class ListIterator implements Iterator<Item>{
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
