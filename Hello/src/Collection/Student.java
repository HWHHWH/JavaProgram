package Collection;
/*
 * 学生类
 */
public class Student {
	private String name;//姓名
	private String no;//班号
	private double score;//成绩
	//无参构造器
	public Student() {
		// TODO Auto-generated constructor stub
	}
	//带参构造器
	public Student(String name, String no, double score) {
		super();
		this.name = name;
		this.no = no;
		this.score = score;
	}
	//set get方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	

}
