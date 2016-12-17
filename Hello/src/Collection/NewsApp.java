package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class NewsApp {
	
	public static void main(String[] args) {
		List<News> NewList=new ArrayList<News>();
		NewList.add(new News("美国后怕了，逃跑了悲剧了",50,new Date(System.currentTimeMillis()-1000*60*60)));
		NewList.add(new News("中国人登上钓鱼岛了，全国欢呼了",100,new Date()));		
		NewList.add(new News("小日本终于听话了",60,new Date(System.currentTimeMillis()-1000*60*60)));
		
		System.out.println("排序前："+"\n"+NewList);
		//调用排序方法----重写的compare to 方法
		Collections.sort(NewList);
		
		System.out.println();
		System.out.println("排序后："+"\n"+NewList);
		
	}

}
