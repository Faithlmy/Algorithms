package April.a25;

public class mergeSort {
	int[] arr;
	int left;
	int right;
	int center;
	
	public mergeSort(int[] arr) throws Exception{
		if(arr == null) {
			throw new Exception("null array");
		}else if(arr.length == 1) {
			throw new Exception("the length of array is 1");
		}
		else {
			this.arr = arr;
			this.left = 0;
			this.right = this.arr.length;
//			this.center = (this.left + this.right)/2;
			sort(this.arr, this.left, this.right);
		}
	}
	
	 public  void sort(int[] data, int left, int right) {    
	        if (left >= right)    
	            return;    
	        // 找出中间索引    
	        int center = (left + right) / 2;    
	        // 对左边数组进行递归    
	        sort(data, left, center);    
	        // 对右边数组进行递归    
	        sort(data, center + 1, right);    
	        // 合并    
	        merge(data, left, center, right);       
	    }    
	
	private void merge(int[] data, int letf, int center, int right) {
		 // 临时数组    
        int[] tmpArr = new int[data.length];    
        // 右数组第一个元素索引    
        int mid = center + 1;    
        // third 记录临时数组的索引    
        int third = left;    
        // 缓存左数组第一个元素的索引    
        int tmp = left;    
        while (left <= center && mid <= right) {    
            // 从两个数组中取出最小的放入临时数组    
            if (data[left] <= data[mid]) {    
                tmpArr[third++] = data[left++];    
            } else {    
                tmpArr[third++] = data[mid++];    
            }    
        }    
        // 剩余部分依次放入临时数组（实际上两个while只会执行其中一个）    
        while (mid <= right) {    
            tmpArr[third++] = data[mid++];    
        }    
        while (left <= center) {    
            tmpArr[third++] = data[left++];    
        }    
        // 将临时数组中的内容拷贝回原数组中    
        // （原left-right范围的内容被复制回原数组）    
        while (tmp <= right) {    
            data[tmp] = tmpArr[tmp++];    
        }    
	}
	
	public void mergePrint() {
		for(int i = 0; i <this.arr.length; i++) {
			System.out.print(this.arr[i] + ", ");
		}
		System.out.println();
	}

}
