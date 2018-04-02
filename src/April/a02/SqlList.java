package April.a02;

public class SqlList<T> {
	private int length;
	private T[] table;

	public T get(int index) {
		if (index >= 0 && index <= this.length)
			return (T) this.table[index];
		return null;
	}
	
	public T set(int index, T data) {
		if(index >= 0 && index <= this.length && data != null) {
			T old = (T)this.table[index];
			this.table[index] = data;
			return old;
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public boolean add(int index, T data) {
		// Deal with the value of edge.
		if(data == null)
			return false;
		if(index < 0)
			index = 0;
		if(index > this.length)
			index = this.length;
		
		// Deal with the full of array.
		if(this.length == table.length) {
			Object[] temp = this.table;
			this.table = (T[]) new Object [temp.length*2];
			for(int i = 0; i < index; i++) {
				 this.table[i] = (T) temp[i];
			}
		}
		
		// index the value.
		for(int j=this.length - 1; j >= index; j--) {
			this.table[ j + 1] = this.table[j];
		}
		this.table[index] = data;
		this.length++;
		
		return true;
	}
}
