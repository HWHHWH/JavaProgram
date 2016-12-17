package Collection;

public class Person {
	private final String name;//初始化之后无法修改数据
	private final int handsome;//final

	public Person(String name, int handsome) {
		super();
		this.name = name;
		this.handsome = handsome;
	}
	public String getName() {
		return name;
	}

	public int getHandsome() {
		return handsome;
	}

	@Override
	public String toString() {
		return "姓名："+this.name+"   帅气指数："+this.handsome+"\n";
	}
	
	

}
