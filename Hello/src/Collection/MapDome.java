package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 题目：
 * 定义一个Student类，包含姓名，班号，成绩
 * 将Student 类放入list中，统计每个班级的总分和平均分
 * 
 * Map<key,value>  key 代表班号，value代表学生列表List<Student>----【classroom】
 * 
 * 面向对象+分拣存储
 * 
 * 关键是如何针对题目构建单元类，并分别对key和value赋予含义
 */
public class MapDome {
	//主方法
	public static void main(String[] args) {
		//初始化学生成绩列表
		List<Student> list=exam();
		Map<String,ClassRoom> map=count(list);
		//打印出map中的元素
		//遍历key
		for(String key:map.keySet()){
			ClassRoom value=map.get(key);//获取value值
			System.out.println(key+" 班级共"+value.getStuList().size()+"个人   "+"总分是"+value.getTotal()+"   平均分是"+value.getAvg());
		}
		
	}
	//统计分析方法---Map方法带参数
	public static Map<String,ClassRoom> count(List<Student> list){
		Map<String,ClassRoom> map=new HashMap<String,ClassRoom>();
		//遍历list
		for(Student stu:list){
			//分拣查看是否存在该编号的班级
			//如果不存在班级号，创建班级
			if(!map.containsKey(stu.getNo())){
				map.put(stu.getNo(), new ClassRoom(stu));
			}
			//如果存在班级号，放入学生
			else{
				ClassRoom classroom=map.get(stu.getNo());//获取该班级
				classroom.getStuList().add(stu);//将学生添加到班级列表中
				classroom.setTotal(classroom.getTotal()+stu.getScore());//计算班级总分
				classroom.setAvg(classroom.getTotal()/classroom.getStuList().size());//计算平均分
			}
		
		}
		return map ;
	}
	
	//初始化数据方法，将数据放到list中
	public static List<Student> exam(){
		List<Student> list=new ArrayList<Student>();
		list.add(new Student("张三","a",80));
		list.add(new Student("李四","a",50));
		list.add(new Student("王五","a",90));
		list.add(new Student("周六","b",60));
		list.add(new Student("小七","b",70));
		return list;
	}
	
}
