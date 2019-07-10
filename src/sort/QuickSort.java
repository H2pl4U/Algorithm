package sort;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] a ={12,20,5,26,35,1,30,45,23,9};
		int start = 0;
		int end =a.length-1;
		sort(a,start,end);
		for(int i = 0;i<a.length;i++){
			System.out.println(a[i]);
		}
		

	}

	private static void sort(int[] a, int low, int high) {
		int start = low;
		int end = high;
		int key = a[start];
		while(end>start){
			while(end>start&&a[end]>=key)
				end--;
			if(a[end]<=key){
				int temp = a[end];
				a[end] = a[start];
				a[start] = temp;
			}
			while(end>start&&a[start]<=key)
				start++;
			if(a[start]>=key) {
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
			}
		}
		if(start>low) sort(a,low,start-1);
		if(end<high) sort(a,end+1,high);
		
	}

}
