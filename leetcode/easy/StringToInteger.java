package easy;

public class StringToInteger {

	public static void main(String[] args) {

		String[] strArray = {
				"42",
				"   -42",
				"4193 with words",
				"words and 987",
				"-91283472332",
				"mohit2147483645 MOHIT",
				"20000000000000000000",
				"0-1",
				null,
				"",
				"000",
				"-556",
				"+1",
				"+889mohit",
				"  0000000000012345678",
				"8000mohit",
				"9000",
				"-000000000000001",
				"000000000000000000000000000011",
				"+-2",
				"    +0a32",
				"   0a890",
				"   1a890",
				"0",
				"1",
				"+",
				"-",
				"++",
				"--",
				" ",
				"  ",
				"-2147483647",
				"-2147483649",
				"-2147483648"
		};

		for(String str : strArray) {
			System.out.println(str + ": " + new StringToInteger().myAtoi(str));
		}
	}

	public int myAtoi(String str) {

		if(str == null) {
			return 0;
		}

		str = str.trim();

		if(str.equals("")) {
			return 0;
		}

		if(str.length() >= 2 && ((str.charAt(0) == '+' && str.charAt(1) == '-') || (str.charAt(0) == '-' && str.charAt(1) == '+'))) {
			return 0;
		}

		boolean negativeSign = false;
		if(str.charAt(0) == '-') {
			if(str.length() > 1) {
				negativeSign = true;
				str = str.substring(1);
			}
			else {
				return 0;
			}
		}
		else if(str.charAt(0) == '+') {
			if(str.length() > 1) {
				str = str.substring(1);
			}
			else {
				return 0;
			}
		}

		if(!((str.charAt(0) >= 48 && str.charAt(0) <= 57) || str.charAt(0) == ' ' || str.charAt(0) == '-' || str.charAt(0) == '+')) {
			return 0;
		}


		int b=-1, e=-1;

		int i=0;
		while(i != str.length()) {
			char ch = str.charAt(i);

			if(b == -1) {
				if(ch >= 49 && ch <= 57) {
					b = i;
				}
				else if(ch != 48){
					return 0;
				}
			}
			else if(b != -1 && e == -1 && !(ch >= 48 && ch <= 57)) {
				e = i;
				break;
			}
			++i;
		}

		if(b == -1 && e == -1) {
			return 0;
		}
		else if(b != -1 && e == -1) {
			e = str.length();
		}

		String numString = str.substring(b,e);

		if(negativeSign) {
			numString = "-" + numString;
		}

		if(numString.length() > 11 && numString.charAt(0) == '-') {
			return Integer.MIN_VALUE;
		}
		else if(numString.length() > 10 && numString.charAt(0) >= 48 && numString.charAt(0) <= 57) {
			return Integer.MAX_VALUE;
		}
		else if(numString.length() == 10 || (numString.length() == 11 && numString.charAt(0) == '-')) {
			long num = Long.parseLong(numString);
			if(num >= -2147483648 && num <= 2147483647) {
				return (int)num;
			}
			else {
				if(num < -2147483648) {
					return Integer.MIN_VALUE;
				}
				else {
					return Integer.MAX_VALUE;
				}
			}
		}
		else {
			return Integer.parseInt(numString);
		}
	}
}
