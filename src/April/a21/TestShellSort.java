package April.a21;

public class TestShellSort{
	public static void main(String[] args) throws Exception {
		RandomArray ra = new RandomArray();
		int[] ar =ra.ArrayRandom(10, 100);
		System.out.println("The origin array is: ");
		ra.ArrayPrint();
		
		shellSort ss = new shellSort(ar);
		ss.shellSort(2);
		System.out.println("The swap array is: ");
		ss.shellPrint();
	}

}
