package day01;

abstract class A{
	//���󷽷����ص㣺
	//һ����ʹ����abstract�ؼ��ֶ��壬����һ���Ƿ����ĺ���û�С�{}������ʾû�з����塣
	public void fun(){
		System.out.println("****************");
	}
	public abstract void print();// û�з����壬ʹ��abstract����
}

class B extends A{
	public void print() {
		System.out.println("���������ǿ������Ҫ��д�ķ���.");
	}
	
}
public class Abstract {
   public static void main(String[] args) {
	A a=new B();// ����ת��
	a.print();
}
}
