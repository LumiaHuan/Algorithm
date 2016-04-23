package com.lumiajohn.algo.stack.array;

import java.util.Iterator;

public class ResizedCapacityStack<Item> implements Iterable<Item>{
	private int N;
	private Item[] contentStack;
	public ResizedCapacityStack(int capacity){
		N = -1;
		contentStack = (Item[]) new Object[capacity];
	}
	
	private void resize(int newCapacity){
		Item[] temp = (Item[]) new Object[newCapacity];
		for(int i = 0; i <= N; i++){
			temp[i] = contentStack[i];
		}
		contentStack = temp;
	}
	
	public int size(){
		return N+1;
	}
	public boolean isEmpty(){
		
		return N==-1;
	}
	public void push(Item item){
		if(N == contentStack.length-1){
			resize(2*contentStack.length);
		}
		contentStack[++N] = item;
	}
	public Item peek(){
		return contentStack[N];
	}
	public Item pop(){
		Item item = contentStack[N];
		contentStack[N--] = null;
		if(N>=0 && N==(contentStack.length-1)/4){
			resize(contentStack.length/2);
		}
		return item;
	}

	@Override
	public Iterator<Item> iterator() {
		return new ReverseOrderedIterator();
	}
	private class ReverseOrderedIterator implements Iterator<Item>{
		private int i = N;
		@Override
		public boolean hasNext() {
			return i>=0;
		}

		@Override
		public Item next() {
			return contentStack[i--];
		}
		
	}
}
