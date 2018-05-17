package comment;
import model.Employee;

class Practice251 {
	public static void main(String[] args) {

		// Employee型のオブジェクトを格納する配列を生成
		// aryEmpに代入
		Employee[] aryEmp = new Employee[3];

		// Employeeオブジェクトを1個生成して、コンストラクタに(1111, "神田　二郎")を渡す。
		aryEmp[0] = new Employee(1111, "神田　二郎");
		aryEmp[1] = new Employee(2222, "淡路　花子");
		aryEmp[2] = new Employee(3333, "神保　三郎");

		// 配列aryEmpの要素数（3）分ループ処理して、各部屋にアクセス
		// 部屋毎に格納されているアドレスの先にあるオブジェクトの値を出力
		for (int i = 0; i < aryEmp.length; i++) {
			//			int id = aryEmp[i].getId();
			//			String name = aryEmp[i].getName();
			System.out.println("社員ID：" + aryEmp[i].getId());
			System.out.println("社員名：" + aryEmp[i].getName());
		}
		//拡張for文
		for (Employee emp : aryEmp) {
			System.out.println("社員ID：" + emp.getId());
			System.out.println("社員名：" + emp.getName());
		}
	}
}
