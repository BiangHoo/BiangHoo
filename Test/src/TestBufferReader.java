import java.io.*;
public class TestBufferReader {
  public static void main(String [] args) {
    String s = null;
    String html = null;
    try{  
    	FileReader fr = new FileReader("D:/test.html");
    	BufferedReader bfr = new BufferedReader(fr);
   	    while((s=bfr.readLine())!=null) {
   	    	html += s;
   	        System.out.println(s);	
   	    }
   	   System.out.println(html);
   	    bfr.close();
    } catch(IOException a) {
      System.out.println("ณ๖ดํมห");	
      }
  }
}