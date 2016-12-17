package mygame;

import java.awt.Graphics;
import java.awt.Image;

import window_util.Constant;
import window_util.GameUtil;
import window_util.MyFrame;


public class GameFrame2 extends MyFrame{
	
	/**
	 * Õ÷‘≤πÏº£
	 */
	private static final long serialVersionUID = 1L;

	Image img=GameUtil.getImage("images/pig.jpg");
	
	private double x=100,y=100;
	private double degree=2*Math.PI*Math.random();//∑∂Œß[0,2pi]
	
	@Override
	public void paint(Graphics g) {
		
		//º”‘ÿÕº∆¨
		g.drawImage(img, (int)x,(int)y,null);
		x=Constant.GAME_WIDTH/3+Constant.GAME_WIDTH/4*Math.cos(degree);
		y=Constant.GAME_HEIGTH/3+Constant.GAME_WIDTH/4*Math.sin(degree);
		degree +=0.1;
		
	}
	
	public static void main(String[] args) {
		GameFrame2 gf=new GameFrame2();
		gf.lanchFrame();
	}

}
