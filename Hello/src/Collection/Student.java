package Collection;
/*
 * ѧ����
 */
public class Student {
	private String name;//����
	private String no;//���
	private double score;//�ɼ�
	//�޲ι�����
	public Student() {
		// TODO Auto-generated constructor stub
	}
	//���ι�����
	public Student(String name, String no, double score) {
		super();
		this.name = name;
		this.no = no;
		this.score = score;
	}
	//set get����
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
