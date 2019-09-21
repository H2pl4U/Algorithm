package sort;

/**
 * 并归排序
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

	// 二路归并
	private static void merge(int[] arr, int l, int m, int r) {
		int leftSize = m - l;
		int rightSize = r - m + 1;
		// 数组切分为l-m和m+1-r两部分
		int[] left = new int[leftSize];
		int[] right = new int[rightSize];
		// 给left数组赋值
		for (int i = l; i < m; i++) {
			left[i - l] = arr[i];
		}
		// 给right数组赋值
		for (int i = m; i <= r; i++) {
			right[i - m] = arr[i];
		}
		// i指向left，j指向right，k指向arr
		int i = 0, j = 0, k = l;
		// 把较小的数先移到新数组中
		while (i < leftSize && j < rightSize) {
			if (left[i] < right[j]) {
				arr[k++] = left[i++];
			} else {
				arr[k++] = right[j++];
			}
		}
		// 把左边剩余的数移入数组
		while (i < leftSize) {
			arr[k++] = left[i++];
		}
		// 把右边剩余的数移入数组
		while (i < rightSize) {
			arr[k++] = right[j++];
		}
	}

}
