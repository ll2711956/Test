package day01;

abstract class A{
	//抽象方法的特点：
	//一个是使用了abstract关键字定义，另外一个是方法的后面没有“{}”，表示没有方法体。
	public void fun(){
		System.out.println("****************");
	}
	public abstract void print();// 没有方法体，使用abstract声明
}

class B extends A{
	public void print() {
		System.out.println("这个方法是强制子类要覆写的方法.");
	}
	
}
public class Abstract {
   public static void main(String[] args) {
	A a=new B();// 向上转型
	a.print();
}
}
