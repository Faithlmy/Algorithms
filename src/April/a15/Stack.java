package April.a15;

public interface Stack<T> {
	
	public boolean isEmpty();
	
	public boolean isFull();
	
	public void push(T data);
	
	public T peak();
	
	public T pop();

}
