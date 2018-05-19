package April.a19;

@SuppressWarnings("rawtypes")
public interface  TreeList<T extends Comparable> {

	public boolean isEmpty();
	
	public int count(); // return the count of node.
	
	public int height();
	
	public String preOrder();
	
	public String inOrder();
	
	public String postOrder();
	
	public String levelOrder();
	
	public void  insert(T data) throws Exception;
	
	public void remote(T data);
	
	public T maxValue();
	
	public T minValue();
	
	public boolean findValue( Object data);
	
	public BinaryNode findNode(T data);
	
	boolean contains(T data) throws Exception;
	
	public void clear();
	
}
