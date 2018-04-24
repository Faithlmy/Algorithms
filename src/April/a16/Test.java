package April.a16;

public class Test {
	public static void main(String[] args) {
		StackLinkedCall slr = new StackLinkedCall();
		for(int i = 0; i < 6; i++) {
			slr.inStack(i);;
		}
		System.out.println(slr.peak());
		System.out.println(slr.outStack() + " ");
		

	}

}
