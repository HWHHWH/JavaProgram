package planegame;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

import window_util.Constant;
import window_util.GameUtil;

public class Plane extends GameObject {
	boolean left,right,up,down;//方向变量
	boolean startfire;
	boolean live=true;//判断飞机是否死
	PlaneBullet planebullet;
	

	public void draw(Graphics g){
		if(live){//如果飞机活着画自身
			super.draw(g);//画自身
			move();
		}	
	}
	
	
	
	/*		
	}*/
	//get方法
	public boolean isLive() {
		return live;
	}

	//set方法
	public void setLive(boolean live) {
		this.live = live;
	}
	//开火
	public void fire(KeyEvent e,Graphics g){
		if(e.getKeyCode()==KeyEvent.VK_SPACE){
			planebullet=new PlaneBullet(this.x+this.width-PlaneBullet.width,this.y, 10);
			planebullet.draw(g);
		}
		
	}

	//按下键盘方向键的事件
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

		//松开键盘方向键的事件
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
		
	
	//飞机方向控制和运动
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
	//构造器
	public Plane(String imgpath, double x, double y) {
		this.img= GameUtil.getImage(imgpath);
		this.x = x;
		this.y = y;
		this.width=img.getWidth(null);
		this.height=img.getHeight(null);
	}
	//空构造器
	public Plane(){
		
	}

}
