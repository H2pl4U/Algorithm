package leetcode;

import java.math.BigInteger;

public class Array07_2 {

	public static void main(String[] args) {
		int[] arr = {9,9,9,9,9,9,9,9,9,9,9,7};
		int[] arr1=plusOne(arr);
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println(arr1.length);
	}
	public static int[] plusOne(int[] digits) {
		String s="";
		for (int i = 0; i < digits.length; i++) {
			s+=digits[i];
		}
		BigInteger num1 = new BigInteger(s);
		BigInteger num2 = new BigInteger("1");
		BigInteger num3 = new BigInteger("10");
        int[] arr=null;
        if(num1.bitLength()<num1.add(num2).bitLength()) {
        	arr = new int[digits.length+1];
        	for(int i = 1;i< arr.length;i++) {
        		arr[i]=0;
        	}
        	arr[0]=1;
        }else {
        	num1=num1.add(num2);
        	arr = new int[digits.length];
        	for(int i=digits.length-1;i>=0;i--){
                arr[i]=num1.remainder(num3).intValue();
                num1=num1.subtract(num1.remainder(num3));
                num1=num1.divide(num3);
            }
        }
        return arr;
    }
}
