package threadTest;

public class RunRace {
	public static void main(String[] args) {
		Rabbit rabbit =new Rabbit();
		Tortoise tort=new Tortoise();
		rabbit.start();//start方法是继承线程类Thread的方法，由cpu调用
		tort.start();
		
		for(int i=0;i<10;i++){
			System.out.println("main"+i);
		}
	}

}
