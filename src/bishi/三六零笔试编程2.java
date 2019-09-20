package bishi;

import java.util.Scanner;

public class ��������Ա��2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = in.nextInt();
		}
		int res = angleEnable(nums);
		System.out.println(res);
		in.close();
	}
		 
		 
	public static int angleEnable(int[] nums) {
		//����߳���2���϶�����ʵ��
		if (nums == null || nums.length <= 2) return -1;
		//������ n-1�ߵĺʹ�����ߣ�������ɷ�ն����
		         
		int sum = 0; //ǰN����֮��
		int max = 0;//ǰN�����е����ֵ
		for (int i = 0; i < nums.length ; i++) {
			sum += nums[i];
			max = max > nums[i] ? max : nums[i];
			//���i > 1�����������1��˵��ֻ��2���ߣ�������ζ����ɲ��˵ģ�
			//����sum - max > max����ǰN���в���Max��ֵ֮�ʹ���Max��˵���ҵ��ˣ�ֱ�ӷ���
			//���ע�� + 1 ����Ϊi��0��ʼ
			if (i > 1 && sum > 2 * max) return i + 1;
		}
		//���������ж���������˵��������
		return -1;
	}
		 
}

