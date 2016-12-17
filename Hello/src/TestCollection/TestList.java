package TestCollection;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(123);
		list.add("shghsgjhsd");
		list.add("shghsgjhsd");
		list.add(new Date());
		list.add(123);
		list.add("shghsgjhsd");
		System.out.println(list.size());
		System.out.println();
		list.remove("shghsgjhsd");
		//list.set(0, 4567);  //HashMap  Set
		for(int i=0;i<list.size();i++){
			if(list.get(i)==(Integer)123){
				list.remove(i);
			}
		}
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
	}



	
	

}
