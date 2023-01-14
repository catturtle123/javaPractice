package isVowel;

public class MyChar {
	private char str;

	MyChar(char str) {
		this.str = str;
	}

	boolean isVowel() {
		if (this.str == 'A' || this.str == 'E' || this.str == 'I' || this.str == 'O' || this.str == 'U'
				|| this.str == 'a' || this.str == 'e' || this.str == 'i'
				|| this.str == 'o' || this.str == 'u') {
			return true;
		} else {
			return false;
		}
	}

	boolean isDigit() {
		if ('0' <= this.str && this.str <= '9') // between 0 to 9
		{
			return true;
		} else {
			return false;
		}
	}

	boolean isAlphabet() {
		if ('a'<=this.str && this.str <= 'z') {
			return true;
		}else if ('A'<=this.str && this.str <= 'Z') {
			return true;
		}else {
			return false;
		}
	}

	public boolean isConsonant() {
		if (!isVowel() && isAlphabet()) {
			return true;
		} else {
			return false;
		}
	}

	public static void printLowerCaseAlphabets() {
		// TODO Auto-generated method stub
		char ch;
		for (ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}
	}

	public static void printUpperCaseAlphabets() {
		// TODO Auto-generated method stub
		char ch;
		for (ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}
	}
}
