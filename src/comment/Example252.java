package comment;
import java.util.ArrayList;

import data.Gift;
class Example252 {
	public static void main(String[] args) {
		// Gift型のオブジェクトのアドレスを格納出来るArrayListを生成
		// listにアドレスを代入
		// ArrayListに入れる型は<>ジェネリクスで指定。
		// ジェネリクスを指定しない場合は、参照型変数をなんでも代入可能。
//		ArrayList<Gift> list = new ArrayList<Gift>();

		// ダイヤモンド演算子を使うと右辺のジェネリクスを省略出来る。
		ArrayList<Gift> list = new ArrayList<>();

		// Gift型のオブジェクトを1個生成し、コンストラクタに値を渡す。
		// Gift型変数gift1に代入。
		Gift gift1 = new Gift(594, "キキョウの花束");
		// Gift型のオブジェクトを1個生成し、コンストラクタに値を渡す。
		// Gift型変数gift2に代入。
		Gift gift2 = new Gift(954, "ユリのブーケ");
		// ArrayListのlistにgift1のアドレスを加える。
		list.add(gift1);
		// ArrayListのlistにgift2のアドレスを加える。
		list.add(gift2);
		// ArrayListの要素数分ループ（size()メソッドで取得）
		for(int i = 0; i < list.size(); i++) {
			// get(部屋番号)で、ArrayListの各部屋にアクセスできる。
			// 取得したGiftオブジェクトをgiftに代入。
			Gift gift = list.get(i);
			System.out.println("ギフトコード：" + gift.getCode());
			System.out.println("ギフト名　　：" + gift.getName());
		}
		// 拡張for文ももちろん使える！
		for (Gift gift : list) {
			System.out.println("ギフトコード：" + gift.getCode());
			System.out.println("ギフト名　　：" + gift.getName());
		}
	}
}
