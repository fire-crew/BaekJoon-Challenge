// Authored by : choipureum
// Co-authored by : -
// Link : http://boj.kr/c433612bd269423f9ab262ddc7ebb3ad
import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;


class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);            
       String n=sc.next();
       
    	   String input =sc.next();
    	   int length=input.length();
    	   input=input.replaceAll("2","");
    	   
    	   
    	   if(input.length()*2==length) {
    		   System.out.println("yee");
    	   }
    	   else {
    		   System.out.println(input.length()*2>length?"e":"2");
    	   }
}
}
