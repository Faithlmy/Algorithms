package April.a14;

public class DoubleLinkedListRealized implements DoubleLinkedList{
	
	private DoubleNode head;
	private DoubleNode tail;
	private Object data; 
	private int length;
	
	public DoubleLinkedListRealized() {
		DoubleNode dn = new DoubleNode(null); 
		this.head = dn;
		this.tail = dn;
		this.data = null;
		this.length = 0;
	}

	@Override
	public int Dlength() {
		// TODO Auto-generated method stub
		return this.length;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return length == 0;
	}

	
	public void indexTail(int site) throws Exception{
		
		if(site < -1 || site  > length -1 ) {
			throw new Exception("parameter transfinite!");
		}
		else {
			int j = 0;
			DoubleNode front = this.head;
			while( front.tail != null && j < site) {
				front = front.tail;
				j++;
			}
		}
	}
	
	
	@Override
	public void insertTail(int site, Object n) throws Exception {
		// TODO Auto-generated method stub
		if(site < 0 || site  > length ) {
			throw new Exception("Empty null!");
		}
		else {
			int j = 0;
			DoubleNode front = this.head;
			while( front.tail != null && j < site) {
				front = front.tail;
				j++;
			}
			DoubleNode InserNode = new DoubleNode(head, tail, data);
			
		}
		
	}

	@Override
	public void delete(int site) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getValue(int site) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void showLinkList() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reverse() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
