package leetcode;

public class String03 {

	public static void main(String[] args) {
		System.out.println(firstUniqChar("abccbacd"));
	}
	static int firstUniqChar(String s) {
		int index=-1;
		for (int i = 0; i < s.length(); i++) {
			if(!(((s.substring(0, i)+s.substring(i+1))).contains(String.valueOf(s.charAt(i))))) {
				return i;
			}
		}
        return index;
    }

}
