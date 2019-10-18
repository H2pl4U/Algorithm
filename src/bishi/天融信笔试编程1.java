package bishi;

import java.util.Scanner;

public class 天融信笔试编程1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int EnglishCount = 0,blankCount = 0,numberCount=0,otherCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch>='0'&&ch<='9') numberCount++;
			else if(ch>='a'&&ch<='z') EnglishCount++; 
			else if(ch>='A'&&ch<='Z') EnglishCount++; 
			else if(ch==' ') blankCount++;
			else otherCount++;
		}
		System.out.println("英文字母: "+EnglishCount);
		System.out.println("空格: "+blankCount);
		System.out.println("数字: "+numberCount);
		System.out.println("其它字符: "+otherCount);
		sc.close();
	}

}
