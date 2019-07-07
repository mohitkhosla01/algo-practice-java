package general;

import java.util.ArrayList;
import java.util.Scanner;
public class primitiveProblem {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		
		int val=p+1;
		int c=0;
		
		for(int i=1;i<p;++i) {
			System.out.println("\ni: "+i);
			
			ArrayList<Integer> arr=new ArrayList<Integer>();
			boolean flag=true;
			
			I: for(int j=0;j<p-1;++j) {
				
				int x=(int)Math.pow(i,j)%p;
				System.out.println("j: "+j+"\tx: "+x);
				
				if(arr.contains(x)) {
					flag=false;
					break I;
				}
				else{
					arr.add(x);
				}
			}
			
			/*if(flag==true){
				if(i<val){
					val=i;
				}
				++c;
			}*/
			
			if(flag==true){
				System.out.print(i+" ");
			}
		}
		
		/*if(val==(p+1)){
			val=0;
		}
		System.out.println(val+" "+c);*/
		
		sc.close();
	}
}
