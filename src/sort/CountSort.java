package sort;

public class CountSort {

	public static void main(String[] args) {
		int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		arr = countSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static int[] countSort(int[] array) {
        //�õ���������ֵ����Сֵ�����������ֵd
        int max=array[0];
        int min=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
            }
        }
        int d=max-min;
        //����ͳ�����鲢ͳ�ƶ�Ӧ��Ԫ�ظ���
        int[] countArray=new int[d+1];
        for(int i=0;i<array.length;i++){
            countArray[array[i]-min]++;
        }
        //ͳ�����������Σ���ߵ�Ԫ�ص���ǰ���Ԫ��֮��
        for(int i=1;i<countArray.length;i++){
            countArray[i]+=countArray[i-1];
        }
        //�������ԭʼ���飬��ͳ���������ҵ���ȷ��λ�ã�������������
        int[] sortedArray=new int[array.length];
        for(int i=array.length-1;i>=0;i--){
            //��sortedArray�ĵ�ǰλ�ø�ֵ
            sortedArray[countArray[array[i]-min]-1]=array[i];
            //��countArray��λ�õ�ֵ--
            countArray[array[i]-min]--;
        }
        return sortedArray;
    }

}
