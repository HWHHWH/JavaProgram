package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodsApp {
	public static void main(String[] args) {
		List<Goods> list=new ArrayList<Goods>();
		list.add(new Goods("������Ƶ", 100, 2000));
		list.add(new Goods("�ϸ���Ƶ", 50, 500));
		list.add(new Goods("������Ƶ", 0, 1000));
		
		System.out.println("����ǰ��"+"\n"+list);
		
		//collections�������򷽷�
		//Collections.sort(list,new GoodsPriceComp());//���۸�����
		Collections.sort(list,new GoodsFavComp());//���ղ�������
		
		System.out.println("�����"+"\n"+list);
	}

}
