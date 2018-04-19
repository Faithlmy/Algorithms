package April.a19;

public interface  TreeList<T> {

	public boolean isEmpty();
	
	public int count(); // return the count of node.
	
	public int height();
	
	public Object preOrder();
	
	public Object inOrder();
	
	public Object postOrder();
	
	public Object levelOrder();
	
	public void  insert(T data) throws Exception;
	
	public void remote(Object data);
	
	public Object maxValue();
	
	public Object minValue();
	
	public boolean findValue( Object data);
	
	public void clear();
	
}
