package April.a06;

public class GenericPair<A, B> {
	
	A first;
	B second;
	
	public A getFirst() {
		return first;
	}
	public void setFirst(A first) {
		this.first = first;
	}
	public B getSecond() {
		return second;
	}
	public void setSecond(B second) {
		this.second = second;
	}
	
	public GenericPair(A a,  B b){
		first = a;
		second = b;
	}

}
