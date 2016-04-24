package com.lumiajohn.algo.queue.array;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class TestResizingArrayQueue {
	public static void main(String[] args) {
		ResizingArrayQueue<String> q = new ResizingArrayQueue<String>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
            	q.enqueue(item);
            	StdOut.println(item+" enqueue and size:"+q.consume());
            }
            else if (!q.isEmpty()) {
            	StdOut.println(q.dequeue()+" dequeue and size:"+q.consume());
            }
        }
        StdOut.println("(" + q.size() + " left on queue)");
	}
}
