package leetcode;

public class Math02 {

	public static void main(String[] args) {
		System.out.println(countPrimes(150000));
	}
	static int countPrimes(int n) {
		int count = 1;
		boolean f = false;
		if(n==0||n==1||n==2) {
			return 0;
		}
		for (int i = 3; i < n; i++) {
			for(int j = 2 ; Math.sqrt(i) >=j ; j ++ ){
				if(i%j==0) {
					f=true;
					break;
				}   
        }
			if(!f) {
				count++;
			}
			f=false;
		}
		return count;
        
    }

}
