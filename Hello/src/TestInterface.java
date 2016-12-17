import javax.swing.text.StyledEditorKit.ForegroundAction;


//抽象类 Animal 
abstract interface Animal {
	public abstract void cry();
	public abstract String getAnimalName();
}
//模拟器类 
class Simulator {
		public void playSound(Animal animal){
			String name;
			animal.cry();
			name=animal.getAnimalName();
			System.out.println(name);
		}
}
//狗类 继承 动物类
class Dog implements Animal{
	public void cry(){
		System.out.println("汪汪汪");
	}
	public String getAnimalName(){
		String name;
		name="小狗狗";
	    return name; 
	}	
}
//猫类 继承动物类
class Cat implements Animal {
	public void cry(){
		System.out.println("喵喵喵");
	}
	public String getAnimalName(){
		String name;
		name="小猫猫";
		return name;
				
	}

}
public class TestInterface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simulator simulator=new Simulator();
		simulator.playSound(new Dog());//直接以类赋值
		System.out.println();
		simulator.playSound(new Cat());

	}
}
