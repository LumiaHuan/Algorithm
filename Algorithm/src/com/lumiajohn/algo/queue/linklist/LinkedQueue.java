package com.lumiajohn.algo.queue.linklist;

import java.util.Iterator;

public class LinkedQueue<Item> implements Iterable<Item>{
	private class Node{
		Item item;
		Node next;
	}
	private Node head;
	private Node tail;
	private int N;
	public LinkedQueue(){
		N = -1;
		head = null;
		tail = null;
	}
	public boolean isEmpty(){
		return head == null;
	}
	public int size(){
		return N+1;
	}
	public void enqueue(Item item){
		Node oldTail = tail;
		tail = new Node();
		tail.item = item;
		tail.next = null;
		if(isEmpty()){
			head = tail;
		}else{
			oldTail.next = tail;
		}
		N++;
	}
	public Item dequeue(){
		Item item = head.item;
		head = head.next;
		if(isEmpty()){
			tail = null;
		}
		N--;
		return item;
	}
	@Override
	public Iterator<Item> iterator() {
		return new LinkedQueueIterator();
	}
	private class LinkedQueueIterator implements Iterator<Item>{
		private Node currentNode = head;
		@Override
		public boolean hasNext() {
			return currentNode!=null;
		}

		@Override
		public Item next() {
			Item item = currentNode.item;
			currentNode = currentNode.next;
			return item;
		}
	}
}
