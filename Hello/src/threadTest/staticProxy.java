package threadTest;

/*
 * �̵߳ľ�̬�������
 */

public class staticProxy {
	public static void main(String[] args) {
		You you=new You();
		Company company=new Company(you);
		company.marry();
		
	}
	
}
//�ӿ�
interface Marry{
	public abstract void marry();//���󷽷�������д
}
//����ʵ��ͬһ���ӿ�
class You implements Marry{
	@Override
	public void marry() {//��д����
		System.out.println("�ҽ����");
		
	}
}
//���칫˾ʵ��ͬһ���ӿڣ�������ʵ�������
class Company implements Marry{
	You you;
	//���ι�����
	public Company(You you) {
		this.you = you;
	}
	
	public void before(){
		System.out.println("���ǰ׼��");
	}
	
	public void after(){
		System.out.println("������ף");
	}

	@Override
	public void marry() {
		before();
		you.marry();//������ʵ�������
		after();
		
	}
}