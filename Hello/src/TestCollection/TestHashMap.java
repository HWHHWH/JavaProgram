package TestCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
	public static void main(String[] args) {
		//��ʼ��
		String[] arr="this is a cat that is a mice".split(" ");
		
		//����洢������һ��mapΪkey��value���Ϲ̶���ǩ��key�����ʡ�string���͡���value���������integer���͡�
		Map<String,Integer> map=new HashMap<String,Integer>();
		//��ǿforѭ��
		for(String key:arr){
			//��������ڣ�����key��value
			if(!map.containsKey(key)){
				map.put(key, 1);
			//������ڣ�����key,value+1
			}else{
				map.put(key, map.get(key)+1);
			}
		}
		//���ȫ����ֵ��
		//��������һ������
		Set<String> set=map.keySet();
		//�����ü��ϵĵ�����
		Iterator iter=set.iterator();
		//ʹ�õ�����
		while(iter.hasNext()){
			//ȡ��key
			String key=(String) iter.next();
			//ͨ��keyȡ��value
			Integer value=map.get(key);
			//��ӡkey ��value
			System.out.println(key+"-->"+value);
			
		}
	
	}

}
