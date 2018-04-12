package April.a11;

import April.a11.LinkListNode.Node;

public class RealizeLinkList {
	
	private Node first_head = null;
	private int index = 0;
	
	public RealizeLinkList() {
		this.first_head = null;
	}
	
	public void addFirstValue(Object data) {
		Node newNode = new Node(data);
		newNode.next = first_head;
		first_head  = newNode;
	}
	
	public void showLink() throws Exception {
		if(first_head == null) {
			throw new Exception("Empty null");
		}
		Node cur = first_head;
		while(cur != null) {
			System.out.print( cur.data.toString() + "->");
			cur = cur.next;
		}
		System.out.println();
	}
	
	public int getLength() {
		if(first_head == null) {
			return -1;
		}
		int linckLength = 0;
		Node cur = first_head;
		while(cur.next != null) {
			linckLength++;
			cur = cur.next; 
		}
		return linckLength;
	}
	
	public void addIndexValue(int index, Object data) throws Exception {
		RealizeLinkList rl = new RealizeLinkList();
		if(first_head == null) {
			throw new Exception("Empty null");
		}
		if((index >= 0) && (index <= rl.getLength()) ) {
			
		}
	}

}
