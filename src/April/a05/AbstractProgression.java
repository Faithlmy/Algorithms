package April.a05;

public abstract class AbstractProgression {
	
	protected long current;
	
	protected abstract void advance();
	
	public AbstractProgression() {
		this(0);
	}

	public AbstractProgression(long start) {
		// TODO Auto-generated constructor stub
		current = start;
	}
	
	public long nextValue() {
		long answer = current;
		advance();
		return answer;
	}
	
	public void printProgression(int n) {
		System.out.print(nextValue());
		for(int j = 1; j < n; j++) {
			System.out.print("  " + nextValue());
		}
		System.out.println();
	}
	
}
