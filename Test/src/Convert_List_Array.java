import java.util.*;
public class Convert_List_Array {
	public static void main(String[] args) { 
		List<String> list=new ArrayList<String>(); 
		list.add("������"); 
		list.add("����"); 
		list.add("����"); 
		int size=list.size(); 
		String[] array = (String[])list.toArray(new String[size]); 
		for(int i=0;i<array.length;i++){ 
		System.out.println(array[i]); 
		} 
		} 
		ArrayList<String> arrlist = new ArrayList<String>();
		
		
}
