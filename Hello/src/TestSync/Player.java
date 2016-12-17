package TestSync;

public class Player implements Runnable {
	private Movie m;
	
	public Player(Movie m) {
		super();
		this.m = m;
	}



	@Override
	public void run() {
		for(int i=0;i<10;i++){
			if(0==i%2){
				try {
					m.play("×óÇàÁú");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			else{
				try {
					m.play("ÓÒ°×»¢");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
