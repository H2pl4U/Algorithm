package bishi;

import java.util.ArrayList;
import java.util.Scanner;

public class �����Ƽ����Ա����3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// �����ȡ��������������domainList��
		ArrayList<String> domainList = new ArrayList<String>();
		ArrayList<String> inputList = new ArrayList<String>();
		String str = "";
		// ���ַ����س���������
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
