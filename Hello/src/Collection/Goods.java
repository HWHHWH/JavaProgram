package Collection;
/*
 * 商品类，没有实现自定义排序接口
 */
public class Goods {
	private String name;//商品名
	private double price;//价格
	private int fav;//收藏量
	
	public Goods() {
	}
	//构造器

	public Goods(String name, double price, int fav) {
		super();
		this.name = name;
		this.price = price;
		this.fav = fav;
	}
	//set get方法

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
	
	//重写输出格式方法

	@Override
	public String toString() {
		
		return "商品名："+this.name+",收藏量："+this.fav+",价格："+this.price+"\n";
	}
	
	

}
