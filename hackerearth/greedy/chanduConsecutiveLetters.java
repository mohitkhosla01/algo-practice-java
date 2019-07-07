package greedy;

import java.util.Scanner;

public class chanduConsecutiveLetters {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int w=0;w<t;++w){
			
			String s=sc.next();
			System.out.print(s.charAt(0));
			
			for(int i=1;i<s.length();++i){
				if(s.charAt(i)!=s.charAt(i-1)){
					System.out.print(s.charAt(i));
				}
			}
			
			System.out.println();
		}
		
		sc.close();
	}
}
