package Collection;
/*
 * 自定义排序接口
 * 排序规则：按收藏量降序
 */
public class GoodsFavComp implements java.util.Comparator<Goods>{

	@Override
	public int compare(Goods o1, Goods o2) {
		return -(o1.getFav()-o2.getFav());
	}
	

}
