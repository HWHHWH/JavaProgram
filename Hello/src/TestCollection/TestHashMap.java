package TestCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
	public static void main(String[] args) {
		//初始化
		String[] arr="this is a cat that is a mice".split(" ");
		
		//分类存储，创建一个map为key和value贴上固定标签：key代表单词【string类型】，value代表个数【integer类型】
		Map<String,Integer> map=new HashMap<String,Integer>();
		//增强for循环
		for(String key:arr){
			//如果不存在，放入key和value
			if(!map.containsKey(key)){
				map.put(key, 1);
			//如果存在，放入key,value+1
			}else{
				map.put(key, map.get(key)+1);
			}
		}
		//输出全部键值对
		//将键放入一个集合
		Set<String> set=map.keySet();
		//创建该集合的迭代器
		Iterator iter=set.iterator();
		//使用迭代器
		while(iter.hasNext()){
			//取出key
			String key=(String) iter.next();
			//通过key取出value
			Integer value=map.get(key);
			//打印key 和value
			System.out.println(key+"-->"+value);
			
		}
	
	}

}
