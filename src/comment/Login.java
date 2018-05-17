package comment;
class Login {
	private String mail;
	private String pass;

	// mainメソッドから渡された値（入力値）をインスタンス変数へ代入。
	public Login(String mail, String pass) {
		this.mail = mail;
		this.pass = pass;
	}
	public String getMail() {
		return mail;
	}
	public String getPass() {
		return pass;
	}
}
