package April.a03;

public class TestProgression {
	
	public static void main(String [] args) {
		Progression prog;
		System.out.print("Arithmetic : " );
		prog = new ArithmeticProgression();
		prog.printProgression(10);
		
		System.out.print("Arithmetic increment 5 : " );
		prog = new ArithmeticProgression(5);
		prog.printProgression(10);
		
		System.out.print("Arithmetic start 2 : " );
		prog = new ArithmeticProgression(5, 2);
		prog.printProgression(10);
		
	}

}
