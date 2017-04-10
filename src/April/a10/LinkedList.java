package April.a10;

public class LinkedList {
	
	private class Node{
		private Object data;
		private Node next = null;
		Node(Object data){
			this.data = data;
		}
	}
	
	private Node first_data = null;
	
	public void insertFirst(Object data) {
		Node n = new Node(data);
		n.next = first_data;
		first_data = n;
	}
	
	public Object deleteFirst() throws Exception{
		if(first_data == null) {
			throw new Exception("Empty null!");
		}
		Node temp = first_data;
		first_data = first_data.next;
		return temp.data;
	}
	
	public Object find(Node data) throws Exception{
		if(first_data ==null)
			throw new Exception("Empty null");
		Node cur = first_data;
		while(cur != null) {
			if(cur.data.equals(data)) {
				return cur.data;
			}
			cur = cur.next;
		}
		return null;
	}
	
	public void remove(Node data) throws Exception{
		if(first_data == null) {
			throw new Exception("Empty null!");
		}
		if(first_data.data.equals(data)) {
			first_data = first_data.next;
		}
		else {
			Node pre = first_data;
			Node cur = first_data.next;
			while(cur != null) {
				if(cur.data.equals(data))
					pre.next = cur.next;
			}
			pre = cur;
			cur = cur.next;
		}
	}
	public void display() throws Exception{
		if(first_data == null) {
			throw new Exception("Empty null!");
		}
		Node cur = first_data;
		while(cur != null) {
			System.out.print(cur.data.toString() + " -> ");
			cur = cur.next;
		}
		System.out.print("\n");
	}

}
