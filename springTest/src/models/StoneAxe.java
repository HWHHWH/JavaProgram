package models;

import interfaceSet.Axe;

public class StoneAxe implements Axe{
	//空构造器
	public StoneAxe() {
	}
	@Override
	public String chop() {
		return"砍得好慢";
	}
}
