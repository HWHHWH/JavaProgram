package TestCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/*
 * 最重要的是判断key和value分别对应题目中的哪些元素
 * key 一般指
 * value一般指
 * key与value是映射关系，key值不能重复，一个key只对应一个value，一个value可以对应多个key
 */
public class TestHashMapJavabean {
	public static void main(String[] args) {
		//初始化
		String[] arr="this is a cat that is a mice".split(" ");
		
		//分拣存储，创建一个map,key代表单词，value代表单词类（含有单词和单词个数两个属性）
		Map<String,Letter> map=new HashMap<String,Letter>();
		for(String key:arr){
			if(!map.containsKey(key)){        //如果没有袋子
				map.put(key, new Letter(key));//新建一个袋子（单词类），同时在将该单词放入类中			
			//如果存在
			}else{
				Letter value=map.get(key);     //获取袋子  ，获取包含该单词的类
				value.setCount(value.getCount()+1);//将类中的次数加1
			}
		}
		//
		for(String key:map.keySet()){
			Letter value=map.get(key);//通过单词取出单词类[已经存储了单词和个数]
			System.out.println(key+"--->"+value.getCount());
		}		
	}

}
