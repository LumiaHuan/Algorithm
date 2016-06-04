package com.lumiajohn.algo.queue.linklist;

public class CircularLinkedListQueue<T> {
	private class Node{
		T data;
		Node next;
	}
	private Node last = null;
	public CircularLinkedListQueue(){}
	public CircularLinkedListQueue(T data){
		last = new Node();
		last.data = data;
		last.next = last;
	}
	public boolean isEmpty(){
		return last == null;
	}
	public void enQueue(T data){
		if(isEmpty()){
			last = new Node();
			last.data = data;
			last.next = last;
			return;
		}
		Node tmpLast = new Node();
		tmpLast.data = data;
		tmpLast.next = last.next;
		last.next = tmpLast;
		last = last.next;
	}
	public T deQueue(){
		T ret = null;
		if(isEmpty()){
			System.err.println("The queue is Empty!");
			throw new IllegalStateException();
		}
		Node delete = last.next;
		if(last.next == last.next.next){
			last.next = null;
			last = null;
		}else{
			last.next = last.next.next;
		}
		ret = delete.data;
		delete = null;
		return ret;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if(isEmpty()){return "The queue is Empty!";}
		Node head = last.next;
		Node tmp = head;
		do{
			sb.append(tmp.data+"<-");
			tmp = tmp.next;
		}while(tmp!=head);
		sb.append("tail");
		return sb.toString();
	}
}
