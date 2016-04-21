package com.lumiajohn.algo.stack;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class TestCustomedStack {
	public static void main(String[] args) {
//		FixedCapacityStackOfStrings s = new FixedCapacityStackOfStrings(100);
//		while(!StdIn.isEmpty()){
//			String item = StdIn.readString();
//			if(!"-".equals(item)){
//				s.push(item);
//			}else if(!s.isEmpty()){
//				StdOut.print(s.pop()+" ");
//			}
//		}
//		StdOut.println("("+s.size()+" left on stack)");
		
//		FixedCapacityStack<String> s = new FixedCapacityStack<String>(100);
//		while(!StdIn.isEmpty()){
//			String item = StdIn.readString();
//			if(!"-".equals(item)){
//				s.push(item);
//			}else if(!s.isEmpty()){
//				StdOut.print(s.pop()+" ");
//			}
//		}
//		StdOut.println("("+s.size()+" left on stack)");
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
}
