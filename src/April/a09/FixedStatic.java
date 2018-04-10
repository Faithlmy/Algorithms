package April.a09;

public class FixedStatic<Items> {
	
	private Items[] a;
	private int N;
	
	@SuppressWarnings("unchecked")
	public FixedStatic(int cap) {
		a = (Items[])new Object[cap];
	}
	
	public boolean isEmpty() {
		return N == 0;
	}
	
	public void push(Items items) {
		a[N++] = items;
	}
	
	public Items pop() {
		return a[--N];
	}
	
	public int size() {
		return N;
	}

}
