package models;
//����ע��
public class Animal {
	private String name;
	private int age;
	//���ι�����
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void print(){
		System.out.println(this.name+"�������ǣ�"+this.age+"��");
	}
	//set get����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
