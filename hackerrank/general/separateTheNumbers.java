package general;

import java.util.Scanner;

public class separateTheNumbers {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();

		for(int i=0;i<q;++i){
			String s=sc.next();

			if(s.length()==1){
				System.out.println("NO");
			}
			else{

				boolean flag=false;
				
				long x=-1;
				int b=0, e=1;

				while(true){
					
					long m=Long.parseLong(s.substring(b,e));
					
					if(e==s.length()){
						break;
					}
					if(e+(""+(m+1)).length()>s.length()){
						flag=false;
						break;
					}
					
					long m2=Long.parseLong(s.substring(e,e+(""+(m+1)).length()));

					
					if((m+1)==m2){
						flag=true;
						if(x==-1){
							x=m;
						}
						b+=(""+m).length();
						e+=(""+m2).length();
					}
					else{
						flag=false;
						if(x==-1){
							++e;
						}
						if(x!=-1){
							x=-1;
							e=e-b+1;
							b=0;
						}
					}
				}

				if(flag==true){
					System.out.println("YES "+x);
				}
				else{
					System.out.println("NO");
				}
			}
		}

		sc.close();
	}
}
