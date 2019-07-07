package strings;

public class ImplementStrStr {

	public static void main(String[] args) {
		System.out.println(new ImplementStrStr().strStr("bbbbbbbbab", "baba"));
	}
	
    public int strStr(final String A, final String B) {
        if(A == null || B == null || A.equals("") || B.equals("")) {
            return -1;
        }
        else {
            for(int i=0; i<A.length(); ++i) {
                if((A.charAt(i) == B.charAt(0)) && (A.length() >= (i+B.length()))) {
                    if(A.substring(i, i+B.length()).equals(B)) {
                        return i;
                    }
                }
            }
            return -1;
        }
    }
}
