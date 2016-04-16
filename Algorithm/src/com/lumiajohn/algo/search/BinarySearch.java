package com.lumiajohn.algo.search;

public class BinarySearch {
	public static int rank(int key, int[] a){
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi){
			int mid = lo + (hi - lo) / 2;
			if (a[mid] > key){
				hi = mid - 1;
			}else if(a[mid]<key){
				lo = mid + 1;
			}else{
				return mid;
			}
		}
		return -1;
	}
	private static int rank(int key,int[] a, int lo, int hi){
		if (lo > hi){
			return -1;
		}
		int mid = lo + (hi - lo) / 2;
		if(a[mid] > key){
			return rank(key, a, lo, mid - 1);
		}else if(a[mid] < key){
			return rank(key, a, mid+1, hi);
		}else{
			return mid;
		}
		
	}
	public static int rankRecursive(int key, int[] a ){
		return rank(key, a, 0, a.length-1);
	}
	
}
