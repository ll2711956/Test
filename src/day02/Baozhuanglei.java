package day02;

public class Baozhuanglei {

	public static void main(String[] args) {
		Int x = new Int(10); // 将基本类型变为包装类
		Object obj = x;// 对象转型
		System.out.println(x.intValue() * x.intValue());// 取出内容才能够计算
	}

}

class Int { // 定义一个只包装int类型的包装类
	private int num;// 真正的基本数据类型的数据

	public Int(int num) {// 构造方法 接收基本数据类型
		this.num = num;// 基本类型变为了包装类
	}

	public int intValue() {// 从包装类中取出基本数据类型
		return this.num;
	}
}