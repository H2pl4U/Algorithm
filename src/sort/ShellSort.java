package sort;

import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {
		int[] arr = {3,2,5,6,9,7,1,4,8};
		shellSort(arr);
	}

	public static void shellSort(int[] arr) {
		// inc是增量
		int temp = 0;
		int j = 0;
		// 增量默认是长度的一半，每次变为之前的一半，直到最终数组有序
		for (int inc = arr.length / 2; inc >= 1; inc /= 2) {
			for (int i = inc; i < arr.length; i++) {
				temp = arr[i];
				// 将当前的数与减去增量之后位置的数进行比较，如果大于当前数，将他后移
				for (j = i - inc; j >= 0; j -= inc) {
					if (arr[j] > temp) {
						arr[j + inc] = arr[j];
					} else {
						break;
					}
				}
				// 将当前数放到空出来的位置
				arr[j + inc] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));

	}
}
