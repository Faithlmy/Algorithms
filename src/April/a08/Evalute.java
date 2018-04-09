package April.a08;

import java.util.Stack;

import edu.princeton.cs.algs4.StdIn; //please download algs4.jar from Internet and add this project.
import edu.princeton.cs.algs4.StdOut;

public class Evalute {
	
	public static void main(String[] args) {
		Stack<String> ops = new Stack<String>();
		Stack<Double> values = new Stack<Double>();
		
		while(!StdIn.isEmpty()) {
			String s = StdIn.readString();
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
			}
			else values.push(Double.parseDouble(s));
		}
		StdOut.println(values.pop());
	}
}
