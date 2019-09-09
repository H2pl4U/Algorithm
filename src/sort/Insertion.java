package sort;

/**
 * ��������
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
		//���±�Ϊ1��ʼ���ң�ǰ���һ��Ԫ�أ�Ĭ������
		for (int i = 1; i < arr.length; i++) {
			//��¼Ҫ���������
			int temp = arr[i];
			int j = i;
			//���Ѿ���������Ҷ˿�ʼ�Ƚϣ��ҵ�����С����
			while (j > 0 && temp < arr[j - 1]) {
				arr[j] = arr[j - 1];
				j--;
			}
			//���ڵĻ�����
			if (j != i) {
				arr[j] = temp;
			}
		}
	}

}
