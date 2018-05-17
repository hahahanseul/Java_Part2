package utility;

public class CalcPercentage {
	public static double percentage(double data, double percent) throws Exception {

			if(data<0) {
				Exception e = new Exception("不正な引数");
				throw e;
			}
			double ans = data / 100 * percent;
			return ans;
	}
}
