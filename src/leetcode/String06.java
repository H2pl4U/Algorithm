package leetcode;

import java.math.BigInteger;

public class String06 {

	public static void main(String[] args) {
		String s = "            -42";
		System.out.println(myAtoi(s));
		
	}
static int myAtoi(String str) {
	str=str.trim();
	if(str=="-"||str=="+"||str.equals("")) {
		return 0;
	}
	StringBuffer sb = new StringBuffer();
	if(str.charAt(0)=='-'||(str.charAt(0)>='0'&&str.charAt(0)<='9')||str.charAt(0)=='+') {
		sb.append(str.charAt(0));
	}else {
		return 0;
	}
	for (int i = 1; i < str.length(); i++) {
		if(str.charAt(i)>='0'&&str.charAt(i)<='9') {
			sb.append(str.charAt(i));
		}else {
			break;
		}
	}
	if(sb.toString().equals("-")||sb.toString().equals("+")){
        return 0;
    }
	BigInteger b1 = new BigInteger(sb.toString());
	BigInteger b2 = new BigInteger(Integer.MAX_VALUE+"");
	BigInteger b3 = new BigInteger(Integer.MIN_VALUE+"");
	if(b1.max(b2).equals(b1)) {
		return Integer.MAX_VALUE;
	}else if(b1.min(b3).equals(b1)) {
		return Integer.MIN_VALUE;
	}else {
		return Integer.parseInt(b1.toString());
	}
    }
}
