package planegame;

import java.awt.Graphics;

import window_util.Constant;
import window_util.GameUtil;


public class Bullet extends GameObject{

	double degreed;
	//�ӵ�����
	public void draw(Graphics g){
		super.draw(g);//���ӵ�
		//�ӵ��˶�
		x-=speed*Math.cos(degreed);
		y+=speed*Math.sin(degreed);
		//�ӵ�����
		if(y>Constant.GAME_HEIGTH-img.getHeight(null)||y<img.getHeight(null)){
			degreed=-degreed;
		}
		if(x>Constant.GAME_WIDTH-img.getWidth(null)||x<10){
			degreed=Math.PI-degreed;
		}
		
	}
	//�ӵ�������
	public Bullet(String imgpath){
		this.img=GameUtil.getImage(imgpath);
		this.x=Constant.GAME_WIDTH/2;
		this.y=Constant.GAME_HEIGTH/2;
		degreed=Math.random()*Math.PI*2;
		this.width=img.getWidth(null);
		this.height=img.getHeight(null);
	}
	
}
