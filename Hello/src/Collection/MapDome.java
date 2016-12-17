package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * ��Ŀ��
 * ����һ��Student�࣬������������ţ��ɼ�
 * ��Student �����list�У�ͳ��ÿ���༶���ֺܷ�ƽ����
 * 
 * Map<key,value>  key �����ţ�value����ѧ���б�List<Student>----��classroom��
 * 
 * �������+�ּ�洢
 * 
 * �ؼ�����������Ŀ������Ԫ�࣬���ֱ��key��value���躬��
 */
public class MapDome {
	//������
	public static void main(String[] args) {
		//��ʼ��ѧ���ɼ��б�
		List<Student> list=exam();
		Map<String,ClassRoom> map=count(list);
		//��ӡ��map�е�Ԫ��
		//����key
		for(String key:map.keySet()){
			ClassRoom value=map.get(key);//��ȡvalueֵ
			System.out.println(key+" �༶��"+value.getStuList().size()+"����   "+"�ܷ���"+value.getTotal()+"   ƽ������"+value.getAvg());
		}
		
	}
	//ͳ�Ʒ�������---Map����������
	public static Map<String,ClassRoom> count(List<Student> list){
		Map<String,ClassRoom> map=new HashMap<String,ClassRoom>();
		//����list
		for(Student stu:list){
			//�ּ�鿴�Ƿ���ڸñ�ŵİ༶
			//��������ڰ༶�ţ������༶
			if(!map.containsKey(stu.getNo())){
				map.put(stu.getNo(), new ClassRoom(stu));
			}
			//������ڰ༶�ţ�����ѧ��
			else{
				ClassRoom classroom=map.get(stu.getNo());//��ȡ�ð༶
				classroom.getStuList().add(stu);//��ѧ����ӵ��༶�б���
				classroom.setTotal(classroom.getTotal()+stu.getScore());//����༶�ܷ�
				classroom.setAvg(classroom.getTotal()/classroom.getStuList().size());//����ƽ����
			}
		
		}
		return map ;
	}
	
	//��ʼ�����ݷ����������ݷŵ�list��
	public static List<Student> exam(){
		List<Student> list=new ArrayList<Student>();
		list.add(new Student("����","a",80));
		list.add(new Student("����","a",50));
		list.add(new Student("����","a",90));
		list.add(new Student("����","b",60));
		list.add(new Student("С��","b",70));
		return list;
	}
	
}
