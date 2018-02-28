package day01;

class AA{
	public void print(){
         System.out.println("&&&&&&&&&&&&&");		
	}
}

class BB extends AA{
	public void print(){
		System.out.println("||||||||||||||");
	}
}

public class Fuxie {
      public static void main(String[] args) {
		BB b=new BB();
		b.print();
	}
      
}
