package bishi;

import java.util.ArrayList;
import java.util.Scanner;

public class 数美科技笔试编程题3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 假设读取出来域名都存入domainList中
		ArrayList<String> domainList = new ArrayList<String>();
		ArrayList<String> inputList = new ArrayList<String>();
		String str = "";
		// 空字符串回车跳出输入
		while (!(str = sc.nextLine()).equals("")) {
			inputList.add(str);
		}
		ArrayList<String> resultList = func(domainList, inputList);
		for (String strs : resultList) {
			System.out.println(strs);
		}
		sc.close();
	}

	private static ArrayList<String> func(ArrayList<String> domainList, ArrayList<String> inputList) {
		ArrayList<String> resultList = new ArrayList<String>();
		for (String inStr : inputList) {
			for (String domain : domainList) {
				domain = domain.substring(1);
				int size = 0;
				if (inStr.contains(domain) && size < domain.length()) {
					size = domain.length();
					resultList.add('*' + domain);
				}
			}
		}
		return resultList;
	}

}
