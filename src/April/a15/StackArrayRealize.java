package April.a15;

public class StackArrayRealize<T>  implements Stack {
	
	private int maxSize;
	private int top;
	T[] arr;
	
	public StackArrayRealize() {}
	public StackArrayRealize(int size) {
		this.maxSize = size;
		this.top = -1;
		//https://www.cnblogs.com/y3596597/p/6832225.html
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void push(Object data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object peak() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
