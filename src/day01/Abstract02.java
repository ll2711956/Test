package day01;

public class Abstract02 {

	public static void main(String[] args) {
		Employee em = new Programmer();
		em.work();
		Employee em1 = new Manager();
		Manager ma = (Manager) em1;
		ma.work();
		ma.price();
	}

}

abstract class Employee {
	public String name;
	public int age;
	public int num;

	public abstract void work();
}

class Programmer extends Employee {

	@Override
	public void work() {
		System.out.println("��Ƶĳ���Ա��д����");
	}
}

class Manager extends Employee {

	@Override
	public void work() {
		System.out.println("��Ŀ���������������");
	}

	public void price() {
		System.out.println("��Ŀ��������Ŀ���,��Ƶĳ���Աû��");
	}
}