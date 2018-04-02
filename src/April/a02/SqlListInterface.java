package April.a02;

public interface SqlListInterface<T> {
	// Determine whether or not double link list is empty.
	boolean isEmpty();
	
	// the length of dll
	int length();
	
	// get elements
	T get(int index);
	
	// set elements
	T set(int index, T data);
	
	// add elements according to index.
	boolean add(int index, T data);
	
	// add elements
	boolean add(T data);
	
	// remote elements according to index.
	T remote(int index, T data);
	
	// remote elements
	boolean remote(T data);
	
	// 
	boolean remoteAll(T data);
	
	// clear link list
	void clear();
	
	// where it include data or not
	boolean contains(T data);
	
	// Query subscript according data
	int indexOf(T data);
	
	// Query subscript that the last link list according data
	int lastIndexOf(T data);
	
	// the format of print
	String toString();
}









