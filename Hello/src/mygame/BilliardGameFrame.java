package mygame;

//import java.awt.Color;
//import java.awt.Font;

import java.awt.Graphics;
import java.awt.Image;

import window_util.Constant;
import window_util.GameUtil;
import window_util.MyFrame;



public class BilliardGameFrame extends MyFrame{
	
	/**
	 * Ì¨Çò·´µ¯ÓÎÏ·
	 */
	private static final long serialVersionUID = 1L;
	Image bg=GameUtil.getImage("images/bg.jpg");
	Image img=GameUtil.getImage("images/pig.jpg");
	
	private double x=100,y=100;
	private double degree=2*Math.PI*Math.random();//·¶Î§[0,2pi]
	private int speed=60;
	@Override
	public void paint(Graphics g) {
		/*
		 * »­Í¼Á·Ï°
		g.drawLine(50, 50, 150, 150);
		g.drawLine(150, 150,250, 50);
		g.drawOval(50, 50, 200, 200);
		g.drawRect(50, 50,200, 200);
		Font f=new Font("ËÎÌå",Font.BOLD,15);
		g.setFont(f);
		g.drawString("»­Í¼", 140, 45);
		g.setColor(Color.red);
		g.fillOval(100, 100, 20, 20);
		*/
		
		//¼ÓÔØÍ¼Æ¬
		g.drawImage(img, (int)x,(int)y,null);
		x+=speed*Math.cos(degree);
		y+=speed*Math.sin(degree);
		if (speed>0){
			speed-=0.0001;
		}
		else {
			speed=0;
		}
		if(y>Constant.GAME_HEIGTH-30||y<30){
			degree=-degree;
		}
		if(x>Constant.GAME_WIDTH-30||x<10){
			degree=Math.PI-degree;
		}
	}
	
	public static void main(String[] args) {
		BilliardGameFrame gf=new BilliardGameFrame();
		gf.lanchFrame();
	}

}
