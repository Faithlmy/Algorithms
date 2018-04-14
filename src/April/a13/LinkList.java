package April.a13;

public class LinkList implements List{
	
	private Node head;
	private Node current;
	private int nodeNum;
	private Node last;
	
	// Initializing an empty linked list
	public LinkList(){
		this.head = current = new Node(null);
		this.nodeNum = 0;
		this.last = head.next;
	}
	
	public void indexTail(int site) throws Exception{
		if(site < -1 || site  > nodeNum -1 ) {
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
	public void insertTail(int site, Object n) throws Exception {
		// TODO Auto-generated method stub
		if(site < 0 || site  > nodeNum ) {
			throw new Exception("Empty null!");
		}
		else {
			indexTail(site -1 );
			Node node = new Node(n, current.next);
			current.setNext(node);
			nodeNum++;
		}
	}
	
	@Override
	public void insertHead(int length, Object n) throws Exception {
		// TODO Auto-generated method stub
		if(length == 1) {
			Node node = new Node(null);
			node.data = n;
			nodeNum++;
			System.out.println(123);
			System.out.println(nodeNum);
			System.out.println(node.getNext());
		}
		else {
			Node node = new Node(n, current);
			current.setHead(node);
			nodeNum++;
		}
		
	}
	
	@Override
	public Object getValue(int site) throws Exception {
		// TODO Auto-generated method stub
		if(site < -1 || site > nodeNum-1 ) {
			throw new Exception("parameter transfinite!");
		}
		else {
			indexTail(site);
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
			indexTail(site - 1);
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
			if(nodeNum == 1) { // print the normal linked list
				System.out.println(current.data.toString() + "->");
			}
			if(current != null && last == null) {
				while(nodeNum > 1 && nodeNum > j) {
					System.out.print(current.data.toString() + "->");
					current = current.next;
					j++;
				}
				System.out.println();
			}
			if(last != null) { // print reversed linked list
				Node c = last;
				while(nodeNum > 1 && nodeNum > j) {
					System.out.print(c.data.toString() + "->");
					c = c.next;
					j++;
				}
				System.out.println();
			}
		}
		
	}

	@Override
	public void reverse() throws Exception {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new Exception("Empty linked list!");
		}
		if(nodeNum ==0) {
		}
		else {
			Node pre = null;
			Node cur = head.next;
			Node next = cur.next;
			System.out.println(next.data);
			while(next != null) {
				cur.next = pre;
				pre = cur;
				cur = next;
				next = cur.next;
			}
			cur.next = pre;
			last = cur; // for show linked list
		}
	}

}
