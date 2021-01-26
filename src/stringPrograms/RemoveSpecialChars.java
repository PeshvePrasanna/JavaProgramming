package stringPrograms;

public class RemoveSpecialChars {
	public static String removeSpecial(String str) {
		String plainString = str.replaceAll("[^a-zA-Z0-9]", "");
		return plainString;

	}

	public static void main(String[] args) {
		String str = "@J!!!a*v%%a^S*t*a@@r$#";
		String res;
		res = removeSpecial(str);
		System.out.println("Plain Text is: " + res);
	}

}
