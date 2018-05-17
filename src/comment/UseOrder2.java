package comment;
class UseOrder2 {
	public static void main(String[] args) {
		// Orderクラス型の変数order1を宣言し、
		// Orderクラスのインスタンスを生成して代入する
		Order order1 = new Order();
		// 変数order1が参照するインスタンスのメソッドを呼び出す
		order1.setPrice(2500);
		order1.setQuantity(50);
		int payment1 = order1.calcPayment();
		// calcPaymentメソッドの戻り値をディスプレイに表示する
		System.out.println("支払料金１　：" + payment1 + "円");
		// Orderクラス型の変数order2を宣言し、
		// Orderクラスのインスタンスを生成して代入する
		Order order2 = new Order();
		// 変数order2が参照するインスタンスのメソッドを呼び出す
		order2.setPrice(5000);
		order2.setQuantity(20);
		int payment2 = order2.calcPayment();
		// calcPaymentメソッドの戻り値をディスプレイに表示する
		System.out.println("支払料金２　：" + payment2 + "円");
		System.out.println("支払料金合計：" + (payment1 + payment2) + "円");
	}
}
