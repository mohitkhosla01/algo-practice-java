package competitions;

public class Zoos {

	public static void main(String[] args) {
		
		String[] sArr = {
				"zzzoooooo",
				"zzoooo",
				"zzooo",
				"zzzooooo"
			};
		
		for(int w=0; w<sArr.length; ++w) {
			String s = sArr[w];
			int zCount = 0, oCount = 0;
			
			for(int i=0; i<s.length(); ++i) {
				if(s.charAt(i) == 'z' || s.charAt(i) == 'Z') {
					++zCount;
				}
				else if(s.charAt(i) == 'o' || s.charAt(i) == 'O') {
					++oCount;
				}
			}
			
			if((zCount * 2) == oCount) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}
}