package practice;

class Member {
	int id;
	String name;

	Member(int i, String n) {
		id = i;
		name = n;
	}

	void setData(int i) {
		id = i;
	}

	void setData(int i, String n) {
		id = i;
		name = n;
	}

	void displayMember() {
		System.out.println("会員ID：" + id);
		System.out.println("会員名：" + name);
	}
}
