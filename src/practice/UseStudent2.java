package practice;
/**
 * @author キム
 * */
public class UseStudent2 {
	public static void main(String[] args) {
		Student student = new Student(1234, "鈴木一郎");
		student.displayStudent();
		student.setNumber(5678);
		student.setName("佐藤一美");
		System.out.println();
	}
}
