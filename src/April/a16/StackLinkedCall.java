package April.a16;

public class StackLinkedCall {
	
	private StackLinkedRealize sr;
	
	public StackLinkedCall() {
		sr = new StackLinkedRealize();
	}
	
	public void inStack(Object data) {
		sr.push(data);
	}
	
	public String outStack() {
		String out = "";
		while(!sr.isEmpty()) {
			out += sr.pop();
		}
		
		return out;
	}
	
	public Object peak() {
		return sr.peak();
	}
}
