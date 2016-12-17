package solar;

import java.awt.Graphics;
import java.awt.Image;

import window_util.Constant;
import window_util.GameUtil;
import window_util.MyFrame;

//太阳系的主窗口
public class SolarFrame extends MyFrame{
	Image bg=GameUtil.getImage("images/bg.jpg");
	Sun sun=new Sun("images/sun.jpg",Constant.GAME_WIDTH/2-30,Constant.GAME_HEIGTH/2-30);
	Planet earth = new Planet(sun,"images/earth.jpg",250,130,0.04);
	Planet moon= new Planet(earth,"images/moon.jpg",50,30,0.1,true);
	public void paint(Graphics g){
		g.drawImage(bg, 0,0, null);
		sun.draw(g);
		earth.draw(g);
		moon.draw(g);
	}
	public static void main(String[] args) {
		new SolarFrame().lanchFrame();
	}

}
