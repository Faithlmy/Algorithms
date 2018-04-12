package April.a12;

public class Node {
	
	Object data;
	Node next;
	
	// The construction method of head node
	public Node(Node next) {
		this.next = next;
	}
	
	// The construction method of nohead node
	public Node(Object data, Node next) {
		this.data = data;
		this.next = next;
	}
	
	public Object getData() {
		return this.data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Node getNext() {
		return this.next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	public String toString() {
		return this.data.toString();
	}
	
	
}
