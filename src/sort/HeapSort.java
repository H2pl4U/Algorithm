package sort;

/**
 * 堆排序
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

	//堆排序函数 
	public static void headSort(int[] list) {
		buildHeap(list);
		//堆顶是最大元素,从尾遍历,每次将头尾交换
		for (int i = list.length-1; i >= 0; i--) {
			swap(list, i, 0);
			//调整堆(不管最大元素)
			heapAdjust(list, i, 0);
		}
	}
	
	//创建堆函数
	public static void buildHeap(int[] list) {
		int len = list.length;
		//找到最后一个叶子结点的父节点
		int parent = (len - 2) / 2;
		//从该节点开始遍历调整
		for (int i = parent; i >= 0; i--) {
			heapAdjust(list, len, i);
		}
	}

	//调整堆函数
	private static void heapAdjust(int[] list, int len, int i) {
		if (i >= len)
			return;
		// 左子树
		int c1 = 2 * i + 1;
		// 右子树
		int c2 = 2 * i + 2;
		int max = i;
		//找出这部分最大值
		if (c1 < len && list[c1] > list[max]) {
			max = c1;
		}
		if (c2 < len && list[c2] > list[max]) {
			max = c2;
		}
		//将最大值与根位置互换
		if (max != i) {
			swap(list, max, i);
			heapAdjust(list, len, max);
		}

	}

	//交换函数
	private static void swap(int[] list, int max, int i) {
		int temp = list[max];
		list[max] = list[i];
		list[i] = temp;
	}

}
