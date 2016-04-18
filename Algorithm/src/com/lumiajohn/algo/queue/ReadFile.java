package com.lumiajohn.algo.queue;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdOut;

public class ReadFile {
	public static void main(String[] args) {
		int[] a = readInts("data/tinyT.txt");
		for(int i : a){
			StdOut.println(String.valueOf(i));
		
		}
	}
	
	public static int[] readInts(String name){
		In in = new In(name);
		Queue<Integer> queue = new Queue<Integer>();
		while(!in.isEmpty()){
			queue.enqueue(in.readInt());
		}
		int size = queue.size();
		int[] a = new int[size];
		for(int i = 0; i < size; i++){
			a[i] = queue.dequeue();
		}
		return a;
	}
}
