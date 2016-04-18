package com.lumiajohn.algo.search;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Test {
	public static void main(String[] args) {
		//Test BinarySearch start
		testBinarySearch(args);
		
	}
	
	private static void testBinarySearch(String[] args){
		System.out.println(args[0]);
		int[] whitelist = In.readInts(args[0]);
		Arrays.sort(whitelist);
		while(!StdIn.isEmpty()){
			int key = StdIn.readInt();
			if(BinarySearch.rankRecursive(key, whitelist) < 0 ){
				StdOut.println(key);
			}
		}
		
	}
}
