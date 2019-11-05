package bishi;

import java.util.ArrayList;
import java.util.Scanner;

public class �����Ƽ����Ա����1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ļ�input.txt���ݣ�");
		ArrayList<String> inputList = new ArrayList<String>();
		String str = "";
		//���ַ����س���������
		while(!(str=sc.nextLine()).equals("")) {
			inputList.add(str);
		}
		System.out.println("�ļ�keyword.conf���ݣ�");
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
