package April.a14;

public interface DoubleLinkedList {
	
	public int Dlength();
	
	public boolean isEmpty();
	
	public void insertTail(int site, Object n) throws Exception;

	public void  delete(int site) throws Exception;
	
	public Object getValue(int site) throws Exception;
	
	public void showLinkList() throws Exception;
	
	public void reverse()throws Exception;
}
