import java.util.Arrays;


public class TestMerge {

	public static void main(String[] args) {
		int a[] = {1,3,5,7,9,11};
		int b[] = {2,4,6};
		System.out.println(Arrays.toString(Merge(a,b)));
	}
	static private int[] Merge(int a[],int b[]){
		int alen = a.length;
		int blen = b.length;
		int clen = alen+blen;
		int []c = new int[clen];
		int index=0,i=0,j=0;
		while(i<alen&&j<blen){
			if(a[i]<b[j]){
				c[index++]=a[i++];
			}else{
				c[index++]=b[j++];
			}
		}
		while(i<alen){
			c[index++]=a[i++];
		}
		while(j<blen){
			c[index++]=b[j++];
		}
		
		return c;
	}
}
