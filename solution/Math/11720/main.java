/*
 Authored by : choipureum
 Co-authored by : -
 Link : http://boj.kr/0fe77edb1a554991b13c13140a2c8317
*/

import java.util.*;

class Main {
	  public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int length=sc.nextInt();
		 String temp=sc.next();
		 int sum=0;
		 
		 for(int i=0;i<length;i++) {
			 sum+=Integer.parseInt(temp.substring(i,i+1));
		 }
		 System.out.println(sum);
		 } 	  
}
	
