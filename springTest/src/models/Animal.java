package models;
//构造注入
public class Animal {
	private String name;
	private int age;
	//带参构造器
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void print(){
		System.out.println(this.name+"的年龄是："+this.age+"岁");
	}
	//set get方法
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
