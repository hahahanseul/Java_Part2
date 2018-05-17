
public class Example231 {
	public static void main(String[] args) {
						// Accountクラスのインスタンス化(コンストラクタの呼び出し)
						// 呼び出しの際に引数として、(1234567, "神田　二郎")を渡している。
		Account ac = new Account(1234567, "神田　二郎");

/*		// 引数ありのコンストラクタがある場合、インスタンス化は出来ない。
 		Account ac = new Account();
		ac.init(1234567,"神田二郎");
		초기화를 인위적으로 하게 되면, 호출할 타이밍을 개발자가 직접 지정해야함 실수할 가능성이 크고, 다른 사람이 보았을 때 이해하기 어려울 수 있음
		자바의 기본 정신에 어긋난달까!!

		*
		*/
		ac.display();
	}
}
