package kr.ac.kopo.date0318;

public class StringUtil {
	final int UPPERLOWERGAP = 'a' - 'A';

	public boolean isUppperChar(char c) {
		return 'A' <= c && c <= 'Z';
	}

	public boolean isLowerChar(char c) {
		return 'a' <= c && c <= 'z';
	}

	public int max(int i, int j) {
		return i > j ? i : j;
	}

	public int min(int i, int j) {
		return i < j ? i : j;
	}

	public String reverseString(String str) {
		String reverseStr = new String("");
		for (int i = 0; i < str.length(); i++) {
			reverseStr = str.charAt(i) + reverseStr;
		}
		return reverseStr;
	}

	public String toUpperString(String str) {
		String upperStr = new String("");
		for (int i = 0; i < str.length(); i++) {
			char tmp = str.charAt(i);
			if (this.isLowerChar(tmp))
				upperStr += (char) (tmp - UPPERLOWERGAP);
			else
				upperStr += tmp;
		}
		return upperStr;
	}

	public String toLowerString(String str) {
		String lowerStr = new String("");
		for (int i = 0; i < str.length(); i++) {
			char tmp = str.charAt(i);
			if (this.isUppperChar(tmp))
				lowerStr += (char) (tmp + UPPERLOWERGAP);
			else
				lowerStr += tmp;
		}
		return lowerStr;
	}
}
