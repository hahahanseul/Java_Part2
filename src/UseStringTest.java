
class UseStringTest {

	public static void main(String[] args) {

		// new演算子を使用した場合は、必ず新しいオブジェクトを生成する。
		// 明示的にnewする。
		String str1 = new String("Hello");
		String str2 = new String("Hello");

		// すでに同じ文字列をもつオブジェクトがすでにある場合、
		// そのオブジェクトを参照する。
		String str3 = "Hello";
		String str4 = "Hello";
		String str5 = "Hello";

		// false
		System.out.println("str1 == str2: " + (str1 == str2));
		// false
		System.out.println("str2 == str3: " + (str2 == str3));
		// true
		System.out.println("str3 == str4: " + (str3 == str4));
		// true
		System.out.println("str4 == str5: " + (str4 == str5));
	}
}
