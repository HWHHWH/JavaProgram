package Test01;
/*
 * PC��
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
//�ڲ��� CPU
	public class CPU{
		int speed;

		public int getSpeed() {
			return speed;
		}

		public void setSpeed(int speed) {
			this.speed = speed;
		}
		
	}
	//�ڲ���  HardDisk
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
 
//����TestPc
public class TestPc {
	public static void main(String[] args) {
		PC pc=new PC();
		PC.CPU cpu=pc.new CPU();//�½��ڲ���
		PC.HardDisk hd=pc.new HardDisk();//�½��ڲ���
		cpu.setSpeed(2200);//�����ڲ���
		hd.setAccount(200);//�����ڲ���
		pc.setCpu(cpu);
		pc.setHD(hd);
		pc.show();
	
}
}

