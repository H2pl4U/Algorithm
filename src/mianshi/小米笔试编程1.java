package mianshi;

import java.util.ArrayList;
import java.util.Scanner;

public class С�ױ��Ա��1 {

	/*������������������ʵ����ĿҪ��Ĺ���
	��Ȼ����Ҳ���Բ������������ģ����������ȫ�����Լ����뷨�� ^-^ 
	******************************��ʼд����******************************/
	    static String solution(String[] input) {
	    	String res = "";
	        String str = "";
	        ArrayList<Integer> list = new ArrayList<Integer>(4);
			for(int i=0;i<input.length;i++){
	            for(int j=0;j<input[i].length();j++){
	                if(input[j].charAt(j)==' ') {
	                }
	            }
	            int length = str.length();
	            for (int j = 0; j < length; j++) {
					if(str.charAt(j)=='0') {
						str=str.substring(1)+"0";
					}else {
						if(str.charAt(j)==str.charAt(j+1)) {
						}
					}
				}
	        }
			return str;

	    }
	/******************************����д����******************************/


	    public static void main(String[] args){
	        Scanner in = new Scanner(System.in);
	        String res;
	            
	        int _input_size = 0;
	        _input_size = Integer.parseInt(in.nextLine().trim());
	        String[] _input = new String[_input_size];
	        String _input_item;
	        for(int _input_i = 0; _input_i < _input_size; _input_i++) {
	            try {
	                _input_item = in.nextLine();
	            } catch (Exception e) {
	                _input_item = null;
	            }
	            _input[_input_i] = _input_item;
	        }
	  
	        res = solution(_input);
	        System.out.println(res);
	    }
}
