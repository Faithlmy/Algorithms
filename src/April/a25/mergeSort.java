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
			this.center = (this.left + this.right)/2;
		}
	}
	
	public void merge() {
		int mid = this.center + 1;
		int[] tempArr = new int[this.arr.length]; 
		int aleft = this.left;
		/*
		 *         while (left <= center && mid <= right) {    
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
		 * */
		while(this.left <= center && mid <= right) {
			if(this.arr[left] <= this.arr[mid]) {
				tempArr[aleft++] = this.arr[left++];
			}
			else {
				tempArr[aleft++] = this.arr[mid++];
			}
		}
	}
	
	

}
