package April.a15;

public class StackArrayCall<T> {
	
	private String input;
	private StackArrayRealize s;
	
	public StackArrayCall(String input) {
		this.input = input;
		this.s = new StackArrayRealize(input.length());
	}
	
	public void doStackArrayCall() {
//		StackArrayRealize s = new StackArrayRealize(input.length());
		for(int i = 0; i < input.length(); i++) {
			s.push(input.charAt(i));
		}

	}

	public String output() {
		String output = "";
		while(!s.isEmpty()) {
			output += s.pop();
		}
		return output;
	}

	public T showPeak() {
		return (T) s.peak(); 
	}
	
	public T showBottem() {
		return (T) s.bottem(); 
	}
	
	public boolean isEmpty() {
		return s.isEmpty();
	}

}
