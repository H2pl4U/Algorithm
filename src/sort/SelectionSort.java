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
		//��ѭ����ͷ����ʼ
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			//��ѭ����i��ʼ�������ҳ�����ѭ����СԪ�ص��±�
			for (int j = i; j < arr.length ; j++) {
				if (arr[j] < arr[min])
					min = j;
			}
			//���±겻���ڳ�ʼ�±�����н���
			if (i != min) {
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
	}
}
