package general;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class climbingTheLeaderboard {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		ArrayList<Integer> scores=new ArrayList<Integer>();
		HashSet<Integer> hs=new HashSet<Integer>();
		
		for(int i=0;i<n;++i){
			int x=sc.nextInt();
			
			if(!hs.contains(x)){
				scores.add(x);
				hs.add(x);
			}
		}
		
		n=scores.size();
		
		int m=sc.nextInt();
		int []alice=new int[m];
		
		for(int i=0;i<m;++i){
			alice[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<m;++i){
			
			int b=0, e=n-1;
			
			while(true){
				int mid=(b+e)/2;
				if(alice[i]==scores.get(mid)){
					System.out.println(mid+1);
					break;
				}
				else if(mid==0){
					if(alice[i]>scores.get(mid)){
						System.out.println(1);
						break;
					}
					else{
						System.out.println(2);
						break;
					}
				}
				else if(mid==n-1){
					if(alice[i]<scores.get(mid)){
						System.out.println(n+1);
						break;
					}
					else{
						System.out.println(n);
						break;
					}
				}
				else if((alice[i]>scores.get(mid+1) && alice[i]<scores.get(mid-1))){
					if(alice[i]>scores.get(mid)){
						System.out.println(mid+1);
						break;
					}
					else if(alice[i]<scores.get(mid)){
						System.out.println(mid+2);
						break;
					}
				}
				else if(alice[i]>scores.get(mid)){
					e=mid-1;
				}
				else if(alice[i]<scores.get(mid)){
					b=mid+1;
				}
			}
		}
		
		sc.close();
	}
}
