/*
 Authored by : choipureum
 Co-authored by : -
 Link : http://boj.kr/c96711cd08a042a19358006e3d63c3c2
*/
import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;


class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);     
       Date today =new Date();
       SimpleDateFormat format1 = new SimpleDateFormat("YYYY\nMM\ndd");
       String today_format=format1.format(today);  
       System.out.println(today_format);  
    }
}
