package com.lumiajohn.algo.stack;

import com.lumiajohn.algo.stack.linklist.LinkedStack;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class BinaryPresentation {
	public static void main(String[] args) {
		int number = StdIn.readInt();
		LinkedStack<Integer> s = new LinkedStack<>();
		while(number > 0){
			s.push(number % 2);
			number = number / 2;
		}
		for (Integer integer : s) {
			StdOut.print(integer);
		}
		StdOut.println();
	}
}
