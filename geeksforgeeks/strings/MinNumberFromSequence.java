package strings;

import java.util.ArrayList;
import java.util.List;

public class MinNumberFromSequence {

	public static void main(String[] args) {

		List<String> arr = new ArrayList<String>();
		arr.add("D");
		arr.add("I");
		arr.add("DD");
		arr.add("II");
		arr.add("DIDI");
		arr.add("IIDDD");
		arr.add("DDIDDIID");

		for(String s : arr) {

			int lastI = -1;
			int highestNum = 0;
			boolean toUpdate = false;
			int posForUpdate = -1;

			int[] ch = new int[s.length()+1];
			if(s.charAt(0) == 'I') {
				ch[0] = 1;
				highestNum = 1;
				lastI = 0;
			}
			else {
				ch[0] = 2;
				highestNum = 2;
			}

			int i=0;
			while(true) {

				if(i != 0 && toUpdate == false && posForUpdate < i && s.charAt(i) == 'D') {
					toUpdate = true;
					posForUpdate = i;
					i = lastI;
				}
				else if (toUpdate) {
					ch[i+1] = ++highestNum;
					toUpdate = false;
					++i;
				}
				else {
					if(s.charAt(i) == 'I') {
						ch[i+1] = ++highestNum;
						lastI = i;
					}
					else {
						ch[i+1] = i != 0 && s.charAt(i-1) == 'D' ? ch[i] - 1 : highestNum - 1;
					}

					++i;
				}

				if(i == s.length()) {
					break;
				}
			}
			
			System.out.print(s + "\t");
			for(int v=0; v<ch.length; ++v) {
				System.out.print(ch[v]);
			}
			System.out.println();
		}
	}
}
