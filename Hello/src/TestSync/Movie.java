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
	//�źŵ�
	//flag--true�� �����������������ߵȴ����������֪ͨ������
	//flag--false:���������ѣ������ߵȴ���wait����������֪ͨ�����ߡ�notify��
	
	private boolean flag=true;//�źŵ�
	//���Ź���
	public  synchronized void play(String pic) throws InterruptedException{
		if(!flag){//flag=false�������ߵȴ�
			this.wait();
		}
		//flag=true,����������
		Thread.sleep(500);
		System.out.println("������"+pic);
		this.pic=pic;
		this.notify();//������ɣ�֪ͨ������
		this.flag=false;//�źŵƸ�Ϊfalse
	}
	
	public  synchronized void watch() throws InterruptedException{
		if(flag){//flag=true,
			this.wait();//�����ߵȴ�
		}
		//flag=false������������
		Thread.sleep(300);
		System.out.println("������"+pic);
		//������ɣ�֪ͨ������
		this.notify();
		this.flag=true;//�źŵƸ�Ϊtrue
		System.out.println();
	}
}
 