package TestCollection;
/*
 * 创建一个单词类
 */
public class Letter {
	private String name;//单词
	private int count;//单词的个数
	//构造器
	public Letter(String name){
		this.name=name;
		this.count=1;//新建类，个数为1
	}
	//带参构造器
	public Letter(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}
	//set get方法
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
