package general;

import java.util.Scanner;

public class CommonChild {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s1 = "WEWOUCUIDGCGTRMEZEPXZFEJWISRSBBSYXAYDFEJJDLEBVHHKS";
		String s2 = "FDAGCXGKCTKWNECHMRXZWMLRYUCOCZHJRRJBOAJOQJZZVUYXIC";
		
		// System.out.println(commonChild(s1, s2));
		commonChild(s1, s2);
		
		sc.close();
	}
	
    public static void commonChild(String s1, String s2) {
    	
		int [][]arr = new int[s1.length()][s2.length()];
		
		for(int i=0; i<s1.length(); ++i) {
			for(int j=0; j<s2.length(); ++j) {
				if(s1.charAt(i) == s2.charAt(j)) {
					if(i==0 || j==0) {
						arr[i][j] = 1;
					}
					else if(arr[i-1][j] == arr[i][j-1]) {
						arr[i][j] = arr[i-1][j-1] + 1;
					}
					else {
						arr[i][j] = arr[i-1][j-1];
					}
				}
				else {
					if(i==0 && j==0) {
						arr[i][j] = 0;
					}
					else if(i==0) {
						arr[i][j] = arr[i][j-1];
					}
					else if(j==0) {
						arr[i][j] = arr[i-1][j];
					}
					else {
						arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);
					}
				}
			}
		}
		
		System.out.print("\t");
		for(int z=0; z<s2.length(); ++z) {
			System.out.print(s2.charAt(z)+"\t");
		}
		System.out.println();
		
		for(int i=0; i<s1.length(); ++i) {
			System.out.print(s1.charAt(i)+"\t");
			for(int j=0; j<s2.length(); ++j) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
    }
}
