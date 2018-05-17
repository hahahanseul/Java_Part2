
class Example222 {
	public static void main(String[] args) {
		// Customerクラス型のオブジェクトを一個生成し、custへアドレスを代入
		Customer cust = new Customer();
		// cust変数に大縫うされているアドレスの先にあるインスタンスのidに、3333を代入する
		cust.id = 3333;
		// cust変数に大縫うされているアドレスの先にあるインスタンスのnameに、”神保　三郎”を代入する
		cust.name = "神保　三郎";
		//　cust変数に代入れているアドレスの先にあるインスタンスに定義されている、
		//　displayメソッドを呼び出す。
		cust.display();
		// otherCustに代入されているアドレスは別のオブジェクトなので、
		// 表示されるのは、初期値(変数がstaticでない限り)
		Customer otherCust = new Customer();
		otherCust.display();
	}
}

