package comment;

/**
 * this変数の意味を確認するためのサンプル
 * @author s.takasaki
 */
class UseThisSample {
	public static void main(String[] args) {
		MyClass mc = new MyClass();
		mc.method("hoge");
	}
}

class MyClass {
	// インスタンス変数（クラス宣言のすぐ下にある変数）
	String s = "piyo";

	void method(String s) {
		// mainメソッドで、methodを呼び出した際に、引数として渡された値
		System.out.println(s);
		// 自オブジェクトのs（インスタンス変数）
		System.out.println(this.s);
	}
}