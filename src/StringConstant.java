
public class StringConstant {
	public static void main(String[] args) {

		// new演算子を使用した場合は、必ず新しいオブジェクトを生成する。
		// 明示的にnewする
		String a1 = new String("Hello");
		String a2 = new String("Hello");

		// すでに同じ文字列をもつオブジェクトがすでにある場合、
		// そのオブジェクトを参照する。
		String a3 = "Hello";
		String a4 = "Hello";

		//false
		System.out.println("a1==a2の結果："+(a1==a2));
		//false
		System.out.println("a2==a3の結果："+(a2==a3));
		// true
		System.out.println("a3==a4の結果："+(a3==a4));

	}
}
