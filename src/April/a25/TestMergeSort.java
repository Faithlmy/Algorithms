package April.a25;

import April.a21.RandomArray;

public class TestMergeSort {
	
	public static void main(String[] args) throws Exception {
		RandomArray ra = new RandomArray();
		int[] a = ra.ArrayRandom(10, 100);
		ra.ArrayPrint();
		
		mergeSort ms = new mergeSort(a);
		ms.mergePrint();
	}

}
