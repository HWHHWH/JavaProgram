package threadTest;

/*
 * 线程的静态代理机制
 */

public class staticProxy {
	public static void main(String[] args) {
		You you=new You();
		Company company=new Company(you);
		company.marry();
		
	}
	
}
//接口
interface Marry{
	public abstract void marry();//抽象方法必须重写
}
//个人实现同一个接口
class You implements Marry{
	@Override
	public void marry() {//重写方法
		System.out.println("我结婚了");
		
	}
}
//婚庆公司实现同一个接口，调用真实类的引用
class Company implements Marry{
	You you;
	//带参构造器
	public Company(You you) {
		this.you = you;
	}
	
	public void before(){
		System.out.println("结婚前准备");
	}
	
	public void after(){
		System.out.println("结婚后庆祝");
	}

	@Override
	public void marry() {
		before();
		you.marry();//调用真实类的引用
		after();
		
	}
}