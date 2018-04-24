package April.a17;

public class QueueArrayRealize  implements Queue {
	
    Object[] queue;
    private int size;

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
		return false;
	}

	@Override
	public void inQueue(Object data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object outQueue() {
		// TODO Auto-generated method stub
		return null;
	}

}
