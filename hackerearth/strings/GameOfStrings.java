package strings;

import java.util.ArrayList;
import java.util.Scanner;

public class GameOfStrings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		
		ArrayList<String> s = new ArrayList<String>();
		ArrayList<Integer> k = new ArrayList<Integer>();
		
		for(int i=0; i<t; ++i) {
			String st = sc.nextLine();
			s.add(st.substring(0, st.indexOf(32)));
			k.add((Integer.parseInt(st.substring(st.indexOf(32)+1)))-1); // -1 -> To change 1-based indexing to 0-based
		}

		for(int i=0; i<s.size(); ++i) {
			String cs = s.get(i);
			
			String possibleS = "";
			if(((cs.substring(0, (k.get(i)+1)).length() > cs.substring(k.get(i)+1).length()*2))) {
				possibleS = cs.substring(k.get(i)+1);
			}
			else {
				possibleS = cs.substring(cs.length() - cs.substring(0, (k.get(i)+1)).length()/2);
			}
			
			
			boolean flag1 = false;
			int possibleSl = possibleS.length();
			
			i1 : for(int j=0; j<possibleSl; ++j) {
				if(cs.startsWith(possibleS)) {
					flag1 = true;
					break i1;
				}
				else {
					possibleS = possibleS.substring(1);
				}
			}
			
			if(flag1 == true) {
				char[] ch = possibleS.toCharArray();
				
				boolean flag2 = false;
				int chx = ch.length-1;
				i2 : for(int j=k.get(i); j>=possibleS.length(); --j) {
					if(cs.charAt(j) == ch[chx]) {
						if(chx == 0) {
							flag2 = true;
							break i2;
						}
						else {
							chx-=1;
						}
					}
				}
				
				if(flag2 == true) {
					for(int w=0; w<ch.length; ++w) {
						System.out.print(ch[w]);
					}
					System.out.println();
				}
				else {
					System.out.println("Puchi is a cheat!");
				}
			}
		}
		
		sc.close();
	}
}
