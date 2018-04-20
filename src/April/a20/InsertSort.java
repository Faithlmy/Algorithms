package April.a20;

public class InsertSort {
	
	private int[] arr;
	
	public InsertSort(int[] arr) {
		this.arr = arr;
	}

	
	public void insertSort() {
		int[] arr = this.arr;
		for(int i = 0; i < arr.length; i++) {
			int j;
			int x = arr[i];
			for(j = i; j > 0 && x < arr[j-1]; j--) {
				arr[j] = arr[j-1];
			}
			arr[j] = x;
		}
	}
	
	public void printRes() {
		for(int i = 0; i < this.arr.length; i++) {
			System.out.print(this.arr[i] + ", ");
		}
		System.out.println();
	}
}
