package bishi;

import java.util.ArrayList;
import java.util.Scanner;

public class 数美科技笔试编程题1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("文件input.txt内容：");
		ArrayList<String> inputList = new ArrayList<String>();
		String str = "";
		//空字符串回车跳出输入
		while(!(str=sc.nextLine()).equals("")) {
			inputList.add(str);
		}
		System.out.println("文件keyword.conf内容：");
		ArrayList<String> keywordList = new ArrayList<String>();
		while(!(str=sc.nextLine()).equals("")) {
			keywordList.add(str);
		}
		ArrayList<String> resultList = func(inputList,keywordList);
		for (String strs : resultList) {
			System.out.println(strs);
		}
		sc.close();
	}

	private static ArrayList<String> func(ArrayList<String> inputList, ArrayList<String> keywordList) {
		ArrayList<String> resultList = new ArrayList<String>();
		for (String keyword : keywordList) {
			for (String inStr : inputList) {
				int index = 0;
				while(inStr.charAt(index)!=' ') {
					index++;
				}
				String str=inStr.substring(0, index);
				if(str.contains(keyword)) {
					resultList.add(inStr);
				}
			}
		}
		return resultList;
	}

}
