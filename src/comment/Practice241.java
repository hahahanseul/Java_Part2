package comment;
import java.util.Scanner;
class Practice241 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("メールアドレス > ");
			// 入力値（メールアドレス）を受付て、mail1に代入
			String mail1 = sc.next();
			System.out.print("パスワード　　 > ");
			// 入力値（パスワード）を受付て、pass1に代入
			String pass1 = sc.next();
			// ログイン型のオブジェクトを生成して、コンストラクタにmail1、pass1を引き渡す。
			Login log = new Login(mail1, pass1);
			// ログイン型のオブジェクトから、メールアドレス、パスワードを取得
			String mail2 = log.getMail();
			String pass2 = log.getPass();
			// 下記のように、直接getterメソッドの戻り値を直接出力してもOK
			System.out.println("メールアドレス：" + log.getMail());
			System.out.println("パスワード　　：" + log.getPass());
			sc.close();
		} catch(Exception e) {
			System.out.println("エラーが発生しました！");
		}
	}
}