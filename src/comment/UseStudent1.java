package comment;
class UseStudent1 {
	public static void main(String[] args) {
		// Studentクラスのコンストラクタを呼び出し、生成したStudentクラスの
		// インスタンスをStudentクラス型の変数studentに代入する。
		Student student = new Student(1234, "鈴木一郎");
		// 変数studentが参照するインスタンスのdisplayStudentメソッドを呼び出す
		student.displayStudent();
	}
}
