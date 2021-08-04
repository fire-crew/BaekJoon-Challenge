/*
 Authored by : choipureum
 Co-authored by : -
 Link : http://boj.kr/aabd03ba914649998f2008f32cd2b622
*/
import java.util.*;
import javax.swing.text.AbstractDocument.BranchElement;
import java.io.*;
 
public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String FBI="FBI";
		String [] input =new String[5];
		List<Integer> sort =new ArrayList<>();
		int cnt=0;
		int sw=0;
		for(int i=0;i<5;i++) {
			input[i]=br.readLine();
			cnt++;
			for(int j=0;j<input[i].length()-2;j++) {
				if(input[i].charAt(j)=='F' && input[i].charAt(j+1)=='B' &&input[i].charAt(j+2)=='I') {					
					sw=1;
					sort.add(cnt);
					break;
				}
			}		
}
		Collections.sort(sort);		
		if(sw==0) {
			System.out.print("HE GOT AWAY!");
		}
		else {
			for(int i=0;i<sort.size();i++) {
				System.out.print(sort.get(i)+" ");
			}
		}
}
}
