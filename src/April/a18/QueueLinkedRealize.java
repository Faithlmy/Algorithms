package April.a18;

public class QueueLinkedRealize implements Queue{
	
	private Node head;
	private Node end;
	private int count;
	
	public QueueLinkedRealize() {
		end = new Node();
		end.setNext(end);
		head = end;
		count = 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return head == end;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	public void inQueue(Object data) throws Exception {
		// TODO Auto-generated method stub
		Node p = new Node(data);
		p.setNext(end.getNext());
		end.setNext(p);
		end = p;
		count++;
	}

	@Override
	public void outQueue() throws Exception {
		// TODO Auto-generated method stub
		Node p = head.getNext();
		if(head == end) {
			throw new Exception("Empty Queue!");
		}
		while(p!=head) {
			System.out.print(p.getData() + " ");
			p = p.getNext();
		}
		System.out.println();
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showQueue() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
