package sort;

/**
 * 冒泡排序
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
        //外循环保证内循环不管尾部已经排序完成的部分
		for (int i = 1; i < arr.length; i++) {
             //内循环从前向后，保证每次找到一个最大值
			for (int j = 0; j < arr.length - i; j++) {
                 //将较大的值交换位置(向上冒泡)
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

}
