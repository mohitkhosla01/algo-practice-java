package general;

import java.util.Scanner;

public class encryption {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		s=s.replaceAll("\\s","");
		int l=s.length();
		
		int f=(int)Math.floor(Math.sqrt(l));
		int c=(int)Math.ceil(Math.sqrt(l));
		
		while(true){
			if((((f-1)*(c+1))<(f*c)) && (((f-1)*(c+1))>l)) {
				--f;
				++c;
			}
			else{
				break;
			}
		}
		
		if(l>(f*c)) {
			++f;
		}
		
		for(int i=0;i<c;++i) {
			
			int t=0;
			for(int j=0;j<f;++j) {
				if((i+t)<s.length()){
					System.out.print(s.charAt(i+t));
					t+=c;
				}
				else{
					break;
				}
			}
			System.out.print(" ");
		}
		
		sc.close();
	}
}