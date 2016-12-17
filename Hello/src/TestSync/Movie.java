package TestSync;

public class Movie {
	private String pic;
	
	public Movie() {
		
	}
	
	public Movie(String pic, boolean flag) {
		super();
		this.pic = pic;
		this.flag = flag;
	}
	//信号灯
	//flag--true： 生产者生产；消费者等待，生产完成通知消费者
	//flag--false:消费者消费，生产者等待【wait】，消费完通知生产者【notify】
	
	private boolean flag=true;//信号灯
	//播放功能
	public  synchronized void play(String pic) throws InterruptedException{
		if(!flag){//flag=false，生产者等待
			this.wait();
		}
		//flag=true,生产者生产
		Thread.sleep(500);
		System.out.println("生产了"+pic);
		this.pic=pic;
		this.notify();//生产完成，通知消费者
		this.flag=false;//信号灯改为false
	}
	
	public  synchronized void watch() throws InterruptedException{
		if(flag){//flag=true,
			this.wait();//消费者等待
		}
		//flag=false，消费者消费
		Thread.sleep(300);
		System.out.println("消费了"+pic);
		//消费完成，通知生产者
		this.notify();
		this.flag=true;//信号灯改为true
		System.out.println();
	}
}
 