package com.lumiajohn.algo.stack;

import com.lumiajohn.algo.stack.linklist.LinkedStack;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class EvaluatePostfix {
	public static void main(String[] args) {
		LinkedStack<Float> s = new LinkedStack<>();
		while(!StdIn.isEmpty()){
			String str= StdIn.readString();
			if("+".equals(str)){
				s.push(s.pop()+s.pop());
			}else if("*".equals(str)){
				s.push(s.pop() * s.pop());
			}else if("-".equals(str)){
				float second = s.pop();
				s.push(s.pop() - second);
			}else if("/".equals(str)){
				float second = s.pop();
				s.push(s.pop() / second);
			}else {
				s.push(Float.parseFloat(str));
			}
		}
		while(!s.isEmpty()){
			StdOut.print(s.pop()+" ");
		}
	}
}
