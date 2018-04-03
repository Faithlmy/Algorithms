package April.a03;

public class Progression {
	
	protected long current;
	
	public Progression() {
		this(0);
	}

	public Progression(long start) {
		// TODO Auto-generated constructor stub
		current = start;
	}
	
	protected void advance() {
		current++;
	}
	
	public long nextValue() {
		long answer = current;
		advance();
		return answer;
	}
	
	public void printProgression(int n) {
		System.out.println(nextValue());
		for(int j = 0; j < n; j++) {
			System.out.println(" " + nextValue());
		System.out.println();
		}
	}

}
