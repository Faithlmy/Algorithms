package April.a11;

import April.a11.LinkListNode.Node;
import April.a11.LinkListNode.add;
import April.a11.LinkListNode.plus.faith;

public class TestLinkList {
	public static void main(String[] args) throws Exception {
//		Node n = new Node();
//		n.display();
//		add a = new add();
//		faith f = new faith();
//		int a_res  = f.faith(3, 7);
//		System.out.println(a_res);
		
		RealizeLinkList rl = new RealizeLinkList();
		for(int i =0; i < 5; i++) {
			rl.addFirstValue(i);
		}
		rl.showLink();
		
		int linklength = rl.getLength();
		System.out.println(linklength);
	}

}
