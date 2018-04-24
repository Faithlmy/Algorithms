package April.a24;

import April.a21.RandomArray;
import April.a23.BubbleSort;

public class TestQuick {
	
	public static void main(String[] args) throws Exception {
		RandomArray ra = new RandomArray();
		int[] a = ra.ArrayRandom(1000000, 10000000);
//		long startTime2 = System.currentTimeMillis();
//		ra.ArrayPrint();
//		long endTime2 = System.currentTimeMillis();
//		System.out.println(endTime2 - startTime2);
		
		QuickSort qs = new QuickSort(a);
		long startTime = System.currentTimeMillis();
		qs.QuickCode(a, 0, a.length - 1);
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
//		qs.QuickPrint();
		
		
		BubbleSort bs = new BubbleSort(a);
		long startTime1 = System.currentTimeMillis();
		bs.bsCode();
		long endTime1 = System.currentTimeMillis();
		System.out.println(endTime1 - startTime1);
//		bs.BubblePrint();
		
		
		
		
//		
	}

}
