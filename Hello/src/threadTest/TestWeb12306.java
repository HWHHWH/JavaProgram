package threadTest;

public class TestWeb12306 implements Runnable{
	int num=40;

	@Override
	public void run() {
		while(true){
			if (num<0){
				break;
			}
			System.out.println(Thread.currentThread().getName()+num--);
		}
		
	}
	
	public static void main(String[] args) {
		TestWeb12306 web=new TestWeb12306();
		Thread t1=new Thread(web, "·�˼�");
		Thread t2=new Thread(web, "·����");
		Thread t3=new Thread(web, "��");
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
