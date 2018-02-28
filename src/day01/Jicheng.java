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
		jc.setName("唐僧");
		jc.setAge(36);
		jc.setJob("和尚");
		jc.setNum(1001);
		System.out.println("姓名:" + jc.name + ",年龄:" + jc.age + ",职业:" + jc.job + ",工号:" + jc.num);
	}

}
