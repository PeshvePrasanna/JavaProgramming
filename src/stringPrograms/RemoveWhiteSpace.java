package stringPrograms;

public class RemoveWhiteSpace {
	public static String trimmer(String str) {
		String str1 = str.replaceAll("\\s", "");
		return str1;
	}

	public static void main(String[] args) {
		String ip = " 12 4";
		@SuppressWarnings("unused")
		String result;
		System.out.println(result = trimmer(ip));

	}

}
