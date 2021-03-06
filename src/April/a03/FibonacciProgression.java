package April.a03;

public class FibonacciProgression extends Progression {
	
	protected long prev;
	
	public FibonacciProgression() {
		this(0, 1);
	}

	public FibonacciProgression(long first, long second) {
		// TODO Auto-generated constructor stub
		super(first);
		prev = second - first;
	}
	
	protected void advance() {
		long temp = prev;
		prev = current;
		current += temp;
	}
}
