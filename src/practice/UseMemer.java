package practice;

public class UseMemer {
	public static void main(String[] args) {
		Member mem = new Member(0, "未登録");
		mem.displayMember();
		mem.setData(1111);
		mem.displayMember();
		mem.setData(1619, "田中二郎");
		mem.displayMember();
	}
}
