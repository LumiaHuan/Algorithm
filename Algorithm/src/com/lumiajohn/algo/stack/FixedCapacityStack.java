package com.lumiajohn.algo.stack;

public class FixedCapacityStack<Item> {
	private int N;
	private Item[] stackContent;
	public FixedCapacityStack (int capacity){
		N = -1;
		stackContent = (Item[]) new Object[capacity];
	}
	
	public boolean isEmpty(){ return N == -1;}
	public int size(){ return N+1;}
	public void push(Item item){
		stackContent[++N] = item;
	}
	
	public Item pop(){
		return stackContent[N--];
	}
	
	
}
