package April.a22;

import April.a21.TestShellSort;

public class TestSelectSort {
	
	public static void main(String[] args) throws Exception {
		TestShellSort tss = new TestShellSort();
		int[] arr = tss.ArrayRandom(10, 100);
		tss.ArrayPrint(arr);
		SelectSort ss = new SelectSort(arr);
		ss.SelectSortCode();
		ss.SelectPrint();
	}

}
