package April.a01;

public class Node<T> {
	public T data;
	public Node next;
	
	public Node(T data){
		this.data = data;
	}
}

class Mylinklist{
	public Node head;
	public Node current;
	
	// link the linklist
	public void add(int data) {
		if (head == null) {
			head = new Node(data);
			current = head;
		}
		else {
			current.next = new Node(data);
			current = current.next;
		}
	}
	
	// print linklist
	@SuppressWarnings("rawtypes")
	public void print(Node node) {
		
	}
}
