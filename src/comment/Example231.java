package comment;
class Example231 {
	public static void main(String[] args) {

					// Accountクラスのインスタンス化（コンストラクタの呼び出し）
					// 呼び出しの際に引数として、(1234567, "神田　二郎")を渡している。
					// 引数を渡さない限り、インスタンス化を許さない。
					// 引数ありのコンストラクタの呼び出し
		Account ac = new Account(1234567, "神田　二郎");

		// Accountクラスのインスタンスを生成
		// 引数ありのコンストラクタがある場合、インスタンス化は出来ない。
//		Account ac = new Account();
		// 別に初期化メソッドを用意して、値を代入
//		ac.init(1234567, "神田　二郎");
		ac.display();

		// オーバーロードしたコンストラクタを使った場合
		// 引数なしのコンストラクタの呼び出し
		Account ac2 = new Account();
		ac2.display();
	}
}
