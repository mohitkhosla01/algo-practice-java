package general;

import java.util.Scanner;

public class gridSearch {

	public static void main(String []args){

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();

		for(int w=0;w<t;++w){

			int R=sc.nextInt();
			int C=sc.nextInt();
			char [][]G=new char[R][C];

			for(int i=0;i<R;++i){
				String s=sc.next();
				for(int j=0;j<C;++j){
					G[i][j]=s.charAt(j);
				}
			}


			int r=sc.nextInt();
			int c=sc.nextInt();
			char [][]P=new char[r][c];

			for(int i=0;i<r;++i){
				String s=sc.next();
				for(int j=0;j<c;++j){
					P[i][j]=s.charAt(j);
				}
			}

			boolean flag=false;

			OA: for(int i=0;i<R;++i){
				for(int j=0;j<C;++j){
					if(G[i][j]==P[0][0] && (i+r)<=R && (j+c)<=C){
						
						flag=true;
						OB: for(int ii=i, a=0 ; ii<i+r; ++ii, ++a){
							for(int jj=j, b=0 ; jj<j+c; ++jj, ++b){
								if(G[ii][jj]!=P[a][b]){
									flag=false;
									break OB;
								}
							}
						}
						
						if(flag==true){
							break OA;
						}
					}
				}
			}
			
			if(flag==true){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
			
			sc.close();
		}
	}
}
