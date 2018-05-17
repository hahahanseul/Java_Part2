
class Account {
	int number;
	String name;

	/**
	 * コンストラクタ
	 * このクラスがインスタンスかされたときに、一回だけ呼ばれる処理
	 * mainメソッドから渡された引数を自クラスの変数へ代入
	 * @param nu 口座番号
	 * @param na 口座名義
	 * */
	Account(int nu, String na) {
		number = nu;
		name = na;
	}

	void init(int nu, String na) {
		number = nu;
		name = na;
	}

	void display() {
		System.out.println("口座番号：" + number);
		System.out.println("口座名義：" + name);

	}
}
