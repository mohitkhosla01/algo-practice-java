package general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class sherlockAndAnagrams {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();

		for(int w=0;w<t;++w){
			String s=sc.next();

			ArrayList<String> arr=new ArrayList<String>();

			for(int i=0;i<s.length();++i){
				for(int j=0;j<s.length();++j){
					
					if((i+j)<s.length()){
						String st=s.substring(j,i+j+1);
						char ch[]=st.toCharArray();
						Arrays.sort(ch);
						
						StringBuilder sb=new StringBuilder();
						for(int k=0;k<ch.length;++k){
							sb.append(ch[k]);
						}
						arr.add(sb.toString());
					}	
				}
			}
			
			int c=0;
			
			while(!arr.isEmpty()){
				String st=arr.get(0);
				int f=Collections.frequency(arr, st);
				if(f>1){
					int vt=factX(f);
					c+=vt;
					int ct=0;
					while(ct!=arr.size()){
						if(arr.get(ct).equals(st)){
							arr.remove(ct);
						}
						else{
							++ct;
						}
					}
				}
				else{
					arr.remove(0);
				}
			}
			
			System.out.println(c);
		}
		
		sc.close();
	}
	
	public static int factX(int a){
		if(a==2){
			return 1;
		}
		else if(a==3){
			return 3;
		}
		else{
			return((a*(a-1))/2);
		}
	}
}
