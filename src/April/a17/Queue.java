package April.a17;

public interface Queue {
	
	public boolean isEmpty();
	
	public boolean isFull();
	
	public void inQueue(Object data) throws Exception;
	
	public Object outQueue() throws Exception;
	
	public void clear();
	
	public void showQueue() throws Exception;

}
