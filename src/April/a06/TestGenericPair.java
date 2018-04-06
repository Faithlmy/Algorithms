package April.a06;

public class TestGenericPair {
	

	public static <A, B> void main(String[] args) {
		//
		GenericPair<String, String> gp = new GenericPair<String, String>("faith", "yao");
		@SuppressWarnings("unchecked")
		A f = (A) gp.getFirst();
		System.out.println(f);
		@SuppressWarnings("unchecked")
		B s = (B) gp.getSecond();
		System.out.println(s);
		//
		GenericPair<Integer, Integer> rr = new GenericPair<Integer, Integer>(12, 89);
		@SuppressWarnings("unchecked")
		A rf = (A) rr.getFirst();
		System.out.println(rf);
		//
		GenericPair<String, Double> rp = new GenericPair<String, Double>("dream", Math.PI);
		double ag = rp.getSecond();
		System.out.println(ag);
	}

}
