package comment;
class Item {

	// インスタンス変数
	int no; // 商品番号
	String name; // 商品名
	int price; // 単価

	/**
	 * コンストラクタ（引数1個）
	 * @param no
	 */
	Item(int no) {
		// ↓引数3個のコンストラクタの呼び出し
		this(no, "未登録", 0);

//		this.no = no;
//		this.name = "未登録";
//		this.price = 0;
	}
	/**
	 * コンストラクタ（引数3個）
	 * 実際にインスタンス変数に、値を代入する
	 * どのコンストラクタが呼ばれても、仕事をするのはここ（共通化）
	 * @param no
	 * @param name
	 * @param price
	 */
	Item(int no, String name, int price) {
		this.no = no;
		this.name = name;
		this.price = price;
	}

	void display() {
		System.out.println("商品番号：" + no);
		System.out.println("商品名　：" + name);
		System.out.println("単価　　：￥" + price);
	}
}
