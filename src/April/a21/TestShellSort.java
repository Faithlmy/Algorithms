package April.a21;

public class TestShellSort {
	public static void main(String[] args) {
		int[] a = {2, 90, 4, 23, 45, 1, 5};
		shellSort ss = new shellSort(a);
		ss.shellSite(a);
//		ss.shellSort();
		ss.shellPrint();
	}

}
