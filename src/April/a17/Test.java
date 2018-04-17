package April.a17;

public class Test {
	public static void main(String[] args) throws Exception {
		QueueArrayCall qac = new QueueArrayCall();
		for(int i = 0; i < 8; i++) {
			qac.inQueueQ(i);
		}
		qac.outQueueQ();
	}

}
