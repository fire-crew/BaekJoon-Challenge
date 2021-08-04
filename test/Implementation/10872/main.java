  
/*
 Authored by : choipureum
 Co-authored by : -
 Link : http://boj.kr/61cc53db07104beab263be8f714b9be9
*/
import java.util.*;

public class Main {
	public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			int fac =sc.nextInt();
			int result=1;
			for(int i=fac;i>0;i--) {
				result*=i;
			}
			System.out.println(result);
			}
	}
