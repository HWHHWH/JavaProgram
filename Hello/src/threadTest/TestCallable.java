package threadTest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCallable {
	public static void main(String[] args) throws Exception {
		RaceAnimal rabbit=new RaceAnimal("����", 500);
		RaceAnimal tortoise=new RaceAnimal("�ڹ�", 1000);
		//
		ExecutorService ser=Executors.newFixedThreadPool(2);
		Future<Integer> result1=ser.submit(rabbit);
		Future<Integer> result2=ser.submit(tortoise);
		
		Thread.sleep(2000);
		rabbit.setFlag(false);
		tortoise.setFlag(false);
		
		int num1=result1.get();
		int num2=result2.get();
		System.out.println("��������"+num1+"��");
		System.out.println("�ڹ�����"+num2+"��");
		
		ser.shutdownNow();
		
	}

}

class RaceAnimal implements Callable<Integer>{
	private String name;//����
	private long time;//��ʱ
	private int step;
	private boolean flag=true;
	
	//���ι�����
	public RaceAnimal(String name, long time) {
		this.name = name;
		this.time = time;
		
	}

	@Override
	public Integer call() throws Exception {
		
		while(flag){
			Thread.sleep(time);
			step++;
			
		}
		return step;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
}