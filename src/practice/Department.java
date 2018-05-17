package practice;

public class Department {
	private int deptNo;
	private String deptName;

	public Department(int deptNo, String deptName) {
		this.deptNo = deptNo;
		this.deptName = deptName;
	}

	public int getDeptNo() {
		return this.deptNo;
	};

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return this.deptName;
	}

	public void setDepName(String deptName) {
		this.deptName = deptName;
	}

}
