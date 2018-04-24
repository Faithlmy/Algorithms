package April.a24;

import April.a21.RandomArray;

public class TestQuick {
	
	public static void main(String[] args) throws Exception {
		RandomArray ra = new RandomArray();
		int[] a = ra.ArrayRandom(100, 1000);
		ra.ArrayPrint();
		
		QuickSort qs = new QuickSort(a);
//		long startTime = System.currentTimeMillis();
		qs.QuickCode(a, 0, a.length - 1);
//		long endTime = System.currentTimeMillis();
		qs.QuickPrint();
//		System.out.println(endTime - startTime);
		
		
		
		
		
//		
	}

}
