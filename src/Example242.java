import data.Gift;

public class Example242 {
	public static void main(String[] args) {
		Gift gift = new Gift(1242, "バラのアレンジメント");
		int code = gift.getCode();
		String name = gift.getName();
		System.out.println("ギフトコード：" + code);
		System.out.println("ギフト名　　：" + name);
	}
}
