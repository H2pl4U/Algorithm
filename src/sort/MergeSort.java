package sort;

/**
 * ��������
 * 
 * @author ilovejava1314
 *
 */
public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 12, 20, 5, 26, 35, 1, 30, 45, 23, 9 };
		int L = 0;
		int R = arr.length - 1;
		mergeSort(arr, L, R);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void mergeSort(int[] arr, int l, int r) {
		if (l == r)
			return;
		else {
			int m = (l + r) / 2;
			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);
			merge(arr, l, m + 1, r);
		}
	}

	// ��·�鲢
	private static void merge(int[] arr, int l, int m, int r) {
		int leftSize = m - l;
		int rightSize = r - m + 1;
		// �����з�Ϊl-m��m+1-r������
		int[] left = new int[leftSize];
		int[] right = new int[rightSize];
		// ��left���鸳ֵ
		for (int i = l; i < m; i++) {
			left[i - l] = arr[i];
		}
		// ��right���鸳ֵ
		for (int i = m; i <= r; i++) {
			right[i - m] = arr[i];
		}
		// iָ��left��jָ��right��kָ��arr
		int i = 0, j = 0, k = l;
		// �ѽ�С�������Ƶ���������
		while (i < leftSize && j < rightSize) {
			if (left[i] < right[j]) {
				arr[k++] = left[i++];
			} else {
				arr[k++] = right[j++];
			}
		}
		// �����ʣ�������������
		while (i < leftSize) {
			arr[k++] = left[i++];
		}
		// ���ұ�ʣ�������������
		while (i < rightSize) {
			arr[k++] = right[j++];
		}
	}

}
