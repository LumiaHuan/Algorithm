package com.lumiajohn.algo.linkedlist;

public class LinkedList<T> {
	private class Node{
		T data;
		Node next;
		Node(){}
		Node(T data, Node next){
			this.data = data;
			this.next = next;
		}
	}
	private Node head = null;
	public LinkedList(T data){
		head = new Node(data,null);
	}
	public boolean isEmpty(){
		return head == null;
	}
	
	public void insert(T data){
		if(isEmpty()){
			head = new Node(data,null);
			return;
		}
		Node tmp = head;
		Node inserted = new Node(data, null);
		while(tmp.next != null){
			tmp = tmp.next;
		}
		tmp.next = inserted;
	}
	public void insert(T data, int index){
		if(index < -1){
			throw new IllegalArgumentException("index should bigger or equal to -1, given "+index);
		}
		if(index == -1){
			if(isEmpty()) insert(data);
			else{
				head = new Node(data, head);
			}
			return;
		}
		int tmpIndex = index;
		if(isEmpty()){
			throw new IllegalArgumentException("Linklist is Empty!Index should be -1");
		}
		Node tmp = head;
		while(index > 0){
			if(tmp.next==null){
				throw new IllegalArgumentException("Index should bigger or equal to -1 and less than the length of current linklist, given "+tmpIndex);
			}
			tmp = tmp.next;
			index--;
		}
		tmp.next = new Node(data, tmp.next);
	}
	public T delete() {
		if(isEmpty()){
			return null;
		}
		Node pre = head;
		Node post = head.next;
		T ret = null;
		if(post == null){
			ret = head.data;
			head = null;
		}else{
			while(post.next!=null){
				post = post.next;
				pre = pre.next;
			}
			ret = post.data;
			pre.next = null;
		}
		return ret;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node tmp = head;
		while(tmp != null){
			sb.append(String.valueOf(tmp.data)+"->");
			tmp = tmp.next;
		}
		sb.append("null");
		return sb.toString();
	}
}
