package April.a06;

public class TestTryCatch {
	
	private static final int DEFAULT = 0;

	public static void main(String[] args) {
		int n = DEFAULT;
		try {
			n = Integer.parseInt(args[0]);
			if(n <= 0) {
				System.out.println("default. ");
				n = DEFAULT;
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("No argument specified for n. Using default.");
		}
		catch(NumberFormatException e) {
			System.out.println("Using default.");
		}
	}

}
