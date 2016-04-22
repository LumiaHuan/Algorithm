package com.lumiajohn.algo.queue.linklist;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class TestQueue {
	public static void main(String[] args) {
		LinkedQueue<String> q = new LinkedQueue<>();
		while (!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if (!item.equals("-"))
				q.enqueue(item);
			else if (!q.isEmpty())
				StdOut.print(q.dequeue() + " ");
		}

		StdOut.println("(" + q.size() + " left on queue)");
	}
}
