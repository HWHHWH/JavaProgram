package threadTest;

public class RunRace {
	public static void main(String[] args) {
		Rabbit rabbit =new Rabbit();
		Tortoise tort=new Tortoise();
		rabbit.start();//start�����Ǽ̳��߳���Thread�ķ�������cpu����
		tort.start();
		
		for(int i=0;i<10;i++){
			System.out.println("main"+i);
		}
	}

}
