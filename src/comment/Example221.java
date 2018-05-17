package comment;
class Example221 {
	public static void main(String[] args) {
		// Customer型の変数custを宣言
		// nｓew演算子でCustomerオブジェクトを1つ生成し（インスタンス化）
		// 生成したオブジェクトのアドレスをcustに代入
		// 代入する変数の型（左辺）と実際のオブジェクト（右辺）は、型が同じじゃないとダメ
		Customer cust = new Customer();
		// キャメルストリング
		Customer otherCust = new Customer();
		// スネークストリング
		// custに入っている、アドレスが、other_ｃustに代入される。
		Customer other_ｃust = cust;

		// 比較結果はfalse。custに代入されているアドレスと、otherCustに代入されているアドレスが異なるので。
		// == 演算子の比較はアドレスの比較であり、オブジェクトの中身の比較ではない。
		System.out.println("cust == otherCust:" + (cust == otherCust));

		// 比較結果はtrue。custに代入されているアドレスと、other_ｃustに代入されているアドレスが等しいため。
		System.out.println("cust == other_ｃust:" + (cust == other_ｃust));
	}
}
