package day02;

public class Baozhuanglei {

	public static void main(String[] args) {
		Int x = new Int(10); // ���������ͱ�Ϊ��װ��
		Object obj = x;// ����ת��
		System.out.println(x.intValue() * x.intValue());// ȡ�����ݲ��ܹ�����
	}

}

class Int { // ����һ��ֻ��װint���͵İ�װ��
	private int num;// �����Ļ����������͵�����

	public Int(int num) {// ���췽�� ���ջ�����������
		this.num = num;// �������ͱ�Ϊ�˰�װ��
	}

	public int intValue() {// �Ӱ�װ����ȡ��������������
		return this.num;
	}
}