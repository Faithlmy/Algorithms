package April.a13;

import April.a13.Node;

public interface List {
	
	public int listLength();
	
	public boolean isEmpty();
	
	public void insertTail(int site, Object n) throws Exception;
	
	public void insertHead(int length, Object n) throws Exception;
	
	public void  delete(int site) throws Exception;
	
	public Object getValue(int site) throws Exception;
	
	public void showLinkList() throws Exception;
	
}
