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
		System.out.println("苦逼的程序员在写代码");
	}
}

class Manager extends Employee {

	@Override
	public void work() {
		System.out.println("项目经理在做需求分析");
	}

	public void price() {
		System.out.println("项目经理有项目提成,苦逼的程序员没有");
	}
}