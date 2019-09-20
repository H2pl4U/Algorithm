package bishi;

/*
 *	2019/9/05 CVTE 笔试算法1
 *特殊计数器，开始计数12345 12345678910 123...20 ...
 *计数器的最大值每次乘二，输入一个数，返回计数器的值
 *如输入1 返回1，输入15返回10 
 *
 *ac
 */
public class CVTE0905Test1 {

	public static void main(String[] args) {
		System.out.println(getTime(15));
	}

	public static int getTime(int n) {
		int count = 5;
		while (count < n) {
			n = n - count;
			count *= 2;
		}

		return n;
	}

}
