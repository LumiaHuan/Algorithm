package com.lumiajohn.algo.stack.linklist;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class TestLinkedStack {
	public static void main(String[] args) {
		LinkedStack<String> s = new LinkedStack<>();
		while(!StdIn.isEmpty()){
			String item = StdIn.readString();
			if(!"-".equals(item)){
				s.push(item);
			}else if(!s.isEmpty()){
				StdOut.print(s.pop()+" ");
			}
		}
		StdOut.println("("+s.size()+" left on stack)");
		LinkedStack<String> sCp = LinkedStack.copy(s);
		for(String str : sCp){
			StdOut.print(str+" ");
		}
		
	}
}
