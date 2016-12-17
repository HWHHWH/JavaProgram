package planegame;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
//运动体父类
public class GameObject {
	Image img;
	double x,y;//定位坐标
	int speed=10;
	int width,height;//图片长宽
	//画自身
	public void draw(Graphics g){
		g.drawImage(img, (int)x, (int)y,null);
	}
	//画矩形
	 public Rectangle getRect(){
		return new Rectangle((int)x,(int)y,width,height);
	}
	
	//构造器
	public GameObject(Image img, double x, double y, int speed, int width,
			int height) {
		super();
		this.img = img;
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.width = width;
		this.height = height;
	}
	//空构造器
	public GameObject(){
		
	}

}
