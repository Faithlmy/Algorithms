package April.a19;

public class BinaryNode<T> {
	
	public BinaryNode<T> left;
	
	public BinaryNode<T> right;
	
	public T data;
	
	public BinaryNode(T data, BinaryNode<T> left, BinaryNode<T> right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	public BinaryNode(T data) {
		this(data, null, null);
	}
	
	public boolean isLeft() {
		return this.left == null && this.right == null;
		
	}

}
