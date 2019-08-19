package sort;

/**
 * ��������
 * @author ilovejava1314
 *
 */
public class MergeSort {

	public static void main(String[] args) {
		int[] a ={12,20,5,26,35,1,30,45,23,9};
		int start = 0;
		int end =a.length-1;
		sort(a,start,end);
		for(int i = 0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}

	public static int[] sort(int[] a,int low,int high){
        int mid = (low+high)/2;
        if(low<high){
            sort(a,low,mid);
            sort(a,mid+1,high);
            //���ҹ鲢
            merge(a,low,mid,high);
        }
        return a;
    }
	
	public static void merge(int[] a, int low, int mid, int high) {
        int[] temp = new int[high-low+1];
        int i= low;
        int j = mid+1;
        int k=0;
        // �ѽ�С�������Ƶ���������
        while(i<=mid && j<=high){
            if(a[i]<a[j]){
                temp[k++] = a[i++];
            }else{
                temp[k++] = a[j++];
            }
        }
        // �����ʣ������������� 
        while(i<=mid){
            temp[k++] = a[i++];
        }
        // ���ұ߱�ʣ�������������
        while(j<=high){
            temp[k++] = a[j++];
        }
        // ���������е�������nums����
        for(int x=0;x<temp.length;x++){
            a[x+low] = temp[x];
        }
    }
}
