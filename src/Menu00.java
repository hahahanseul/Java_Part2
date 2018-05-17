
class Menu00 {

	String name;
	int price;

	// 引数として宣言した変数とメンバ変数が同名のとき、
	// 変数を区別するために、thisキーワードを使う。
	Menu00(String name, int price) {
		// オーバーロードしたコンストラクタ(引数なし)の呼び出し
		// これが出来るのは1回だけ、処理の最初に。
		this();
		//		this();を2回呼び出すのはだめ、コンパイルエラー
		// thisは、「このオブジェクトの」を示す
		// メンバ変数のnameにローカ変数nameの値代入
		this.name = name;
		// メンバ変数のpriceにローカ変数priceの値代入
		this.price = price;
		// 		this(); 何かの処理のあとthis()を呼ぶのもダメ
	}

	Menu00() {
		System.out.println("別のコンストラクタが呼び出されました。");
	}


	void display() {
		System.out.println("品名：" + name);
		System.out.println("単価：" + price + "円");

	}

}
