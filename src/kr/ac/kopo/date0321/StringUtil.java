package kr.ac.kopo.date0321;

public class StringUtil {
	final static int UPPERLOWERGAP = 'a' - 'A';

	public static boolean isUppperChar(char c) {
		return 'A' <= c && c <= 'Z';
	}

	public static boolean isLowerChar(char c) {
		return 'a' <= c && c <= 'z';
	}

	public static int max(int i, int j) {
		return i > j ? i : j;
	}

	public static int min(int i, int j) {
		return i < j ? i : j;
	}

	public static String reverseString(String str) {
		String reverseStr = new String("");
		for (int i = 0; i < str.length(); i++) {
			reverseStr = str.charAt(i) + reverseStr;
		}
		return reverseStr;
	}

	public static String toUpperString(String str) {
		String upperStr = new String("");
		for (int i = 0; i < str.length(); i++) {
			char tmp = str.charAt(i);
			if (StringUtil.isLowerChar(tmp))
				upperStr += (char) (tmp - UPPERLOWERGAP);
			else
				upperStr += tmp;
		}
		return upperStr;
	}

	public static String toLowerString(String str) {
		String lowerStr = new String("");
		for (int i = 0; i < str.length(); i++) {
			char tmp = str.charAt(i);
			if (StringUtil.isUppperChar(tmp))
				lowerStr += (char) (tmp + UPPERLOWERGAP);
			else
				lowerStr += tmp;
		}
		return lowerStr;
	}
	
	public static int checkChar(String strData, char ch) {
		int cnt = 0;
		for (int i = 0; i < strData.length(); i++) {
			if(strData.charAt(i) == ch)
				cnt++;
		}
		return cnt;
	}
	
	public static String removeChar(String oriStr, char delChar) {
		String newStr = "";
		for (int i = 0; i < oriStr.length(); i++) {
			char ch = oriStr.charAt(i);
			if(ch != delChar)
				newStr += ch;
		}
		return newStr;
	}
}
