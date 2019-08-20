package sort;

/**
 * ������
 * @author ilovejava1314
 *
 */
public class HeadSort {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 5, 7, 1, 3, 9, 8, 10, 6 };
		headSort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public static void headSort(int[] list) {
		// �����ʼ��,�ӵ�һ����Ҷ�ӽڵ㿪ʼ����,���Һ��ӽڵ��нϴ�Ľ��������ڵ���
		for (int i = (list.length) / 2 - 1; i >= 0; i--) {
			headAdjust(list, list.length, i);
		}
		// ���򣬽����Ľڵ���ڶ�β��Ȼ��Ӹ��ڵ����µ���
		for (int i = list.length - 1; i >= 1; i--) {
			int temp = list[0];
			list[0] = list[i];
			list[i] = temp;
			headAdjust(list, i, 0);
		}
	}

	private static void headAdjust(int[] list, int len, int i) {
		int k = i, temp = list[i], index = 2 * k + 1;
		while (index < len) {
			if (index + 1 < len) {
				if (list[index] < list[index + 1]) {
					index = index + 1;
				}
			}
			if (list[index] > temp) {
				list[k] = list[index];
				k = index;
				index = 2 * k + 1;
			} else {
				break;
			}
		}
		list[k] = temp;
	}

}
