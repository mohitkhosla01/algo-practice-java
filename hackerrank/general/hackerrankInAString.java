package general;

import java.util.Scanner;

public class hackerrankInAString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		
		String h="hackerrank";
		
		for(int i=0;i<q;++i){
			String s=sc.next();
			int hc=0;
			int c=0;
			boolean flag=false;
			
			while(c!=s.length()){
				if(h.charAt(hc)==s.charAt(c)){
					++hc;
					++c;
				}
				else{
					++c;
				}
				
				if(hc==h.length()){
					flag=true;
					break;
				}
			}
			
			if(flag==true){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}

		sc.close();
	}
}
