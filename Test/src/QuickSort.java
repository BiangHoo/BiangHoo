import java.util.Arrays;


/**
 * @author Bangwen Chen
 *
 * 2013Äê9ÔÂ10ÈÕ
 */
public class QuickSort {

	public static void main(String []args){
		int array[]={10,4,9,7,23,0,5,79,1,8,0};
		Sort(array,0,array.length-1);
		System.out.println(Arrays.toString(array));
	}
	
	private static void Sort(int array[],int low,int high){
		if(low>=high){
			return;
		}
			int middle = FindMiddle(array,low,high);
			Sort(array,low,middle-1);
			Sort(array,middle+1,high);
	}
	
	private static int FindMiddle(int array[],int low,int high){
		int key = array[low];
		while(low<high){
			while(low<high&&array[high]>=key){
				high--;
			}
			array[low] = array[high];
			while(low<high && array[low] < key){
				low++;
			}
			array[high] = array[low];
		}
			array[high] = key;
		return high;
	}
}
