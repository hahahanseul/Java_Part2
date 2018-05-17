
class Book {
	String title;	//書籍名
	String author;	//著者
	int price; //単価

	Book(String t, String a, int p) {
		title = t;
		author = a;
		price = p;
	}

	/**
	 * 変数に格納されている値を代入して出力
	 * */
	void display() {
		System.out.println("書籍名：" + title);
		System.out.println("著者　：" + author);
		System.out.println("単価　：" + price+"円");
	}
}
