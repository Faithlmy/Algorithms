package April.a15;

public class StackArrayRealize<T>  implements Stack {
	
	private int maxSize;
	private int top;
	private char[] arr;
	
	public StackArrayRealize() {}
	public StackArrayRealize(int size) {
		this.maxSize = size;
		this.top = -1;
		arr = new char[maxSize];
		//https://www.cnblogs.com/y3596597/p/6832225.html
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == -1;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return maxSize - 1 == top;
	}

	@Override
	public void push(Object data) {
		// TODO Auto-generated method stub
		arr[++top] = (char) data;
		
	}

	@Override
	public Object peak() {
		// TODO Auto-generated method stub
		return arr[top];
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		return arr[top--];
	}
	@Override
	public Object bottem() {
		// TODO Auto-generated method stub
		return arr[0];
	}
	
	
}
