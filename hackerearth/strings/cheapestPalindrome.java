package algorithms.strings;

import java.util.Scanner;

public class cheapestPalindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int w=0;w<t;++w){
			
			String s=sc.next();
			int aCost=sc.nextInt();
			int bCost=sc.nextInt();
			
			int sum=0;
			
			if(!s.contains("/")){
				System.out.println(-1);
			}
			else{
				boolean flag=true;
				
				for(int i=0;i<s.length();++i){
					if(s.charAt(i)!='/' && s.charAt(s.length()-i-1)!='/' && s.charAt(i)!=s.charAt(s.length()-i-1)){
						System.out.println(-1);
						flag=false;
						break;
					}
					
					else if(s.charAt(i)=='/'){
						if(s.charAt(s.length()-i-1)=='a'){
							sum+=aCost;
						}
						else if(s.charAt(s.length()-i-1)=='b'){
							sum+=bCost;
						}
						else{
							sum+=Math.min(aCost, bCost);
						}
					}
				}
				
				if(flag==true){
					System.out.println(sum);
				}
			}
		}
		
		sc.close();
	}
}
