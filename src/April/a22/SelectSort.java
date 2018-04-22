package April.a22;

public class SelectSort {

	public int[] arr;
	public SelectSort(int[] arr) {
		this.arr = arr;
	}
	public void SelectSortCode() {
		for(int i = 0; i < this.arr.length; i++) {
			int k = i;
			for( int j = i + 1; j < this.arr.length; j++) {
				if(this.arr[k] > this.arr[j]) {
					k = j;
				}
			}
			swap1(k, i);
		}
	}
	
	private void swap(int i, int j) { 
		// This is a exchange mode
		if(i == j) {
			return;
		}
		this.arr[i] = this.arr[i] + this.arr[j];
		this.arr[j] = this.arr[i] - this.arr[j];
		this.arr[i] = this.arr[i] - this.arr[j];
	}
	
	private void swap1(int i, int j) {
		// This is another exchange mode
		if(i == j) {
			return;
		}
		int a;
		a = this.arr[i];
		this.arr[i] = this.arr[j];
		this.arr[j] = a;
	}
	
	public void SelectPrint() {
		for(int i = 0; i <this.arr.length; i++) {
			System.out.print(this.arr[i] + ", ");
		}
		System.out.println();
	}
}
