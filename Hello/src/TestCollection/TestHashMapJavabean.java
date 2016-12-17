package TestCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/*
 * ����Ҫ�����ж�key��value�ֱ��Ӧ��Ŀ�е���ЩԪ��
 * key һ��ָ
 * valueһ��ָ
 * key��value��ӳ���ϵ��keyֵ�����ظ���һ��keyֻ��Ӧһ��value��һ��value���Զ�Ӧ���key
 */
public class TestHashMapJavabean {
	public static void main(String[] args) {
		//��ʼ��
		String[] arr="this is a cat that is a mice".split(" ");
		
		//�ּ�洢������һ��map,key�����ʣ�value�������ࣨ���е��ʺ͵��ʸ����������ԣ�
		Map<String,Letter> map=new HashMap<String,Letter>();
		for(String key:arr){
			if(!map.containsKey(key)){        //���û�д���
				map.put(key, new Letter(key));//�½�һ�����ӣ������ࣩ��ͬʱ�ڽ��õ��ʷ�������			
			//�������
			}else{
				Letter value=map.get(key);     //��ȡ����  ����ȡ�����õ��ʵ���
				value.setCount(value.getCount()+1);//�����еĴ�����1
			}
		}
		//
		for(String key:map.keySet()){
			Letter value=map.get(key);//ͨ������ȡ��������[�Ѿ��洢�˵��ʺ͸���]
			System.out.println(key+"--->"+value.getCount());
		}		
	}

}
