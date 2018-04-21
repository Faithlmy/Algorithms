package April.a21;

public class shellSort {

	private int[] arr;
	
	public shellSort() {}
	
	public shellSort(int[] arr) {
		this.arr = arr;
	}
	
	public void shellSort(int size) { // find the site
		int s = this.arr.length / size;
		while(s >= 1) {
			ShellSortCore(this.arr, s); // sorted
			s = s/size;
		}
	}
	
	private void ShellSortCore(int[] a, int site) {
		for(int i = site; i < a.length;  i++) {
			if(a[i] < a[i - site]) {
				int j;
				int x = a[i];
				a[i] = a[i-site];
				for(j = i - site; j >= 0 && x < a[j]; j = j - site) {
					a[j + site] = a[j];
				}
				a[j + site]  = x;
			} 
		}
	}
	
	public void shellPrint() {
		for(int i = 0; i <this.arr.length; i++) {
			System.out.print(this.arr[i] + ", ");
		}
		System.out.println();
	}
}
