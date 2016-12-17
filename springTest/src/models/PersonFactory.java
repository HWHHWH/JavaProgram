package models;

import interfaceSet.Person2;

//工厂类
public class PersonFactory {
	public Person2 getPerson(String ethnic){//获取具体产品角色实例
		if(ethnic.equalsIgnoreCase("japan")){//根据参数返回person接口的实例
			return new Japanese();//返回chinese实例
		}else{
			return new American();//返回american实例
		}
	}

}
