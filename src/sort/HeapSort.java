package sort;

/**
 * ������
 * @author ilovejava1314
 */
public class HeapSort {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 5, 7, 1, 3, 9, 8, 10, 6 };
		headSort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	//�������� 
	public static void headSort(int[] list) {
		buildHeap(list);
		//�Ѷ������Ԫ��,��β����,ÿ�ν�ͷβ����
		for (int i = list.length-1; i >= 0; i--) {
			swap(list, i, 0);
			//������(�������Ԫ��)
			heapAdjust(list, i, 0);
		}
	}
	
	//�����Ѻ���
	public static void buildHeap(int[] list) {
		int len = list.length;
		//�ҵ����һ��Ҷ�ӽ��ĸ��ڵ�
		int parent = (len - 2) / 2;
		//�Ӹýڵ㿪ʼ��������
		for (int i = parent; i >= 0; i--) {
			heapAdjust(list, len, i);
		}
	}

	//�����Ѻ���
	private static void heapAdjust(int[] list, int len, int i) {
		if (i >= len)
			return;
		// ������
		int c1 = 2 * i + 1;
		// ������
		int c2 = 2 * i + 2;
		int max = i;
		//�ҳ��ⲿ�����ֵ
		if (c1 < len && list[c1] > list[max]) {
			max = c1;
		}
		if (c2 < len && list[c2] > list[max]) {
			max = c2;
		}
		//�����ֵ���λ�û���
		if (max != i) {
			swap(list, max, i);
			heapAdjust(list, len, max);
		}

	}

	//��������
	private static void swap(int[] list, int max, int i) {
		int temp = list[max];
		list[max] = list[i];
		list[i] = temp;
	}

}
