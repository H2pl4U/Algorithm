package mianshi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 * ��Ŀ������
Ϊ�˼���������û�������������ڵ����ڽ�����֯��һ�δ������а�Ļ���ڻ�ڼ�, д������������ǰ���û�����ö�Ӧ�Ľ�����������Ϊ���֡��Ż�ȯ������ֵ���ࡣΪ���û����Ȥζ�ԣ���ͬ�������û�����ò�ͬ���͵ļ�����ͬʱ��Ϊ�˱�֤��������Ч�ʣ������༤���Ტ�з��š�

���ǰ����������һ�£��ٶ���һ���������ŵ��࣬������ʾ��

class ReviewEncourage {

  public ReviewEncourage(int n) { ... }      // ���캯��,nΪ�н��û���

    PrizePool�����һ��send������ʵ�����£�

    public class PrizePool {

        public void send(String input) {

            System.out.print(input);

        }

    }


  public void bonus(PrizePool prizePool) { ... }  // ���ܴ�ӡA����ʾ���Ż���

  public void coupon(PrizePool prizePool) { ... }  // ���ܴ�ӡB����ʾ�����Ż�ȯ

  public void contribution(PrizePool prizePool) { ... }  // ���ܴ�ӡC����ʾ���Ź���ֵ

}

ͬһ��ReviewEncourageʵ�����ᴫ�ݸ�������ͬ���߳����ڼ������ţ�

1.���ַ����߳̽������bonus�������Ż���

2.�Ż�ȯ�����߳̽������coupon���������Ż�ȯ

3.����ֵ�����߳̽������contribution�������Ź���ֵ

Ҫ�����ζԲ�ͬ��λ���û����Ų�ͬ���͵Ľ�����������λΪ�������û����Ż��֣���λΪż�����û����淢���Ż�ȯ�͹���ֵ��

����һ��5���н��û���Ҫ��Ե�һ���û����Ż��֣��ڶ����û������Ż�ȯ���������û����Ż��֣����ĸ��û����Ź���ֵ��������û����Ż��֣������ABACA

Ҫ��ȫ���ϴ��룬���ָ���ַ�������

����
���û���n��n����0��С�ڵ���100

���
��A��B��C��ɵ��ַ���������Ϊn������λΪA��ż��λ����ΪB��C

��ʾ: �������������߳��첽ִ�У�����ִ֤��˳��


��������
1
�������
A

��ʾ
��������2
4
�������2
ABAC

��������3
5
�������3
ABACA
��������4
10
�������4
ABACABACAB
 */

public class ���ű��Ա��2 {

	public static void main(String[] args) {
		

	}

	

}
