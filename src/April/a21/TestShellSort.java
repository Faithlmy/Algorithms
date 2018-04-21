package April.a21;

public class TestShellSort{
	public static void main(String[] args) throws Exception {
		TestShellSort ts = new TestShellSort();
		int[] ar =ts.ArrayRandom(10, 100);
		shellSort ss = new shellSort(ar);
		ts.ArrayPrint(ar);
		ss.shellSort(2);
		ss.shellPrint();
	}
	
	public void ArrayPrint(int[] arr) throws Exception{
		if(arr == null) {
			throw new Exception("no array parameter.");
		}
		for(int i = 0; i <arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
	}
	

	
	public  int[] ArrayRandom(int num, int size) throws Exception{
		if(num <= 0 || size <= 0) {
			throw new Exception("error parameter.");
		}
		int[] arr = new int[num];
		for(int i = 0; i < num; i++) {
			arr[i] = (int)(Math.random() * size);
		}
		return arr;
	}
}
