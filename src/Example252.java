import java.util.ArrayList;

import data.Gift;

public class Example252 {
	public static void main(String[] args) {
		// Gift型のオブジェクトのアドレスを格納出来るArrayListを生成
		// listにアドレスを代入
		// ArrayListに入れる型はジェネリクスで指定。
		// Genericsを指定しない場合は、参照型変数をなんでも代入可能。
		// ダイヤモンド演算子を使うと右辺のジェネリクスを省略できす。
		ArrayList<Gift> list = new ArrayList<>();
		// 한쪽에만 지정해주면, 뒷쪽은 다이아몬드 연산자라고 해서 자바에서 자동으로 처리해줌

		// Gift型のオブジェクトを1個生成し、コンストラクタに値を渡す。
		// Gift型変数gift1に代入。
		Gift gift1 = new Gift(594, "キキョウの花束");

		// Gift型のオブジェクトを2個生成し、コンストラクタに値を渡す。
		// Gift型変数gift2に代入。
		Gift gift2 = new Gift(954, "ユリのブーケ");
		// ArrayListのlistにgift1のアドレスを加える。
		list.add(gift1);
		// ArrayListのlistにgift2のアドレスを加える。
		list.add(gift2);

		// ArrayListの要素数分ループ(size()メソッドで取得)
		for (int i = 0; i < list.size(); i++) {
			// get(部屋番号)で、ArrayListの各部屋にアクセスできる。
			// 取得したGiftオブジェクトをgiftに代入
			Gift gift = list.get(i);
			System.out.println("ギフトコード：" + gift.getCode());
			System.out.println("ギフト名　　：" + gift.getName());
		}

		// 拡張for文ももちろん使える！
		for(Gift gift :list) {
			System.out.println("ギフトコード：" + gift.getCode());
			System.out.println("ギフト名　　：" + gift.getName());
		}

	}
}
