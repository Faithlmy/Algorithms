package April.a24;

public class QuickSort {
	
	int[] arr;
	
	public QuickSort(int[] arr) {
		this.arr = arr;
	}

	public void QuickCode(int[] arr, int low, int high) {
		if(low < high) {
			int mid = QuickMid(low, high);
			QuickCode(arr, low, mid - 1 );
			QuickCode(arr, mid + 1, high);
		}
		
	}


	private int QuickMid(int low, int high) {
		int key = this.arr[low];
		while(low < high) {
			while(low < high && this.arr[high] >= key) {
				high--;
			}
			this.arr[low] = this.arr[high];
			while(low<high && this.arr[low] <= key) {
				low++;
			}
			this.arr[high] = this.arr[low];
		}
		this.arr[low] = key;
		return low;
	}
	
	public void QuickPrint() {
		for(int i = 0; i <this.arr.length; i++) {
			System.out.print(this.arr[i] + ", ");
		}
		System.out.println();
	}

}
