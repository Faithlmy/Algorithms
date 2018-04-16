package April.a16;

public class StackLinkedRealize implements Stack{
	
	private Node top;
	private int size;
	
	public StackLinkedRealize() {
		this.top = null;
		this.size = 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.top == null;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void push(Object data) {
		// TODO Auto-generated method stub
		Node node = new Node(data, top);
		this.top = node;
		size++;
		// https://blog.csdn.net/jdhanhua/article/details/6599466
		
	}

	@Override
	public Object peak() {
		// TODO Auto-generated method stub
		return this.top.getData();
	}

	@Override
	public Object pop() {
		Node oldTop = this.top;
		if(this.top == null) {
			return null;
		}
		this.top = this.top.getNext();
		this.size--;
		// TODO Auto-generated method stub
		return oldTop.getData();
	}

	@Override
	public Object bottem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		this.top = null;
		this.size = 0;
	}

}
