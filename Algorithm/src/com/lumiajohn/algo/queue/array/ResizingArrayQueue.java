package com.lumiajohn.algo.queue.array;

import java.util.Iterator;

public class ResizingArrayQueue<Item> implements Iterable<Item>{
	private int head;
	private int tail;
	private int N;
	private Item[] contents;
	public ResizingArrayQueue(){
		this(2);
	}
	public ResizingArrayQueue(int capacity){
		head = tail = -1;
		N = 0;
		contents = (Item[]) new Object[capacity];
	}
	public boolean isEmpty(){
		return N == 0;
	}
	public boolean isFull(){
		return N == contents.length;
	}
	public int size(){
		return N;
	}
	public int consume(){
		return contents.length;
	}
	private void resize(int capacity){
		Item[] newContents = (Item[]) new Object[capacity];
		for (int i = 0; i < N; i++){
			newContents[i] = contents[(i+head) % contents.length];
		}
		contents= newContents;
		head = 0;
		tail = N-1;
	}
	public void enqueue(Item item){
		if(N == contents.length){
			resize(2*contents.length);
		}
		if(tail == contents.length-1){
			tail = 0;
		}else{
			tail++;
		}
		contents[tail] = item;
		if(isEmpty()){
			head = tail;
		}
		N++;
	}
	
	public Item peek(){
		return contents[head];
	}

	public Item dequeue(){
		Item ret = contents[head];
		contents[head] = null;
		head++;
		N--;
		if(head == contents.length){
			head = 0;
		}
		if(N > 0 && N == contents.length/4){
			resize(contents.length/2);
		}
		return ret;
	}
	@Override
	public Iterator<Item> iterator() {
		return new ArrayIterator();
	}
	private class ArrayIterator implements Iterator<Item>{
		private int curN = 0;
		@Override
		public boolean hasNext() {
			return N != curN;
		}

		@Override
		public Item next() {
			Item ret = contents[(head+curN)%contents.length];
			curN++;
			return null;
		}
		
	}
	
}
