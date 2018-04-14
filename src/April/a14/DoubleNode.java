package April.a14;

public class DoubleNode {
	
	DoubleNode tail;
	Object data;
	DoubleNode head;
	
	public DoubleNode(Object data) {
		this.data = data;
	}
	public DoubleNode(DoubleNode head, DoubleNode tail, Object data) {
		this.head = head;
		this.tail = tail;
		this.data = data;
	}
	

	public DoubleNode getHead() {
		return head;
	}
	public void setHead(DoubleNode head) {
		this.head = head;
	}
	public DoubleNode getTail() {
		return tail;
	}
	public void setTail(DoubleNode tail) {
		this.tail = tail;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String toString() {
		return this.data.toString();
	}

}
