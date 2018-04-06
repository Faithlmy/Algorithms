package April.a06;

public class TestObjectPair {
	
	public static void main(String[] args) {
		ObjectPair op = new ObjectPair("faith", 90);
		Object f = op.getFirst();
		System.out.println(f);
		//
		Object s = op.getSecond();
		System.out.println(s);
	}

}
