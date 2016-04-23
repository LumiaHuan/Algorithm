package com.lumiajohn.algo.stack.array;

public class FixedCapacityStack<Item> {
	private int N;
	private Item[] stackContent;

	public FixedCapacityStack(int capacity) {
		N = -1;
		stackContent = (Item[]) new Object[capacity];
	}

	public boolean isEmpty() {
		return N == -1;
	}

	public boolean isFull() {
		return N == stackContent.length - 1;
	}

	public int size() {
		return N + 1;
	}

	public void push(Item item) {
		stackContent[++N] = item;
	}

	public Item peek(){
		return stackContent[N];
	}
	
	public Item pop() {
		Item item = stackContent[N];
		stackContent[N] = null;
		N--;
		return item;
	}

}
