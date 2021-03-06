package April.a12;

public class LinkList implements List{
	
	private Node head;
	private Node current;
	private int nodeNum;
	
	// Initializing an empty linked list
	public LinkList(){
		this.head = current = new Node(null);
		this.nodeNum = 0;
	}
	
	public void index(int site) throws Exception{
		if(site < -1 || site > nodeNum - 1 ) {
			throw new Exception("parameter transfinite!");
		}
		else {
			if(site == -1) {
				return;
			}
			current = head.next;
			int j = 0;
			while( current != null && j < site) {
				current = current.next;
				j++;
			}
		}
	}

	@Override
	public Object getValue(int site) throws Exception {
		// TODO Auto-generated method stub
		if(site < -1 || site > nodeNum - 1 ) {
			throw new Exception("parameter transfinite!");
		}
		else {
			index(site);
		}
		return current.getData();
	}
	
	@Override
	public int listLength() {
		// TODO Auto-generated method stub
		return this.nodeNum;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return nodeNum == 0;
	}

	public void insert(int site, Object n) throws Exception {
		// TODO Auto-generated method stub
		if(site < 0 || site > nodeNum) {
			throw new Exception("Empty null!");
		}
		else {
			index(site - 1);
			Node node = new Node(n, current.next);
			current.setNext(node);
			nodeNum++;
		}
	}

	@Override
	public void delete(int site) throws Exception {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new Exception("Empty linked list!");
		}
		if(site < 0 || site > nodeNum) {
			throw new Exception("Empty null!");
		}
		else {
			index(site - 1);
			current.setNext(current.next.next);
			nodeNum--;
		}
	}

	@Override
	public void showLinkList() throws Exception{
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new Exception("Empty linked list!");
		}
		else {
			current = head.next;
			int j = 0;
			if(nodeNum == 1) {
				System.out.println(current.data.toString() + "->");
			}
			else {
				while(nodeNum > 1 && nodeNum > j) {
					System.out.print(current.data.toString() + "->");
					current = current.next;
					j++;
				}
			}
			
		}
		
	}

}
