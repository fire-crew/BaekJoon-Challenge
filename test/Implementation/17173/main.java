// Authored by : choipureum
// Co-authored by : -
// Link : http://boj.kr/aa6aba0e97a14ba3ac2cbac44a93498a
import java.util.*;
import javax.swing.text.AbstractDocument.BranchElement;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());		
		String [] arr=br.readLine().split(" ");

		int sum=0;
		for(int i=Integer.parseInt(arr[0]);i<=N;i++) {
			in:for(int j=0;j<M;j++) {
				if(i%Integer.parseInt(arr[j])==0) {
					sum+=i;
					break in;
				}
			}
		}
		System.out.println(sum);
		
		}

}
