package bishi;

/*
 *	2019/9/05 CVTE �����㷨1
 *�������������ʼ����12345 12345678910 123...20 ...
 *�����������ֵÿ�γ˶�������һ���������ؼ�������ֵ
 *������1 ����1������15����10 
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
