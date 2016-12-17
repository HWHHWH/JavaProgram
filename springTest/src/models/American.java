package models;

import interfaceSet.Person2;

public class American implements Person2{
	
	public String sayHello(String name) {
		return name+",hello";
	}
	
	public String sayGoodBye(String name) {
		return name+",GoodBye";
	}

}
