package April.a17;

public class QueueArrayRealize  implements Queue {
	
    private Object[] queue;
    private int size;
    private int head;
    private int end;

    public QueueArrayRealize() {}
    
    public QueueArrayRealize(int length) {
    	queue = new Object[length];
    	int size = 0;
    }

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return size == queue.length;
	}

	@Override
	public void inQueue(Object data) {
		
	}

	@Override
	public Object outQueue() {
		// TODO Auto-generated method stub
		return null;
	}

}
