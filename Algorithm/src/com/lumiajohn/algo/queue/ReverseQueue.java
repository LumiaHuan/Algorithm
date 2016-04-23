package com.lumiajohn.algo.queue;

import com.lumiajohn.algo.queue.linklist.LinkedQueue;
import com.lumiajohn.algo.stack.linklist.LinkedStack;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ReverseQueue {
	public static void main(String[] args) {
		LinkedQueue<Character> queue = new LinkedQueue<>();
		while(StdIn.hasNextChar()){
			queue.enqueue(StdIn.readChar());
		}
		LinkedStack<Character> s = new LinkedStack<>();
		while(!queue.isEmpty()){
			s.push(queue.dequeue());
		}
		while(!s.isEmpty()){
			queue.enqueue(s.pop());
		}
		for (char c : queue){
			StdOut.print(c);
		}
		StdOut.println();
	}
}
