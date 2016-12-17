import javax.swing.text.StyledEditorKit.ForegroundAction;


//������ Animal 
abstract interface Animal {
	public abstract void cry();
	public abstract String getAnimalName();
}
//ģ������ 
class Simulator {
		public void playSound(Animal animal){
			String name;
			animal.cry();
			name=animal.getAnimalName();
			System.out.println(name);
		}
}
//���� �̳� ������
class Dog implements Animal{
	public void cry(){
		System.out.println("������");
	}
	public String getAnimalName(){
		String name;
		name="С����";
	    return name; 
	}	
}
//è�� �̳ж�����
class Cat implements Animal {
	public void cry(){
		System.out.println("������");
	}
	public String getAnimalName(){
		String name;
		name="Сèè";
		return name;
				
	}

}
public class TestInterface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simulator simulator=new Simulator();
		simulator.playSound(new Dog());//ֱ�����ำֵ
		System.out.println();
		simulator.playSound(new Cat());

	}
}
