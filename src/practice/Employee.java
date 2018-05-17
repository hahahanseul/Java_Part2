package practice;

public class Employee {
	int empNo;
	String empName;
	Employee(int empNo) {
		this(empNo, "未登録");
	}
	Employee(int empNo, String empName) {
		this.empNo = empNo;
		this.empName = empName;
	}
	void displayEmployee() {
		System.out.println("社員番号："+empNo);
		System.out.println("社員名　："+empName);
	}
}
