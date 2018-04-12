package April.a12;

import April.a12.Node;

public interface List {
	
	public int listLength();
	
	public boolean isEmpty();
	
	public void insert(int site, Object n) throws Exception;
	
	public void  delete(int site) throws Exception;
	
	public Object getValue(int site) throws Exception;
	
	public void showLinkList() throws Exception;
	
}
