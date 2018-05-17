package comment;

/**
 * private属性の意味を確認するためのサンプル
 * @author s.takasaki
 */
class UsePrivateTest {
	public static void main(String[] args) {
		PrivateTest test = new PrivateTest();
		// private属性でない場合、以下のような操作が可能
		// せっかくgetter,setterメソッドをつくって経路を限定しても意味がなくなってしまう。。。
		test.id = 0;
	}
}

class PrivateTest {
	int id; // インスタンス変数
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}