package TestCollection;
/*
 * ����һ��������
 */
public class Letter {
	private String name;//����
	private int count;//���ʵĸ���
	//������
	public Letter(String name){
		this.name=name;
		this.count=1;//�½��࣬����Ϊ1
	}
	//���ι�����
	public Letter(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}
	//set get����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	

}
