package leetcode;

public class Array07_3 {

	public static void main(String[] args) {
		int[] arr = {9,9,9,9,9,9,9,9};
		int[] arr1=plusOne(arr);
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println(arr1.length);
	}
	public static int[] plusOne(int[] digits) {
		long num =0;
        for(int i=digits.length-1;i>=0;i--){
            num+=digits[i]*Math.pow(10,(digits.length-i-1));
        }
        num+=1;
        System.out.println(num);
        int[] arr =null;
        if((num+"").length()>((num-1)+"").length()) {
        	arr = new int[digits.length+1];
        	for(int i = 1;i< arr.length;i++) {
        		arr[i]=0;
        	}
        	arr[0]=1;
        }else {
        	arr = new int[digits.length];
        	for(int i=digits.length-1;i>=0;i--){
                arr[i]=(int)num%10;
                num-=arr[i];
                num/=10;
            }
        }
        
        return arr;
    }
}
