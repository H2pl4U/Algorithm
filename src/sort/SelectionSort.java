package sort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 5, 7, 1, 3, 9, 8, 10, 6 };
		selectionSort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	private static void selectionSort(int[] arr) {
		int temp = 0;
		//外循环从头部开始
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			//内循环从i开始遍历，找出本次循环最小元素的下标
			for (int j = i; j < arr.length ; j++) {
				if (arr[j] < arr[min])
					min = j;
			}
			//若下标不等于初始下标则进行交换
			if (i != min) {
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
	}
}
