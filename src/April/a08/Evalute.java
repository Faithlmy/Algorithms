package April.a08;
/*
 * The console do not output result.
 * */
import java.util.Scanner;
import java.util.Stack;

import edu.princeton.cs.algs4.StdIn; //please download algs4.jar from Internet and add this project.
import edu.princeton.cs.algs4.StdOut;

public class Evalute {
	
	public static void main(String[] args) {
		Stack<String> ops = new Stack<String>();
		Stack<Double> values = new Stack<Double>();
		
		while(!StdIn.isEmpty()) {
			String s = StdIn.readString();
//			String s = StdIn.readString();
//			Scanner sAll = new Scanner(System.in);
//			String s = sAll.nextLine();
			System.out.print(s);
			if(s.equals("("));
			else if(s.equals("+")) ops.push(s);
			else if(s.equals("-")) ops.push(s);
			else if(s.equals("*")) ops.push(s);
			else if(s.equals("/")) ops.push(s);
			else if(s.equals("sqrt")) ops.push(s);
			else if(s.equals(")")){
				String op = ops.pop();
				Double v = values.pop();
				if(op.equals("+")) v = values.pop() + v;
				else if(op.equals("-")) v = values.pop() - v;
				else if(op.equals("*")) v = values.pop() * v;
				else if(op.equals("/")) v = values.pop() / v;
				else if(op.equals("sqrt")) v = Math.sqrt(v);
				values.push(v);
			}
			else values.push(Double.parseDouble(s));
//			else values.push(Double.);
		}
		StdOut.println(values.pop());
	}
}
