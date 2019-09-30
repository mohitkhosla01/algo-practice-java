package easy;

public class RemoveAllAdjacentDuplicatesInString {

	public static void main(String[] args) {
		
		RemoveAllAdjacentDuplicatesInString obj = new RemoveAllAdjacentDuplicatesInString();
		
		String[] sArr = {
			"abbaca",
			"cdeffea",
			"",
			null,
			"aabbcdfg",
			"mnmnmmnm"
		};
		
		for(String s : sArr) {
			System.out.println(obj.removeDuplicates(s));
		}
	}

	public String removeDuplicates(String s) {
		
		if(s == null || s.length() == 0) {
			return "";
		}
		else if(s.length() == 1) {
			return s;
		}
		
		int L = s.length();
		char[] ch = new char[L];
		for(int i=0; i<L; ++i) {
			ch[i] = s.charAt(i);
		}
		
		while(true) {
			int prevIndex = 0;
			boolean duplicateFound = false;
			
			for(int i=1; i<L; ++i) {
				if(ch[i] != '-') {
					if(prevIndex >= 0 && ch[i] == ch[prevIndex]) {
						duplicateFound = true;
						ch[i] = '-';
						ch[prevIndex] = '-';
						prevIndex -= 1;
					}
					else {
						prevIndex = i;
					}
				}
			}
			
			if(!duplicateFound) {
				break;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<ch.length; ++i) {
			if(ch[i] != '-') {
				sb.append(ch[i]);
			}
		}
		
		return sb.toString();
	}
}
