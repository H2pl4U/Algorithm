package sort;

public class Insertion {

	public static void main(String[] args) {
		int[] arr = {4,2,5,7,1,3,9,8,10,6};
		sort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i; // ������¼��Сֵ������λ�ã�Ĭ��ֵΪi
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // ���� i+1~length ��ֵ���ҵ�������Сֵ��λ��
                }
            }
            // ������ǰ���� i ����Сֵ���� minIndex ������ֵ
            if (i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
            // ִ����һ��ѭ������ǰ���� i ����ֵΪ��Сֵ��ֱ��ѭ�����������������
        }

    }

}
