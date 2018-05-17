package practice;

public class Menu {
	String name;
	int price;

	Menu(int p) {
		price = p;
		name = "未設定";
	}

	Menu(String n, int p) {
		name = n;
		price = p;
	}

	void displayMenu() {
		System.out.println("メニュー名："+name);
		System.out.println("単価　　　："+price);
	}
}
