import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BucketTest{

	public static void Sorting(int[] data,ArrayB [] bucket) {
		int index=0;
		int i;
        for(i=0;i<10;i++){
        	int len=bucket[i].arraylist.size();
        	if(len==0){
        		continue;
        	}
        	Integer[] tmp = (Integer[])bucket[i].arraylist.toArray(new Integer[len]);
        	int array[] = new int[len];
        	for(int j=0;j<len;j++){
        			array[j] = Integer.valueOf(tmp[j]);
        	}
        	new BubbleSort().Sorting(array);
        	for(int j=0;j<len;j++){
        		data[index++] = array[j];
        	}
        }
	}
	
	 private static int FindMax(int array[]){
		 int max=array[0];
		 int i=0;
		 while(i<array.length -1){
			 if(array[i]>max){
				 max = array[i];
			 }
			 i++;
		 }
		 return max;
	 } 
    
    public static void main(String[] args){
        int [] data= {4,1,1,1,1,1,5,3,2,10,21,35};
        int max = FindMax(data);
        ArrayB [] bucket = new ArrayB[10];
        int i;
        for( i=0;i<10;i++){
        	bucket[i] = new ArrayB(new ArrayList<Integer>());
        }
        for(i=0;i<data.length;i++){//将元素装入桶 内
        	int index =data[i]/bucket.length;
        	bucket[index].arraylist.add(data[i]);
//        	System.out.println(index+" "+Arrays.toString(bucket[index].arraylist.toArray())); 
        }
        Sorting(data,bucket);
        System.out.println(Arrays.toString(data));
    }

}
