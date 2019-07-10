package leetcode;

public class String04 {

	public static void main(String[] args) {
		String s = "abcde";
		String t = "aebcd";
		System.out.println(isAnagram(s, t));
	}
	static boolean isAnagram(String s, String t) {
		if (s.length() != t.length())
            return false;
 
        int[] sArray = new int[26];
        int[] tArray = new int[26];
 
        for (int i = 0; i < s.length(); i++) {
            sArray[s.charAt(i)-97] ++;
            tArray[t.charAt(i)-97] ++;
        }
        for (int i = 0; i < 26; i++) 
            if (sArray[i]!=tArray[i])
                return false;
 
        return true;
    }

}
