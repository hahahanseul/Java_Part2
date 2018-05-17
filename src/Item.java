/**
 * @author キム
 * */
public class Item {
	int no;
	String name;
	int price;

	Item(int no) {
		this(no,"未登録",0);
	}

	/**
	 * コンストラクタ(引数3個)
	 * 実際にインスタンス変数に、値を代入する
	 * どのコンストラクタが呼ばれても、仕事をするのはここ(共通化)
	 * */
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
