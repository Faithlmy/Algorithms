package April.a11;

public class LinkListNode {

	public static class Node{
		protected Object data;
		protected Node next;
		
		public Node(Object data) {
			this.data = data;
		}

		public Node() {
			// TODO Auto-generated constructor stub
		}

		public void display() {
			System.out.println("The node is: " + data );
		}
	}
	
	public static class add{
		public add() {
			
		}
		public int add(int a, int b) {
			return a + b;
		}
	}
	
	public static class plus{
		public static class faith{
			public faith() {}
			public int faith(int a, int b) {
				return a + b;
			}
		}
	}
}
