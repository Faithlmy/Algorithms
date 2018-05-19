package April.a19;

public class BinaryTree<T>  implements TreeList  {
	
	protected BinaryNode<T> root;
	
	private int conut;
	
	public BinaryTree() {
		this.root = null;
	}
// https://blog.csdn.net/javazejian/article/details/53727333
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int height() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String preOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String inOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String postOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String levelOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Comparable data) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remote(Comparable data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Comparable maxValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comparable minValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean findValue(Object data) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BinaryNode findNode(Comparable data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(Comparable data) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}


}
