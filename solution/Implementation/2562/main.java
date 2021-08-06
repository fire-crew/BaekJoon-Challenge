// Authored by : choipureum
// Co-authored by : -
// Link : http://boj.kr/9819b45ab37e44f1bad4391b23031325
import java.util.*;

public class Main 
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);	
		int [] input =new int[9];
		int max=0;
		int cnt=0;
		for(int i=0;i<9;i++) {
			input[i]=sc.nextInt();
		}
		for(int i=0; i<9;i++) {
			if(input[i]>max) {
				max=input[i];
				cnt=i+1;
			}
		}
		System.out.println(max);
		System.out.println(cnt);
		
  }
}
