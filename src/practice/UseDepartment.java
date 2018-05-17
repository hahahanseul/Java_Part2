package practice;

public class UseDepartment {
	public static void main(String[] args) {
		Department dept = new Department(100, "総務部");
		dept.setDeptNo(101);
		dept.setDepName("総務管理部");
		int no = dept.getDeptNo();
		String name = dept.getDeptName();
		System.out.println("部署番号を変更しました：" + no);
		System.out.println("部署名を変更しました：" + name);
	}
}
