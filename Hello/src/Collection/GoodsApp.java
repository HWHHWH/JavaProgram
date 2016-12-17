package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodsApp {
	public static void main(String[] args) {
		List<Goods> list=new ArrayList<Goods>();
		list.add(new Goods("老马视频", 100, 2000));
		list.add(new Goods("老高视频", 50, 500));
		list.add(new Goods("老裴视频", 0, 1000));
		
		System.out.println("排序前："+"\n"+list);
		
		//collections调用排序方法
		//Collections.sort(list,new GoodsPriceComp());//按价格升序
		Collections.sort(list,new GoodsFavComp());//按收藏量降序
		
		System.out.println("排序后："+"\n"+list);
	}

}
