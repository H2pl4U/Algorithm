package sort;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {9,8,7,6,5,4,3,2,1};
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	static void sort(int[] arr) {
		int temp = 0;
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i; j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}
