package sort;

/**
 * ð������
 * 
 * @author ilovejava1314
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		Bubblesort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	static void Bubblesort(int[] arr) {
		int temp = 0;
        //��ѭ����֤��ѭ������β���Ѿ�������ɵĲ���
		for (int i = 1; i < arr.length; i++) {
             //��ѭ����ǰ��󣬱�֤ÿ���ҵ�һ�����ֵ
			for (int j = 0; j < arr.length - i; j++) {
                 //���ϴ��ֵ����λ��(����ð��)
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

}
