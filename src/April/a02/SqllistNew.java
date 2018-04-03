package April.a02;

@SuppressWarnings("rawtypes")
public class SqllistNew<T> implements SqlListInterface{
	
	private int length;
	private T[] table;
	

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		System.out.println(99);
		return false;
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		if (index >= 0 && index <= this.length)
			return (T) this.table[index];
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object set(int index, Object data) {
		// TODO Auto-generated method stub
		if(index >= 0 && index <= this.length && data != null) {
			T old = (T)this.table[index];
			this.table[index] = (T) data;
			return old;
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean add(int index, Object data) {
		// TODO Auto-generated method stub
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
		this.table[index] = (T) data;
		this.length++;
		
		return true;
	}

	@Override
	public boolean add(Object data) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object remote(int index, Object data) {
		// TODO Auto-generated method stub
		if(index > 0 && index < this.length && this.length != 0) {
			T old = (T)this.table[index];
			for(int j = index; j < this.length - 1; j++) {
				this.table[j] = this.table[j+1];
			}
			this.table[this.length - 1] = null;
			this.length --;
			return old;
		}
		return null;
	}

	@Override
	public boolean remote(Object data) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remoteAll(Object data) {
		// TODO Auto-generated method stub
		boolean d = false;
		if(this.length != 0 && data != null) {
			int i = 0;
			while(i < this.length) {
				if(data.equals(this.table[i])) {
					this.remote(i);
					d = true;
				}
				else
					i++;
			}
		}
		return d;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object data) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int indexOf(Object data) {
		// TODO Auto-generated method stub
		if(data != null) {
			for(int i = 0; i < this.length; i++) {
				if(data.equals(this.table[i]))
					return i;
			}
		}
		return -1;
	}

	@Override
	public int lastIndexOf(Object data) {
		// TODO Auto-generated method stub
		if(data != null) {
			for(int i =this.length - 1; i >=0; i--) {
				if(data.equals(this.table[i]))
					return i;
			}
		}
		return -1;
	}

}
