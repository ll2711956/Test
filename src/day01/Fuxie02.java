package day01;

public class Fuxie02 extends Person {
	public double score;
	public int ranking;

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

    public String info(){
    	return super.info()+",分数:"+score+",排名:"+ranking;
    }
	public static void main(String[] args) {
		Fuxie02 fx=new Fuxie02();
		fx.setName("漩涡鸣人");
		fx.setAge(15);
		fx.setScore(58.6);
		fx.setRanking(50);
		System.out.println(fx.info());
	}

}
