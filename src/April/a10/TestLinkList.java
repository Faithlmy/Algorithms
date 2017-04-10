package April.a10;

public class TestLinkList {
	public static void main(String[] args) throws Exception {
		LinkedList ll = new LinkedList();
		for(int i = 1; i < 5;  i++) {
			ll.insertFirst(i);
		}
		ll.display();
//		ll.deleteFirst();
//		ll.deleteFirst();
		ll.insertFirst(10);
		ll.display();
//		ll.remove(3);
		ll.display();
	}

}
