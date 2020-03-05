package sort;

/**
 * 快速排序
 * 
 * @author ilovejava1314
 *
 */
public class QuickSort {

	public static void main(String[] args) {
		int[] a = { 12, 20, 5, 26, 35, 1, 30, 45,5, 23, 9 };
		int start = 0;
		int end = a.length - 1;
		quickSort2(a, start, end);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

	private static void quickSort(int[] a, int low, int high) {
		int start = low;
		int end = high;
		int key = a[start];
		while (end > start) {
			//从后往前扫描，找出比第一个元素小的索引
			while (end > start && a[end] >= key)
				end--;
			//如果确实小于则交换值
			if (a[end] < key) {
				swap(a,start,end);
			}
			while (end > start && a[start] <= key)
				start++;
			if (a[start] > key) {
				swap(a,start,end);
			}
		}
		if (start > low)
			quickSort(a, low, start - 1);
		if (end < high)
			quickSort(a, end + 1, high);
	}

	private static void swap(int[] a, int start, int end) {
		int temp = a[start];
		a[start] = a[end];
		a[end] = temp;
	}
	
	
	private static void quickSort2(int[] a, int low, int high) {
		int start = low,end = high;
		int num = a[low];
		while(start < end) {
			while(start < end && a[end] >= num)
				end--;
			if(a[end] < num) {
				swap(a,start,end);
			}
			while(start < end && a[start] <= num)
				start++;
			if(a[start] > num) {
				swap(a,start,end);
			}
			if(start > low) {
				quickSort2(a, low, start-1);
			}
			if(end < high) {
				quickSort2(a, end+1, high);
			}
		}
	}
	
	
	

}
