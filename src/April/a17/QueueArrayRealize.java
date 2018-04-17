package April.a17;

public class QueueArrayRealize  implements Queue {
	
	static final int defaultsize = 10;
    private Object[] queue;
    private int maxSize;
    private int head;
    private int end;
    private int count;

    public QueueArrayRealize() {
    	init(defaultsize);
    }
    
    public QueueArrayRealize(int length) {
    	init(length);
    }
    
    public void init(int size) {
    	queue = new Object[size];
    	maxSize = size;
    	head = end = 0;
    	count = 0;
    }

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return count == 0;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return maxSize == queue.length;
	}

	@Override
	public void inQueue(Object data) throws Exception {
		if(count == queue.length){
			throw new Exception("Queue is full! The max size is: " + queue.length);
		}
		queue[end] = data;
		end++;
		count++;
	}

	@Override
	public Object outQueue() throws Exception {
		// TODO Auto-generated method stub
		
		if(count == 0 && head == end ) {
			throw new Exception(" Queue is empty!");
		}
		Object obj = queue[head];
		if(count != 0) {
			head++;
			count--;
		}
		return obj;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		this.head = 0;
		this.end = 0;
	}

	@Override
	public void showQueue() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
