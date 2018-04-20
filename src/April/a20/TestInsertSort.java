package April.a20;

public class TestInsertSort {
	public static void main(String[] args) {
//		int[] a = {12, 0, 4, 3, 8, 5, 2};
		int[] b = {9, 1, 56, 34,2};
		InsertSort insertsort = new InsertSort(b);
		insertsort.printRes();
		insertsort.insertSort();
		insertsort.printRes();
	}

}
