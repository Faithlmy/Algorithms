package April.a18;

public class Test {
	public static void main(String[] args) throws Exception {
		QueueLinkedRealize ql = new QueueLinkedRealize();
		for(int i = 0; i < 3; i++) {
			ql.inQueue(i);
		}
		ql.inQueue("A");
		ql.outQueue();
	}

}
