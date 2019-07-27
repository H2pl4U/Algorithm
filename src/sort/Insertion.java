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
            int minIndex = i; // 用来记录最小值的索引位置，默认值为i
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // 遍历 i+1~length 的值，找到其中最小值的位置
                }
            }
            // 交换当前索引 i 和最小值索引 minIndex 两处的值
            if (i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
            // 执行完一次循环，当前索引 i 处的值为最小值，直到循环结束即可完成排序
        }

    }

}
