package April.a12;

public class TestLinkedList {
	public static void main(String[] args) throws Exception {
		LinkList ll = new LinkList();
		int length = ll.listLength();
		System.out.println(length);
		System.out.println(ll.isEmpty());
		for(int i = 0, j = 10; i < 3; i++) {
			ll.insert(i, 8);;
			j++;
		}
		int nl = ll.listLength();
		System.out.println(nl);
//		System.out.println(ll.getValue(5));
		ll.showLinkList();
	}

}
