import java.util.Arrays;


/**
 * @author BiangHoo
 *
 * 2013Äê9ÔÂ14ÈÕ
 */
public class SplitPositiveNegetiveNumber {

	public static void main(String[] args) {
		int[] array={-3,2,4,-5,-6,-9,1,7,-34,56,-67};
		System.out.println(Arrays.toString(array));
		System.out.println("execute...");
		System.out.println(Arrays.toString(Split(array)));
	}
	
	private static int[] Split(int array[]){
		int len = array.length;
		int minus = 0;
		
		for(int i=1;i<len;i++){
			int key =i-1;
			while(i>0&&array[key]>0&&array[i]<0){
				Swap(array,i,key);
				i = key;
				key =i-1;
			}
		}
		return array;
	} 
	
	private static void Swap(int [] array,int i,int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
