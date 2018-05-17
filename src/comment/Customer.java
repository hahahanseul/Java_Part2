package comment;

/**
 * 顧客オブジェクトサンプル
 */
class Customer {

	// インスタンス変数
	// idは、整数値なのでint型
	int id;
	// nameは文字列なので、String型
	String name;

	/**
	 * 顧客情報をコンソールに表示する。
	 */
	void display() {
		System.out.println("ID　：" + id);
		System.out.println("氏名：" + name);
	}
}
