package leetcode;

public class String08 {

	public static void main(String[] args) {
		System.out.println(countAndSay(4));
		
	}
	static String countAndSay(int n) {
	        if(n == 1){
	            return "1";
	        }
	        //�ݹ���ã�Ȼ����ַ�������
	        String str = countAndSay(n-1) + "*";//Ϊ��strĩβ�ı�ǣ�����ѭ������
	        char[] c = str.toCharArray();
	        int count = 1;
	        StringBuilder s = new StringBuilder();
	        for(int i = 0; i < c.length - 1;i++){
	            if(c[i] == c[i+1]){
	                count++;//��������
	            }else{
	                //s.append(s);
	                s.append("" + count + c[i]);//�����*������﷽��ͳһ����
	                count = 1;//��ʼ��
	            }
	        }
	        return s.toString();
    }

}
