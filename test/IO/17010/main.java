/*
 Authored by : choipureum
 Co-authored by : -
 Link : http://boj.kr/cf472ff374eb4759b69cfea299853b8c
*/
import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;


class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);            
       int n=sc.nextInt();
       
       for(int i=0;i<n;i++) {
    	   int a=sc.nextInt();
    	   String b=sc.next();
    	   for(int j=0;j<a;j++) {
    		   System.out.print(b);
    	   }
    	   System.out.println();
       }
}
}
