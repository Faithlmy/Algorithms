package April.a16;

public class Test {
	public static void main(String[] args) {
		StackLinkedRealize slr = new StackLinkedRealize();
		for(int i = 0; i < 6; i++) {
			slr.push(i);
		}
		System.out.println(slr.pop());
		
		System.out.println(slr.peak());
	}

}
