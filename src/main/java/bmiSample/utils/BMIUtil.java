package bmiSample.utils;

/**
 * BMIを計算するクラス
 * @author 
 *
 */
public class BMIUtil {
	
	/**
	 * BMIを計算する
	 * @param height
	 * @param weight
	 * @return BMI
	 */
	public static double calcBMI(double height, double weight) {
		
		// BMIを計算する
		height = height / 100;
		return weight / (height * height);
	}
	
	/**
	 * BMIを元に肥満度を判定する（WHO基準）
	 * 
	 * @param bmi
	 * @return 判定結果
	 */
	public static String judgeBMI(double bmi) {
		
		// BMIの内容を元に結果を判定する
		if (bmi < 18.5) {
			return "痩せ型";
		} else if (bmi < 25) {
			return "標準体重";
		} else if (bmi < 30) {
			return "肥満(1度)";
		} else if (bmi < 35) {
			return "肥満(2度)";
		} else if (bmi < 40) {
			return "肥満(3度)";
		} else {
			return "肥満(4度)";
		}
	}
}
