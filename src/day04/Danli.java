package day04;

public class Danli {

	public static void main(String[] args) {
		Singleton s = Singleton.fun();
		s.print();
	}

}

class Singleton {
	private static Singleton sing = null;

	private Singleton() {

	}

	public void print() {
		System.out.println("Today is a good day!");
	}

	public static Singleton fun() {
		if (sing == null) {
			return new Singleton();
		}
		return sing;
	}
}
