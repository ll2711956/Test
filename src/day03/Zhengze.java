package day03;

//为了能够更加清楚的认识到正则的意义所在，
//下面编写一个简单的程序：判断某一个字符串是否有数字所组成。
public class Zhengze {

	public static void main(String[] args) throws Exception {
		String str = "791689723";
		System.out.println(isNumber(str));
	}

	private static boolean isNumber(String data) {
		char[] result = data.toCharArray();// 变为字符数组
		for (int i = 0; i < result.length; i++) {
			if (result[i] < '0' || result[i] > '9') {
				return false;
			}
		}
		return true;
	}

}
