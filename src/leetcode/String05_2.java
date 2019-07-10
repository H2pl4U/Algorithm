package leetcode;

public class String05_2 {

	public static void main(String[] args) {
		String s = "race  b e car";
		System.out.println(isPalindrome(s));
	}

	static boolean isPalindrome(String s) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			if (s.toCharArray()[i] >= 'A' && s.toCharArray()[i] <= 'Z') {
				sb.append(s.charAt(i));
			} else if (s.toCharArray()[i] >= 'a' && s.toCharArray()[i] <= 'z') {
				sb.append(s.charAt(i));
			} else if (s.toCharArray()[i] >= '0' && s.toCharArray()[i] <= '9') {
				sb.append(s.charAt(i));
			}
		}
		if(sb.equals("")) {
			return false;
		}
		if(sb.substring(0, sb.length()/2).equalsIgnoreCase(sb.reverse().substring(0,sb.length()/2))) {
			return true;
		}
		return false;
	}

}
