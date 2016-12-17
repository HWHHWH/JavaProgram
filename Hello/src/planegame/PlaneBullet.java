package planegame;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

import window_util.GameUtil;

public class PlaneBullet extends GameObject {
	
	static int width;
	

	public void draw(Graphics g){
			super.draw(g);
			while(y>-this.height){
				y-=speed;
			}				
	}
	
	
	public PlaneBullet(double x,double y,int speed){
		this.x=x;
		this.y=y;
		this.img=GameUtil.getImage("planeimages/planebullet.png");
		
	}
	

}
