package day01;

public class Jicheng extends Person {
	public int num;
	public String job;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public static void main(String[] args) {
		Jicheng jc = new Jicheng();
		jc.setName("��ɮ");
		jc.setAge(36);
		jc.setJob("����");
		jc.setNum(1001);
		System.out.println("����:" + jc.name + ",����:" + jc.age + ",ְҵ:" + jc.job + ",����:" + jc.num);
	}

}
