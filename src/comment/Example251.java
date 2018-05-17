package comment;
import data.Gift;
class Example251 {
	public static void main(String[] args) {
		// Gift型のオブジェクトを管理するための配列を2部屋つくる。(部屋の初期値はnull)
		// aryGiftにその配列のアドレスを代入。
		Gift[] aryGift = new Gift[2];
		// Gift型のオブジェクトを1つ作り、そのアドレスをaryGiftの0番目に代入
		aryGift[0] = new Gift(1134, "カーネーションのブーケ");
		// Gift型のオブジェクトを1つ作り、そのアドレスをaryGiftの1番目に代入
		aryGift[1] = new Gift(1242, "バラのアレンジメント");
		// aryGiftの0番目に格納されているアドレスの先にあるオブジェクトにアクセス
		// それぞれの値を取得
		int code1 = aryGift[0].getCode();
		String name1 = aryGift[0].getName();
		// aryGiftの1番目に格納されているアドレスの先にあるオブジェクトにアクセス
		// それぞれの値を取得
		int code2 = aryGift[1].getCode();
		String name2 = aryGift[1].getName();
		// 値を表示
		System.out.println("ギフトコード：" + code1);
		System.out.println("ギフト名　　：" + name1);
		System.out.println("ギフトコード：" + code2);
		System.out.println("ギフト名　　：" + name2);

		System.out.println("for文==================");
		//for文
		for(int i = 0; i < aryGift.length; i++) {
			int code = aryGift[i].getCode();
			String name = aryGift[i].getName();
			System.out.println("ギフトコード：" + code);
			System.out.println("ギフト名　　：" + name);
		}
		System.out.println("拡張for文==================");
		//拡張for文
		// 配列をループ処理する場合は、こっちを使う！
		for(Gift gift : aryGift) {
			int code = gift.getCode();
			String name = gift.getName();
			System.out.println("ギフトコード：" + code);
			System.out.println("ギフト名　　：" + name);
		}
	}
}
