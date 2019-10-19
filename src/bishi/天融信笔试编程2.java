package bishi;

import java.util.Scanner;

//ac
public class ÌìÈÚĞÅ±ÊÊÔ±à³Ì2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] array = new char[str.length()];
		for (int i = 0; i < array.length; i++) {
			array[i] = str.charAt(i);
		}
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length-i; j++) {
				if(array[j]>array[j+1]) {
					char temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		for (char c : array) {
			System.out.print(c);
		}
		sc.close();
	}
}
