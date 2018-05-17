package comment;
class Book {
	String title; // 書籍名
	String author; // 著者
	int price; // 単価
	/**
	 * コンストラクタ
	 * @param t 書籍名
	 * @param a 著者
	 * @param p 単価
	 */
	Book(String t, String a, int p) {
		title = t;
		author = a;
		price = p;
	}

	/**
	 * 変数に格納された値を表示
	 */
	void display() {
		System.out.println("書籍名：" + title);
		System.out.println("著者　：" + author);
		System.out.println("単価　：" + price + "円");
	}
}
