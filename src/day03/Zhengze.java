package day03;

//Ϊ���ܹ������������ʶ��������������ڣ�
//�����дһ���򵥵ĳ����ж�ĳһ���ַ����Ƿ�����������ɡ�
public class Zhengze {

	public static void main(String[] args) throws Exception {
		String str = "791689723";
		System.out.println(isNumber(str));
	}

	private static boolean isNumber(String data) {
		char[] result = data.toCharArray();// ��Ϊ�ַ�����
		for (int i = 0; i < result.length; i++) {
			if (result[i] < '0' || result[i] > '9') {
				return false;
			}
		}
		return true;
	}

}
