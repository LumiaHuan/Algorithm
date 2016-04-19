package com.lumiajohn.algo.stack;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Reverse {
	//利用栈来反序输出
	public static void main(String[] args) {
		Stack<Integer> stack;
		stack = new Stack<Integer>();
		while(!StdIn.isEmpty()){
			stack.push(StdIn.readInt());
		}
		for(int i : stack){
			StdOut.println(i);
		}
	}
}
