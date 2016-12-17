package Collection;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
	private String no;//�༶���
	private List<Student> stuList;//�༶�б�
	private double total;//�ܷ�
	private double avg;//ƽ����
	//������
	public ClassRoom(Student stu) {
		this.no=stu.getNo();
		stuList=new ArrayList<Student>();
		stuList.add(stu);
		this.total=stu.getScore();//��ʼ���ܷ���
	}
	//���ι�����
	public ClassRoom(String no, List<Student> stulist, double total) {
		super();
		this.no = no;
		this.stuList = stulist;
		this.total = total;
	}
	//setter getter ����
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public List<Student> getStuList() {
		return stuList;
	}
	public void setStuList(List<Student> stuList) {
		this.stuList = stuList;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}

	

}
