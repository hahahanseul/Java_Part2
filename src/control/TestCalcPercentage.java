package control;

import utility.CalcPercentage;

public class TestCalcPercentage {
	public static void main(String[] args) {
		try {
			double result = CalcPercentage.percentage(150, 50);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("例外発生："+e.getMessage());
		}
		System.out.println("処理終了");
	}
}
