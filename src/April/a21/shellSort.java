package April.a21;

public class shellSort {

	private int site;
	private int[] arr;
	
	public shellSort() {}
	
	public shellSort(int[] arr) {
		this.arr = arr;
		this.site = 0;
	}
	
	public void shellSite(int[] arr) {
		this.arr = arr;
		int site = arr.length / 2;
		while(site >= 1) {
			shellSort(site);
			site = arr.length / 2;
		}
	}
	
	public void shellSort(int site) {
		arr = this.arr;
		for(int i = site; i < arr.length;  i++) {
			if(arr[i] < arr[i - site]) {
				int j;
				int x = arr[i];
				for(j = i - arr[i - site]; j > 0 && x < arr[j]; j = j - arr[i - site]) {
					arr[i + site] = arr[j];
				}
				arr[i + site]  = x;
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
