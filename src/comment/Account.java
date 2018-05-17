package comment;
class Account {
	int number;
	String name;

	/**
	 * コンストラクタ
	 * このクラスがインスタンス化されたときに、一回だけ呼ばれる処理
	 * mainメソッドから渡された引数を自クラスの変数へ代入
	 * @param nu 口座番号
	 * @param na 口座名義
	 */
	Account(int nu, String na) {
		number = nu;
		name = na;
	}

	/**
	 * コンストラクタ（オーバーロードしたコンストラクタ）
	 * 勝手に固定値を自クラスの変数へ代入
	 */
	Account() {
		number = 0;
		name = "未設定";
	}

	/**
	 * デフォルトコンストラクタ（引数なし）
	 * コンストラクタを他で定義していない場合、
	 * この何もしないコンストラクタが自動追加される。
	 */
//	Account(){}

	/**
	 * こういう初期化メソッドを使っても良いが、
	 * 使うタイミングが、使用者に依存する。
	 * 使われないかも。。。
	 */
	void init(int nu, String na) {
		number = nu;
		name = na;
	}

	void display() {
		System.out.println("口座番号：" + number);
		System.out.println("口座名義：" + name);
	}
}
