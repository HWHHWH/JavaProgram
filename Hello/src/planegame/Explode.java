package planegame;

import java.awt.Graphics;
import java.awt.Image;

import window_util.GameUtil;

public class Explode {
	double x,y;//����
	Image[] img=new Image[23];
	int count;
	//�ӵ���ը
	public void draw(Graphics g){
		if(count<=22){
			g.drawImage(img[count], (int)x, (int)y, null);
			count++;
		}	
	}
	//�ӵ��Ĺ��췽��
	public Explode(double x, double y) {
		this.x = x;
		this.y = y;
		for(int i=1;i<=22;i++){
			this.img[i] =GameUtil.getImage("explodeimages/13-"+i+".png");
			img[i].getWidth(null);
		}
		
	}
	

}
