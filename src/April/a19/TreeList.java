package April.a19;

public interface  TreeList {

	public boolean isEmpty();
	
	public int count(); // return the count of node.
	
	public int height();
	
	public Object preOrder();
	
	public Object inOrder();
	
	public Object postOrder();
	
	public Object levelOrder();
	
	public void  insert(Object data);
	
	public void remote(Object data);
	
	public Object maxValue();
	
	public Object minValue();
	
	public boolean findValue( Object data);
	
	public void clear();
	
}
