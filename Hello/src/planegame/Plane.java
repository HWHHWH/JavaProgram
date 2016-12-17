package planegame;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

import window_util.Constant;
import window_util.GameUtil;

public class Plane extends GameObject {
	boolean left,right,up,down;//�������
	boolean startfire;
	boolean live=true;//�жϷɻ��Ƿ���
	PlaneBullet planebullet;
	

	public void draw(Graphics g){
		if(live){//����ɻ����Ż�����
			super.draw(g);//������
			move();
		}	
	}
	
	
	
	/*		
	}*/
	//get����
	public boolean isLive() {
		return live;
	}

	//set����
	public void setLive(boolean live) {
		this.live = live;
	}
	//����
	public void fire(KeyEvent e,Graphics g){
		if(e.getKeyCode()==KeyEvent.VK_SPACE){
			planebullet=new PlaneBullet(this.x+this.width-PlaneBullet.width,this.y, 10);
			planebullet.draw(g);
		}
		
	}

	//���¼��̷�������¼�
	public void addDirection(KeyEvent e) {
		switch(e.getKeyCode()){
		case KeyEvent.VK_LEFT:
			left=true;
			break;
		case KeyEvent.VK_RIGHT:
			right=true;
			break;
		case KeyEvent.VK_UP:
			up=true;
			break;
		case KeyEvent.VK_DOWN:
			down=true;
			break;
		default:
			break;
		}
	}

		//�ɿ����̷�������¼�
	public void minusDirection(KeyEvent e) {
		switch(e.getKeyCode()){
		case KeyEvent.VK_LEFT:
			left=false;
			break;
		case KeyEvent.VK_RIGHT:
			right=false;
			break;
		case KeyEvent.VK_UP:
			up=false;
			break;
		case KeyEvent.VK_DOWN:
			down=false;
			break;
		default:
			break;
		}
	}
		
	
	//�ɻ�������ƺ��˶�
	public void move(){
	    //if(x>=0&&x<=Constant.GAME_WIDTH-img.getWidth(null)&&y>=30&&y<=Constant.GAME_HEIGTH-img.getHeight(null)){
		if(left){
			x-=speed;
		}
		if(right){
			x+=speed;
		}
		if(up){
			y-=speed;
		}
		if(down){
			y+=speed;
		}
	   // }
	}
	//������
	public Plane(String imgpath, double x, double y) {
		this.img= GameUtil.getImage(imgpath);
		this.x = x;
		this.y = y;
		this.width=img.getWidth(null);
		this.height=img.getHeight(null);
	}
	//�չ�����
	public Plane(){
		
	}

}
