package models;

import interfaceSet.Person2;

public class Japanese implements Person2{
	@Override
	public String sayHello(String name) {
		return name+",���";
	}
	@Override
	public String sayGoodBye(String name) {
		return name+"�ټ�";
	}
}
