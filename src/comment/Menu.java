package comment;
class Menu {
	String name;
	int price;

	// これが実際に、mainから呼び出されるコンストラクタ
	Menu(String name, int price) {

		// オーバーロードしたコンストラクタ（引数なし）の呼び出し
		// これが出来るのは1回だけ、処理の最初に。
		this();
//		this();　// this()を2回呼び出すのはダメ

		// thisは、「このオブジェクトの」を示す。
		// メンバ変数のnameにローカル変数nameの値を代入
		this.name = name;
		// メンバ変数のpriceにローカル変数priceの値を代入
		this.price = price;
//		this(); // 何かの処理のあとにthis()を呼ぶのもダメ
	}

	// 引数なしのコンストラクタ
	Menu() {
		System.out.println("別のコンストラクタが呼び出されました。");
	}

	// 引数として宣言した変数とメンバ変数が同名のとき、
	// 変数を区別するために、thisキーワードをつかう。
//	Menu(String na, int pri) {
//		name = na;
//		price = pri;
//	}

	void display() {
		System.out.println("品名：" + this.name);
		System.out.println("単価：" + this.price + "円");
	}
}
