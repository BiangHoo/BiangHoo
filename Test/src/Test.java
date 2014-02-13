import java.util.Arrays;


/**
 * @author Bangwen Chen
 *
 * 2013Äê9ÔÂ10ÈÕ
 */
public class Test {


	public static void main(String[] args) {
		int array[]={10,4,9,7,23,5,79,1,8};
		System.out.println(Arrays.toString(array));
		System.out.println("Sorting...");
		
		System.out.println(Arrays.toString(Sort(array)));
	}
	
	static int[] Sort(int [] array){
		
		int len = array.length;
		int temp,key;
		
		for(int i=1;i<len;i++){
			key = i;
			temp = array[i];
			while(key>0 && array[key-1]>temp){
				array[key] = array[key-1];
				key--;
			}
			array[key] = temp;
		}
		return array;
	} 
}
