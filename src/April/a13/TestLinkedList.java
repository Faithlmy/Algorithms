package April.a13;

public class TestLinkedList {
	public static void main(String[] args) throws Exception {
		LinkList ll = new LinkList();
//		ll.insertHead(3, 1);
//		int length = ll.listLength();
////		
//		System.out.println(length);
//		System.out.println(ll.isEmpty());
//		ll.showLinkList();
//
//		ll.insertHead(0, 3);
//		ll.showLinkList();
//		int length2 = ll.listLength();
//		System.out.println(length2);
//		System.out.println(ll.isEmpty());
//		
//		Object v = ll.getValue(0);
//		System.out.println(v);
//		ll.insertHead(1, 2);
//		ll.showLinkList();
//		System.out.println();
//		int length3 = ll.listLength();
//		System.out.println(length3);
//		
//		System.out.println();
//		ll.insertBefore(2, 6);
//		ll.showLinkList();
//		System.out.println();
//		ll.insert(3, 30);
//		ll.showLinkList();
//		System.out.println();
		
		
//		System.out.println(ll.isEmpty());
//		Node node = new Node();
		for(int i = 0, j = 10; i < 5; i++) {
			ll.insertTail(i, j);;
			j++;
		}
		int nl = ll.listLength();
		System.out.println(nl);
//		System.out.println(ll.getValue(4));
		ll.showLinkList();
		ll.delete(1);
		ll.reverse();
//		System.out.println(ll.getValue(1));
		ll.showLinkList();
//		ll.insertAfter(4, 100);
//		ll.showLinkList();
		
	}

}
