package April.a21;

public class RandomArray {
	
	int[] arr;
	
	public RandomArray() {};

	public void ArrayPrint() throws Exception{
		int[] arr = this.arr;
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
		this.arr = new int[num];
		for(int i = 0; i < num; i++) {
			this.arr[i] = (int)(Math.random() * size);
		}
		return this.arr;
	}
}
