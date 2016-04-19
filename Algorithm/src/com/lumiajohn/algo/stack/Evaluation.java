package com.lumiajohn.algo.stack;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Evaluation {
	//Dijkstra’s Two-Stack Algorithm for Expression Evaluation
	public static void main(String[] args) {
		Stack<String> ops = new Stack<>();
		Stack<Double> vals = new Stack<>();
		while(!StdIn.isEmpty()){
			String s = StdIn.readString();
			StdOut.print(s+",");
			if ("(".equals(s))	;
			else if("+".equals(s)){
				ops.push(s);
			}else if("-".equals(s)){
				ops.push(s);
			}else if("*".equals(s)){
				ops.push(s);
			}else if("/".equals(s)){
				ops.push(s);
			}else if("sqrt".equals(s)){
				ops.push(s);
			}else if(")".equals(s)){
				double v = vals.pop();
				String op = ops.pop();
				if(op.equals("+")){
					v = vals.pop() + v;
				}else if(op.equals("-")){
					v = vals.pop() - v;
				}else if(op.equals("*")){
					v = vals.pop() * v;
				}else if(op.equals("/")){
					v = vals.pop() / v;
				}else if(op.equals("sqrt")){
					v = Math.sqrt(v);
				}
				vals.push(v);
			}else{
				vals.push(Double.parseDouble(s));
			}
		}
		StdOut.println(vals.pop());
	}
}
