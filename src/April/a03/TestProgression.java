package April.a03;

public class TestProgression {
	
	public static void main(String [] args) {
		Progression prog;
		// test ArithmeticProgression
		System.out.print("Arithmetic default : " );
		prog = new ArithmeticProgression();
		prog.printProgression(10);
		
		System.out.print("Arithmetic increment 5 : " );
		prog = new ArithmeticProgression(5);
		prog.printProgression(10);
		
		System.out.print("Arithmetic start 2 : " );
		prog = new ArithmeticProgression(5, 2);
		prog.printProgression(10);
		
		// test GeometricProgression
		System.out.print("default base: ");
		prog = new GeometricProgression();
		prog.printProgression(10);
		
		System.out.print("base 3: ");
		prog = new GeometricProgression(3);
		prog.printProgression(10);
		
		//FibonacciProgression
		System.out.print("default base: ");
		prog = new FibonacciProgression();
		prog.printProgression(10);
		
		System.out.print("start values 4 and 6: ");
		prog = new FibonacciProgression(4, 6);
		prog.printProgression(8);
		
		
	}

}
