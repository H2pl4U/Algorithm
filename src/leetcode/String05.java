package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class String05 {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}

	static boolean isPalindrome(String s) {
		ArrayList<Character> list = new ArrayList<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (s.toCharArray()[i] >= 'A' && s.toCharArray()[i] <= 'Z') {
				list.add( s.toCharArray()[i]);
			} else if (s.toCharArray()[i] >= 'a' && s.toCharArray()[i] <= 'z') {
				list.add( s.toCharArray()[i]);
			} else if (s.toCharArray()[i] >= '0' && s.toCharArray()[i] <= '9') {
				list.add( s.toCharArray()[i]);
			}
		}
		if(list.isEmpty()) {
			return false;
		}
		System.out.println(list.get(list.size()/2));
		if(list.size()%2!=0) {
			list.remove(list.size()/2);
		}
		List<Character> list2 = list.subList(0, list.size()/2);
		Collections.reverse(list2);
		for (Character c : list2) {
			System.out.println(c);
		}
		System.out.println(list.subList(list.size()/2,list.size()).toString());
		if(list2.toString().equalsIgnoreCase(list.subList(list.size()/2,list.size()).toString())) {
			return true;
		}
		return false;
	}

}
