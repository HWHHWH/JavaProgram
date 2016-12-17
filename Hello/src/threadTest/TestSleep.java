package threadTest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSleep {
	public static void main(String[] args) throws InterruptedException {
		//
		Date endTime=new Date(System.currentTimeMillis()+10000);
		long end=endTime.getTime();
		
		while(true){
			System.out.println(new SimpleDateFormat("mm:ss").format(endTime));
			endTime=new Date(endTime.getTime()-1000);
			Thread.sleep(1000);
			if(end-10000>endTime.getTime()){
				break;
			}
			
		}
	}

}
