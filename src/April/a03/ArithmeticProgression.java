package April.a03;

public class ArithmeticProgression extends Progression{
	
	protected long increment;
	
	public ArithmeticProgression() {
		this(0, 1);
	}

	public ArithmeticProgression(long stepsize) {
		// TODO Auto-generated constructor stub
		this(stepsize, 0);
	}

	public ArithmeticProgression(long stepsize, long start) {
		// TODO Auto-generated constructor stub
		super(start);
		increment = stepsize;
	}
	
	protected void advance() {
		current += increment;
	}

}
