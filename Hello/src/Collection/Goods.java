package Collection;
/*
 * ��Ʒ�࣬û��ʵ���Զ�������ӿ�
 */
public class Goods {
	private String name;//��Ʒ��
	private double price;//�۸�
	private int fav;//�ղ���
	
	public Goods() {
	}
	//������

	public Goods(String name, double price, int fav) {
		super();
		this.name = name;
		this.price = price;
		this.fav = fav;
	}
	//set get����

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getFav() {
		return fav;
	}

	public void setFav(int fav) {
		this.fav = fav;
	}
	
	//��д�����ʽ����

	@Override
	public String toString() {
		
		return "��Ʒ����"+this.name+",�ղ�����"+this.fav+",�۸�"+this.price+"\n";
	}
	
	

}
