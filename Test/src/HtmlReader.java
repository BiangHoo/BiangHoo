import java.io.*;
public class HtmlReader {
	public static void main(String args[])throws Exception{
		String str="";
		try {
			FileInputStream fr = new FileInputStream("D:/test.html");
			BufferedInputStream bis = new BufferedInputStream(fr);
			char ch;
			while( (ch=(char) bis.read()) != -1){
				System.out.println(ch);
				str +=ch;
			}
			System.out.println(str);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
