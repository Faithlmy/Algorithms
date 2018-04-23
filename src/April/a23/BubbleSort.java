package April.a23;

public class BubbleSort {
	
	public int[] arr;
	
	public BubbleSort(int[] arr) {
		this.arr = arr;
	}
	
	public void bsCode() throws Exception {
		if(this.arr == null) {
			return;
		}
		for(int i = 0; i < this.arr.length - 1; i++) {
			for(int j = 0; j < this.arr.length - i - 1; j++) {
				if(this.arr[j]  > this.arr[j + 1]) {
					int temp = this.arr[j];
					this.arr[j] = this.arr[j+1];
					this.arr[j+1] = temp;
				}
			}
		}
		
	}
	
	public void BubblePrint() {
		for(int i = 0; i <this.arr.length; i++) {
			System.out.print(this.arr[i] + ", ");
		}
		System.out.println();
	}

}
