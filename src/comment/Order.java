package comment;
class Order {
	int price; 		// 価格
	int quantity;	// 数量
	// 価格を設定する
	void setPrice(int p) {
		price = p;
	}
	// 数量を設定する
	void setQuantity(int q) {
		quantity = q;
	}
	// 支払額を計算する
	int calcPayment() {
		int result = price * quantity;
		return result;
	}
}
