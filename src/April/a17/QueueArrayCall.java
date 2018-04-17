package April.a17;

public class QueueArrayCall {
	private QueueArrayRealize qr;
	
	
	public QueueArrayCall() {
		qr = new QueueArrayRealize();
	}
	
	public void inQueueQ(Object data) throws Exception {
		qr.inQueue(data);
	}
	
	public void outQueueQ() throws Exception {
		String ob = "";
		while(!qr.isEmpty()) {
			System.out.print(qr.outQueue() + " ");
		}
		System.out.println();
	}
}
