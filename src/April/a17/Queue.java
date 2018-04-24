package April.a17;

public interface Queue {
	
	public boolean isEmpty();
	
	public boolean isFull();
	
	public void inQueue(Object data);
	
	public Object outQueue();

}
