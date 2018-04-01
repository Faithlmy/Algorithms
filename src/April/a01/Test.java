package April.a01;

public class Test {
	
	public LinkList linklist = new LinkList();
	public void testAddlastlist() {
		linklist.addHeadNode(1);
		linklist.addHeadNode(2);
		linklist.addHeadNode(3);
		linklist.addHeadNode(4);
		linklist.addHeadNode(5);
		linklist.printLinklist();
	}
	
	public void testAddheadlist() {
		linklist.addHeadNode(1);
		linklist.addHeadNode(2);
		linklist.addHeadNode(3);
		linklist.addHeadNode(4);
		linklist.addHeadNode(5);
		linklist.printLinklist();
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.testAddheadlist();
		t.testAddlastlist();
	} 

}
