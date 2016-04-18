package com.lumiajohn.algo.bag;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Stat {
	public static void main(String[] args) {
		Bag<Double> bag = new Bag<Double>();
		while(!StdIn.isEmpty()){
			bag.add(StdIn.readDouble());
		}
		int N = bag.size();
		double sum = 0.0;
		for(double num : bag){
			sum += num;
		}
		double mean = sum / N;
		sum = 0.0;
		for (double num : bag){
			sum += (num - mean)*(num - mean);
		}
		double std = Math.sqrt(sum/(N-1));
		StdOut.printf("Mean: %.2f\n",mean);
		StdOut.printf("Std dev: %.2f\n", std);
	}
}
