package day02;

//�����ڲ���
public class Niminglei {

	public static void main(String[] args) {
		A a = new A() {
			public void print() {
				System.out.println("*************");
			}
		};
		a.print();
	}
}

interface A {
	public void print();
}
