package comment;
class Example222 {
	public static void main(String[] args) {
		// Customerクラス型のオブジェクトを1個生成し、custへアドレスを代入。
		Customer cust = new Customer();
		// cust変数に代入されているアドレスの先にあるインスタンスのidに、3333を代入
		cust.id = 3333;
		// cust変数に代入されているアドレスの先にあるインスタンスのnameに、"神保　三郎"を代入
		cust.name = "神保　三郎";
		// cust変数に代入されているアドレスの先にあるインスタンスに定義されている、
		// displayメソッドを呼び出す。
		cust.display();

		// otherCustに代入されているアドレスは別のオブジェクトなので、
		// 表示されるのは、初期値（変数がstaticでない限り）
		// staticがついた変数は、そのクラスから作られたオブジェクトすべてで共有
		Customer otherCust = new Customer();
		otherCust.display();
	}
}
