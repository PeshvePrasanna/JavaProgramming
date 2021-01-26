package stringPrograms;

public class ReverseString {
	public static void Reverser(String str) {
		// approach 1 using toCharArray()
		System.out.println("Output is: ");
		int len = str.length();
		char[] ch = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
		System.out.println();
		System.out.println("********************");
		// approach 2 using charAt()
		for (int k = len - 1; k >= 0; k--) {
			System.out.print(str.charAt(k));

		}
		System.out.println();
		System.out.println("********************");
		// approach 3 using reverse method of string buffer class
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		System.out.println("********************");
		// approach 3 using reverse method of string buffer class
		StringBuilder sb1 = new StringBuilder(str);
		System.out.println(sb1.reverse());
	}

	public static void main(String[] args) {
		ReverseString.Reverser("Band Master");
	}

}
