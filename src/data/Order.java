package data;

public class Order {
	private int no;
	private String custName;

	public Order(int no, String custName) {
		this.no = no;
		this.custName = custName;
	}

	public int getNo() {
		return no;
	}

	public String getCustName() {
		return custName;
	}
}
