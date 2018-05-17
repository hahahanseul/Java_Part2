package comment;
class Student {
	int number;		// 生徒番号
	String name;	// 氏名
	// コンストラクタ
	Student(int nu, String na) {
		number = nu;
		name = na;
	}
	// 生徒番号を設定する
	void setNumber(int nu) {
		number = nu;
	}
	// 氏名を設定する
	void setName(String na) {
		name = na;
	}
	// 生徒情報を表示する
	void displayStudent() {
		System.out.println("学生番号：" + number);
		System.out.println("氏名　　：" + name);
	}
}
