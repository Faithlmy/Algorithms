package April.a03;

public class GeometricProgression  extends Progression{
	
	protected long base;
	
	public GeometricProgression() {
		this(2, 1);
	}
	
	public GeometricProgression(long b) {
		this(b, 1);
	}

	public GeometricProgression(long b, long start) {
		// TODO Auto-generated constructor stub
		super(start);
		base = b;
	}
	
	protected void advance() {
		current *= base;
	}
	
}
