package general;

import java.util.HashSet;
import java.util.Scanner;

public class weightedUniformString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		int n=sc.nextInt();
		int []arr=new int[n];
		
		for(int i=0;i<n;++i){
			arr[i]=sc.nextInt();
		}
		
		HashSet<Integer> hs=new HashSet<Integer>();
		
		int c1=0, c2=0;
		
		while(true){
			
			for(int i=c2;i<s.length();++i){
				String st=s.substring(c1, c2+1);
				int ch=st.charAt(0)-96;
				ch*=st.length();
				
				hs.add(ch);
				
				if(i==s.length()-1 || s.charAt(i)!=s.charAt(i+1)){
					break;
				}
				else{
					++c2;
				}
			}

			c1=c2+1;
			c2=c1;
			
			if(c1==s.length()){
				break;
			}
		}
		
		for(int i=0;i<n;++i){
			if(hs.contains(arr[i])){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}
		
		sc.close();
	}
}
