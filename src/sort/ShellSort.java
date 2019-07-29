package sort;

import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {
		int[] arr = {3,2,5,6,9,7,1,4,8};
		shellSort(arr);
	}

	public static void shellSort(int[] arr) {
		// inc������
		int temp = 0;
		int j = 0;
		// ����Ĭ���ǳ��ȵ�һ�룬ÿ�α�Ϊ֮ǰ��һ�룬ֱ��������������
		for (int inc = arr.length / 2; inc >= 1; inc /= 2) {
			for (int i = inc; i < arr.length; i++) {
				temp = arr[i];
				// ����ǰ�������ȥ����֮��λ�õ������бȽϣ�������ڵ�ǰ������������
				for (j = i - inc; j >= 0; j -= inc) {
					if (arr[j] > temp) {
						arr[j + inc] = arr[j];
					} else {
						break;
					}
				}
				// ����ǰ���ŵ��ճ�����λ��
				arr[j + inc] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));

	}
}
