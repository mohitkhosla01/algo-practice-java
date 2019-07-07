package strings;

public class LengthOfLastWord {

	public static void main(String[] args) {
		System.out.println(new LengthOfLastWord().lengthOfLastWord("Hello World  "));
	}
	
    public int lengthOfLastWord(final String A) {
        String B = A;
        B = B.trim();
        for(int i=B.length()-1; i>=0; --i) {
            if(B.charAt(i) == 32) {
                return B.substring(i+1).length();
            }
        }
        return B.length();
    }
}
