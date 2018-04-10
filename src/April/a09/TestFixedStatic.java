package April.a09;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class TestFixedStatic {
	
	public static void main(String[] args) {
		FixedStatic<String> s;
		s = new FixedStatic<String>(100);
		
		while (!StdIn.isEmpty()) {
			String items = StdIn.readString();
			if(!items.equals("-")) {
				s.push(items);
			}
			else if(!items.isEmpty()) {
				System.out.print(s.pop() + " ");
				System.out.println("faith");
			}
		}
		StdOut.print("(" + s.size() + " left on stack)");
	}
	
}
