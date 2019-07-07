package algorithms.strings;

import java.util.Scanner;

public class jumbleLetter {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int w=0;w<t;++w){
			
			String s=sc.next();
			
			for(int i=0;i<s.length();++i){
				
				String e=(""+s.charAt(i)).toLowerCase();
				
				if(!e.equals("a") && !e.equals("e") && !e.equals("i") && !e.equals("o") && !e.equals("u") && !e.equals("y")){
					System.out.print(("."+s.charAt(i)).toLowerCase());
				}
			}
			
			System.out.println();
		}
		
		sc.close();
	}
}
