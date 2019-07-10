package leetcode;

public class String02 {

	public static void main(String[] args) {
		int i = 1534236469;
		System.out.println(reverse(i));
	}

	static int reverse(int x) {
		boolean f = false;
		String s = String.valueOf(x);
		if (String.valueOf(s.charAt(0)).equals("-")) {
			s = s.substring(1);
			f = true;
		}
		String ss = "";
		for (int i = 0; i < s.length(); i++) {
			ss += String.valueOf(s.charAt(s.length() - 1 - i));
		}
		s = "";
		for (int i = 0; i < ss.length(); i++) {
			s += String.valueOf(ss.charAt(i));
		}
		if (Long.parseLong(s) >= Integer.MAX_VALUE) {
			return 0;
		} else if (f) {
			x = -Integer.parseInt(s.trim());
		} else {
			x = Integer.parseInt(s.trim());
		}
		return x;
	}

}
