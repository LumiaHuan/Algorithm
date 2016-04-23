package com.lumiajohn.algo.stack;

import com.lumiajohn.algo.stack.linklist.LinkedStack;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class InfixToPostfix {
	public static void main(String[] args) {
		LinkedStack<Character> s = new LinkedStack<>();
		In in = new In();
		String str = in.readAll();
		for (int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			if('0'<=c && c<='9'){
				StdOut.print(c+" ");
			}else if('+' == c || '-'==c){
				while(!s.isEmpty()){
					char top = s.peek();
					if(top == '+' || top=='-' || top=='*' || top=='/'){
						StdOut.print(s.pop()+" ");
					}else{
						s.push(c);
						break;
					}
				}
				if(s.isEmpty()){
					s.push(c);
				}
			}else if('*' == c || '/' == c){
				while(!s.isEmpty()){
					char top = s.peek();
					if(top=='*' || top=='/'){
						StdOut.print(s.pop()+" ");
					}else{
						s.push(c);
						break;
					}
				}
				if(s.isEmpty()){
					s.push(c);
				}
			}else if('(' == c){
				s.push(c);
			}else if(')' == c){
				char poped;
				while((poped = s.pop()) != '('){
					StdOut.print(poped+" ");
				}
				
			}
		}
		while(!s.isEmpty()){
			StdOut.print(s.pop()+" ");
		}
	}
}
