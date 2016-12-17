package Collection;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

//模拟斗地主随机发牌加底牌---洗牌(Collections的随机排序)

public class CollectionsTest {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		 //构造54张牌
		for(int i=0;i<54;i++){
			list.add(i);
		}
		//洗牌(随机序列)
		Collections.shuffle(list);
		//System.out.println(list);

		//发牌
		List<Integer> P1=new ArrayList<Integer>();
		List<Integer> P2=new ArrayList<Integer>();
		List<Integer> P3=new ArrayList<Integer>();
		List<Integer> last=new ArrayList<Integer>();
		
		for(int i=0;i<51;i+=3){
			P1.add(list.get(i));
			P2.add(list.get(i+1));
			P3.add(list.get(i+2));
		}
		//底牌
		last.add(list.get(51));
		last.add(list.get(52));
		last.add(list.get(53));
		
		//打印
		System.out.println("第一个人的牌："+P1);
		System.out.println("第二个人的牌："+P2);
		System.out.println("第三个人的牌："+P3);
		System.out.println("底牌："+last);
		
	}
	

}
