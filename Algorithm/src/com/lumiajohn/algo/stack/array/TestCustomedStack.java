package com.lumiajohn.algo.stack.array;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class TestCustomedStack {
	public static void main(String[] args) {
//		testFixedCapacityStackOfStrings();
		testFixedCapacityStack();
//		testResizedCapacityStack();
		
	}

	private static void testResizedCapacityStack() {
		ResizedCapacityStack<String> s = new ResizedCapacityStack<String>(4);
		while(!StdIn.isEmpty()){
			String item = StdIn.readString();
			if(!"-".equals(item)){
				s.push(item);
			}else if(!s.isEmpty()){
				StdOut.print(s.pop()+" ");
			}
		}
		StdOut.println("("+s.size()+" left on stack)");
		for(String each : s){
			StdOut.print(each+" ");
		}		
	}

	private static void testFixedCapacityStack() {
		FixedCapacityStack<String> s = new FixedCapacityStack<String>(100);
		while(!StdIn.isEmpty()){
			String item = StdIn.readString();
			if(!"-".equals(item)){
				s.push(item);
				StdOut.print(s.peek());
			}else if(!s.isEmpty()){
				StdOut.print(s.pop()+" ");
			}
		}
		StdOut.println("("+s.size()+" left on stack)");		
	}

	private static void testFixedCapacityStackOfStrings() {
		FixedCapacityStackOfStrings s = new FixedCapacityStackOfStrings(10);
		while(!StdIn.isEmpty()){
			String item = StdIn.readString();
			if(!"-".equals(item)){
				if(s.isFull()){
					StdOut.println("IS FULL!!");
				}else{
					s.push(item);
				}
			}else if(!s.isEmpty()){
				StdOut.print(s.pop()+" ");
			}
		}
		StdOut.println("("+s.size()+" left on stack)");		
	}
}
