package Test01;
/*
 * PC类
*/
 class PC {
	CPU cpu;
	HardDisk HD;
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public void setHD(HardDisk hD) {
		HD = hD;
	}
	public void show(){
		System.out.println(cpu.speed);
		System.out.println(HD.account);
	}
//内部类 CPU
	public class CPU{
		int speed;

		public int getSpeed() {
			return speed;
		}

		public void setSpeed(int speed) {
			this.speed = speed;
		}
		
	}
	//内部类  HardDisk
	public class HardDisk{
		int account;

		public int getAccount() {
			return account;
		}

		public void setAccount(int account) {
			this.account = account;
		}
		
	}

}
 
//主类TestPc
public class TestPc {
	public static void main(String[] args) {
		PC pc=new PC();
		PC.CPU cpu=pc.new CPU();//新建内部类
		PC.HardDisk hd=pc.new HardDisk();//新建内部类
		cpu.setSpeed(2200);//调用内部类
		hd.setAccount(200);//调用内部类
		pc.setCpu(cpu);
		pc.setHD(hd);
		pc.show();
	
}
}

