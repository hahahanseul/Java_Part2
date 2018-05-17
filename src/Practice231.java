
class Practice231 {
	public static void main(String[] args) {
		// Bookクラス型の変数ｂにBookオブジェクトの1個のアドレスを代入。
		// Bookクラスのコンストラクタを起動。かつ引数に("みんなのJava", "デューク", 3000)
		Book b = new Book("みんなのJava", "デューク", 3000);
		// 変数bに格納されたアドレスの先にある、オブジェクトのdisplayメソッドを呼び出す。
		b.display();
	}
}
