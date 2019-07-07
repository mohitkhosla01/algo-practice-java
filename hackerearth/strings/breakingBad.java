package strings;

import java.util.Scanner;

public class breakingBad {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		for(int v=0;v<n;++v){
			
			String name="";
			int comma=0;
			
			for(int w=0;w<m;++w){
				
				String n1=sc.next();
				String bb=sc.next();
				int a=0;
				
				for(int x=0;x<bb.length();++x){
					if(bb.charAt(x)==','){
						++a;
					}
				}
				
				if(a>=comma){
					name=n1;
					comma=a;
				}
			}
			
			System.out.println(name+" "+comma);
		}
		
		sc.close();
	}
}
