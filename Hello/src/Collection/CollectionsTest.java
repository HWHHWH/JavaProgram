package Collection;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

//ģ�⶷����������Ƽӵ���---ϴ��(Collections���������)

public class CollectionsTest {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		 //����54����
		for(int i=0;i<54;i++){
			list.add(i);
		}
		//ϴ��(�������)
		Collections.shuffle(list);
		//System.out.println(list);

		//����
		List<Integer> P1=new ArrayList<Integer>();
		List<Integer> P2=new ArrayList<Integer>();
		List<Integer> P3=new ArrayList<Integer>();
		List<Integer> last=new ArrayList<Integer>();
		
		for(int i=0;i<51;i+=3){
			P1.add(list.get(i));
			P2.add(list.get(i+1));
			P3.add(list.get(i+2));
		}
		//����
		last.add(list.get(51));
		last.add(list.get(52));
		last.add(list.get(53));
		
		//��ӡ
		System.out.println("��һ���˵��ƣ�"+P1);
		System.out.println("�ڶ����˵��ƣ�"+P2);
		System.out.println("�������˵��ƣ�"+P3);
		System.out.println("���ƣ�"+last);
		
	}
	

}
