package leetcode;

public class Array07_1 {

	public static void main(String[] args) {
		int[] arr = {9,9,9,9,9,9,9,9,9,9,9,9};
		int[] arr1=plusOne(arr);
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println(arr1.length);
	}
	public static int[] plusOne(int[] digits) {
		digits[digits.length-1]++;
		if(digits[digits.length-1]<10) {
			return digits;
		}else {
			int[] arr = null;
			for (int i = digits.length-1; i >0; i--) {
				if(digits[i]==10) {
					digits[i]=0;
					digits[i-1]++;
				}
			}
			if(digits[0]==10) {
				arr=new int[digits.length+1];
				arr[0]=1;
				return arr;
			}else {
				return digits;
			}
		}
    }
}
