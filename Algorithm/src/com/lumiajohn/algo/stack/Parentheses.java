package com.lumiajohn.algo.stack;

import com.lumiajohn.algo.stack.linklist.LinkedStack;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Parentheses {
	public static void main(String[] args) {
		LinkedStack<Character> s = new LinkedStack<>();
		while(StdIn.hasNextChar()){
			char readCharacter = StdIn.readChar();
			if (readCharacter == '[' || readCharacter == '{' || readCharacter == '('){
				s.push(readCharacter);
			}else if(readCharacter == ']'){
				char poped = s.pop();
				if(poped != '['){
					StdOut.println("Parentheses are not properly balanced.");
					break;
				}
			}else if(readCharacter == ')'){
				char poped = s.pop();
				if(poped != '('){
					StdOut.println("Parentheses are not properly balanced.");
					break;
				}
			}else if(readCharacter == '}'){
				char poped = s.pop();
				if(poped != '{'){
					StdOut.println("Parentheses are not properly balanced.");
					break;
				}
			}else{
				continue;
			}
		}
	}
}
