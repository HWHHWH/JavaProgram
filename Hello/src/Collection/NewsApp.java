package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class NewsApp {
	
	public static void main(String[] args) {
		List<News> NewList=new ArrayList<News>();
		NewList.add(new News("���������ˣ������˱�����",50,new Date(System.currentTimeMillis()-1000*60*60)));
		NewList.add(new News("�й��˵��ϵ��㵺�ˣ�ȫ��������",100,new Date()));		
		NewList.add(new News("С�ձ�����������",60,new Date(System.currentTimeMillis()-1000*60*60)));
		
		System.out.println("����ǰ��"+"\n"+NewList);
		//�������򷽷�----��д��compare to ����
		Collections.sort(NewList);
		
		System.out.println();
		System.out.println("�����"+"\n"+NewList);
		
	}

}
