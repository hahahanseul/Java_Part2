package practice;
/**
 * @author キム
 * */
class Student {
	int number;
	String name;
	Student(int nu, String na) {
		number = nu;
		name = na;
	}
	void setNumber(int nu) {
		number =nu;
	}
	void setName(String na) {
		name = na;
	}
	void displayStudent() {
		System.out.println("学籍番号:"+number);
		System.out.println("氏名:"+name);
	}
}
