package comment;

class Practice222 {

	public static void main(String[] args) {

		// Product型の変数proを宣言し、Productを1個インスタンス化。
		// インスタンスのアドレスを、proに代入。
		Product pro = new Product();

		// proにあるアドレスの先にあるオブジェクトに、アクセス
		// それぞれの変数に値を代入。
		pro.no = "T001";
		pro.name = "トートバッグ";
		pro.price = 8000;
		pro.quantity = 5;
		pro.display();
	}
}
