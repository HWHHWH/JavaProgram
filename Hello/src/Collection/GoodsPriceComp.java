package Collection;
/*
 * java.util.Comparator
 * 
 * 实现comparator接口类：自定义排序
 */
public class GoodsPriceComp implements java.util.Comparator<Goods>{
	//重写compare方法，自定义排序，价格升序(降序加负号)
	@Override
	public int compare(Goods o1, Goods o2) {
		return (o1.getPrice()-o2.getPrice()>0?1:(o1.getPrice()==o2.getPrice()?0:-1));
	}
	

}
