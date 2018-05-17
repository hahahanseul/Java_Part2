
class Example221 {
	public static void main(String[] args) {
		// Customer型の変数custを宣言
		// new演算子でCustomerオブジェクトを１つ生成し(インスタンス化)
		// 生成したオブジェクトのアドレスをcustに代入
		// 代入する変数の型(左辺)と実際のオブジェクト(右辺)は型が同じじゃないとダメ
		Customer cust = new Customer();
		Customer otherCust = new Customer();
		Customer other_cust = cust;
		// 比較結果はfalse。custに代入されているアドレスと、otherCustに代入sれているアドレスが異なるので、
		// ==演算子の比較はアドレスの比較であり、オブジェクトの中身の比較ではない。
		System.out.println("cust == otherCust：" + (cust == otherCust));
		// 比較結果はtrue。custに代入されているアドレスと、other_custに代入されているアドレスが等しいため。
		System.out.println("cust == other_cust：" + (cust == other_cust));
	}
}
