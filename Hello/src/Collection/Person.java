package Collection;

public class Person {
	private final String name;//��ʼ��֮���޷��޸�����
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
		return "������"+this.name+"   ˧��ָ����"+this.handsome+"\n";
	}
	
	

}
