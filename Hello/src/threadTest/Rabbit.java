package threadTest;

public class Rabbit extends Thread  {
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("��������"+i+"��");
		}
	}

	
}


 class Tortoise extends Thread  {
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("�ڹ�����"+i+"��");
		}
	}

}