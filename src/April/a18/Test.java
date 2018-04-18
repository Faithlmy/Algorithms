package April.a18;

public class Test {
	public static void main(String[] args) throws Exception {
		QueueLinkedRealize ql = new QueueLinkedRealize();
		for(int i = 0; i < 100; i++) {
			ql.inQueue(i);
		}
		ql.outQueue();
	}

}
