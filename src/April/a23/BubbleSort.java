package April.a23;

public class BubbleSort {
	
	public int[] arr;
	
	public BubbleSort(int[] arr) {
		this.arr = arr;
	}
	
	
	public void SwapAdd(int j) {
		if(this.arr[j] > this.arr[j + 1]) {
			int temp = this.arr[j];
			this.arr[j] = this.arr[j+1];
			this.arr[j+1] = temp;
		}
		else {
			return;
		}
	}
	
	public void SwapSubtraction(int j) {
		if(this.arr[j] < this.arr[j - 1]) {
			int temp = this.arr[j];
			this.arr[j] = this.arr[j-1];
			this.arr[j-1] = temp;
		}
		else {
			return;
		}
	}
	
	public void bsCode() {
		// This is normal function.
		if(this.arr == null) {
			return;
		}
		for(int i = 0; i < this.arr.length - 1; i++) {
			for(int j = 0; j < this.arr.length - i - 1; j++) {
				SwapAdd(j);
			}
		}
		
	}
	
	public void bsCodeChange1() {
		if(this.arr == null) {
			return;
		}
		int n = this.arr.length - 1;
		while(n > 0) {
			int pos = 0;
			for(int j = 0; j < n; j++) {
				if(this.arr[j] > this.arr[j + 1]) {
					pos = j;
					int temp = this.arr[j];
					this.arr[j] = this.arr[j+1];
					this.arr[j+1] = temp;
				}
			}
			n = pos;
		}
	}
	
	
	public void bsCodeChange2() {
		// This function has problem.
		int low = 0;
		int higt = this.arr.length - 1;
		
		while( low < higt) {
			for(int j = low; j < higt; ++j) {
				if(this.arr[j] > this.arr[j + 1]) {
					int temp = this.arr[j];
					this.arr[j] = this.arr[j+1];
					this.arr[j+1] = temp;
				}
				--higt;
			}
			for(int j = higt; j > low; --j) {
				if(this.arr[j] < this.arr[j - 1]) {
					int temp = this.arr[j];
					this.arr[j] = this.arr[j-1];
					this.arr[j-1] = temp;
				}
				++low;
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
