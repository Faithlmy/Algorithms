package April.a19;

public class BinaryTree<T extends Comparable>  implements TreeList<T>  {
	
	protected BinaryNode<T> root;
	
	private int conut;
	
	public BinaryTree() {
		this.root = null;
	}

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
	public void insert(T data) throws Exception {
		// TODO Auto-generated method stub
		if(data == null) {
			throw new Exception("no data.");
		}
		root = insert(data, root);
		
	}

	private BinaryNode<T> insert(T data, BinaryNode<T> root2) {
		// TODO Auto-generated method stub
		if(root2 == null) {
			root2 = new BinaryNode(data, null, null);
		}
		int compareResult=data.compareTo(root2.data);
		
		if(compareResult < 0) {
			root2.left = insert(data, root2.left);
		}
		if(compareResult > 0) {
			root2.right = insert(data, root2.right);
		}
		return root2;
	}
	
	@Override
	public void remote(T data) throws Exception {
		// TODO Auto-generated method stub
		if(data == null) {
			throw new Exception("no data");
		}
		root = remote(data, root);
	}

	private BinaryNode<T> remote(T data, BinaryNode<T> root2) {
		// TODO Auto-generated method stub
		if(root2 == null) return root2;
		@SuppressWarnings("unchecked")
		int compareResult = data.compareTo(root2.data);
		if(compareResult < 0) {
			root2.left = remote(data, root2.left);
		}else if(compareResult > 0) {
			root2.right = remote(data, root2.right);
		}else if(root2.left != null && root2.right != null) {
//			root2.data = findMin( root2.data).data;
			root2.right = remote( root2.data, root2.right);
		}else {
			root2=(root2.left!=null)? root2.left : root2.right;
		}
		
		return root2;
	}
	@Override
	public T maxValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T minValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean findValue(Object data) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BinaryNode findNode(T data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(T data) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public T findMin() throws Exception {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new Exception("Empty tree");
		}
		
		return null;
	}


}
