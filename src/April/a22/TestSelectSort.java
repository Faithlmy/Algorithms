package April.a22;

import April.a21.RandomArray;

public class TestSelectSort {
	
	public static void main(String[] args) throws Exception {
		RandomArray ra = new RandomArray();
		int[] arr = ra.ArrayRandom(10, 100);
		System.out.println("The origin array is: ");
		ra.ArrayPrint();
		SelectSort ss = new SelectSort(arr);
		ss.SelectSortCode();
		System.out.println("The swap array is: ");
		ss.SelectPrint();
	}

}
