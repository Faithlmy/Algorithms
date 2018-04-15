package April.a15;

public class Test {
	
	public static void main(String[] args) {
		StackArrayCall s = new StackArrayCall("faith");
		s.doStackArrayCall();

		System.out.println(s.showPeak());
		
		System.out.println(s.showBottem());
		
		System.out.println(s.isEmpty());
		
		System.out.println(s.output());
		
		System.out.println(s.isEmpty());
		
		
	}
}
