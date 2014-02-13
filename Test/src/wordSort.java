
public class wordSort {
	
	public static boolean compareWords(String a,String b){
		int len = a.length()<b.length()?a.length():b.length();
		boolean index = false;
		int i = 0;
		while(i<len){
			char aChar = a.charAt(i);
			char bChar = b.charAt(i);
			System.out.println(i);
			if(aChar<bChar){
				index = true;
				break;
			}else if(aChar>bChar){
				index = false;
				break;
			}
			i++;
		}
		return index;
	} 
	
	public static void main(String args[]){
		String a="after";
		String b="afternoon";
		System.out.println(compareWords(b,a));
	}
}
