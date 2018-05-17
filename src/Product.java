/**
 * @author kim キム
 * */
class Product {
	String no, name;
	int price, quantity;

	/*
	 * String no = "T001";
	 * String name = "トートバッグ";
	 * int price = 8000;
	 * int quantity = 5;
	 * */

	void display() {
		int total = price * quantity;
		System.out.println("ナンバー:" + no);
		System.out.println("製品名:" + name);
		System.out.println("価格:" + price+"円");
		System.out.println("数量:" + quantity+"個");
		System.out.println("合計金額:" + total+"円");
	}
}
