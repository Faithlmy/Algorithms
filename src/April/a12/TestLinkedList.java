package April.a12;

public class TestLinkedList {
	public static void main(String[] args) throws Exception {
		LinkList ll = new LinkList();
		int length = ll.listLength();
		System.out.println(length);
		System.out.println(ll.isEmpty());
		ll.insert(0, 3);
		ll.showLinkList();
		ll.insert(1, 2);
		ll.showLinkList();
		System.out.println();
		ll.insert(2, 20);
		ll.showLinkList();
		System.out.println();
//		ll.insert(3, 30);
//		ll.showLinkList();
//		System.out.println();
//		System.out.println(ll.isEmpty());
		for(int i = ll.listLength(), j = 10; i < 10; i++) {
			ll.insert(i, j);;
			j++;
		}
		ll.showLinkList();
//		int nl = ll.listLength();
//		System.out.println(nl);
//		System.out.println(ll.getValue(5));
		
	}

}
