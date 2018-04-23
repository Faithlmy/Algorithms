package April.a23;

import April.a21.RandomArray;

public class TestBubble {
	
	public static void main(String[] args) throws Exception {
		RandomArray ra = new RandomArray();
		int[] a = ra.ArrayRandom(10, 100);
		ra.ArrayPrint();
		BubbleSort bs = new BubbleSort(a);
		bs.bsCode();
		bs.BubblePrint();
	}

}
