package sort;

/**
 * 插入排序
 * 
 * @author ilovejava1314
 *
 */
public class Insertion {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 5, 7, 1, 3, 9, 8, 10, 6 };
		insertionSort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public static void insertionSort(int[] arr) {
		//从下标为1开始查找，前面仅一个元素，默认有序
		for (int i = 1; i < arr.length; i++) {
			//记录要插入的数据
			int temp = arr[i];
			int j = i;
			//从已经排序的最右端开始比较，找到比其小的数
			while (j > 0 && temp < arr[j - 1]) {
				arr[j] = arr[j - 1];
				j--;
			}
			//存在的话插入
			if (j != i) {
				arr[j] = temp;
			}
		}
	}

}
