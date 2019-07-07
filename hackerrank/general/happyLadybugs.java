package general;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class happyLadybugs {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int g=sc.nextInt();
		
		for(int w=0;w<g;++w){
			int n=sc.nextInt();
			String s=sc.next();
			
			if(s.length()==1){
				if(s.charAt(0)=='_'){
					System.out.println("YES");
				}
				else{
					System.out.println("NO");
				}
			}
			
			else{
				boolean uflag=false;
				
				ArrayList<Character> arr=new ArrayList<Character>();
				for(int i=0;i<n;++i){
					arr.add(s.charAt(i));
					if(s.charAt(i)=='_'){
						uflag=true;
					}
				}
				
				if(uflag==false){
					boolean iflag=true;
					
					for(int i=0;i<n;++i){
						if(i==0){
							if(s.charAt(0)!=s.charAt(1)){
								System.out.println("NO");
								iflag=false;
								break;
							}
						}
						else if(i==s.length()-1){
							if(s.charAt(s.length()-1)!=s.charAt(s.length()-2)){
								System.out.println("NO");
								iflag=false;
								break;
							}
						}
						else if(s.charAt(i)!=s.charAt(i-1) && s.charAt(i)!=s.charAt(i+1)){
							System.out.println("NO");
							iflag=false;
							break;
						}
					}
					
					if(iflag==true){
						System.out.println("YES");
					}
				}
				
				else{
					boolean iflag=true;
					
					for(int i=0;i<n;++i){
						if(arr.get(i)!='_'){
							int a=Collections.frequency(arr, arr.get(i));
							if(a<2){
								System.out.println("NO");
								iflag=false;
								break;
							}
						}
					}
					
					if(iflag==true){
						System.out.println("YES");
					}
				}
			}
		}
		
		sc.close();
	}
}
