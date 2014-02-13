import java.util.Arrays;


public class ShellSort {

	public static void main(String[] args) {
		int array[]={10,4,9,7,23,0,5,79,1,8,0};
		new ShellSort().Sort(array);
		System.out.println(Arrays.toString(array));

	}
	
	public void  Sort(int array[]){
		int len = array.length;
		int gap;
		
		for(gap =len/2;gap>0;gap /= 2){
			for(int i=gap;i<len;i++){
				int key = i-gap;
				int tmp = array[i];
				while(key>=0&&array[key]>tmp){
					array[i] =array[key];
					i = key;
					key =i-gap;
				}
				array[i] = tmp;
			}
			}
		}

}
