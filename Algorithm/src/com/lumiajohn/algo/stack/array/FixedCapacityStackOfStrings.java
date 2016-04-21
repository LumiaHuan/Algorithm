package com.lumiajohn.algo.stack.array;

public class FixedCapacityStackOfStrings {
	private String[] stackContent;
	private int N;
	public FixedCapacityStackOfStrings(int capacity){
		N = -1;
		stackContent = new String[capacity];
	}
	public int size(){
		return N+1;
		
	}
	public boolean isEmpty(){
		
		return N == -1;
	}
	public void push(String item){
		stackContent[++N] = item;
	}
	public String pop(){
		String item = stackContent[N];
		stackContent[N] = null;
		N--;
		return item;
	}
	
	
}
