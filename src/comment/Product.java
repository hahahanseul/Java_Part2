package comment;
class Product {

	// インスタンス変数を宣言
	String no; // 製品ID
	String name; // 製品名
	int price; // 価格
	int quantity; // 数量

	/**
	 * 製品情報表示
	 */
	void display() {
		// 呼び出されると、priceとquantityを元に計算。totalへ代入
		int total = price * quantity;
		System.out.println("ナンバー：" + no);
		System.out.println("製品名　：" + name);
		System.out.println("価格　　：" + price + "円");
		System.out.println("数量　　：" + quantity + "個");
		System.out.println("合計金額：" + total + "円");
	}
}
