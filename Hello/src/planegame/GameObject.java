package planegame;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
//�˶��常��
public class GameObject {
	Image img;
	double x,y;//��λ����
	int speed=10;
	int width,height;//ͼƬ����
	//������
	public void draw(Graphics g){
		g.drawImage(img, (int)x, (int)y,null);
	}
	//������
	 public Rectangle getRect(){
		return new Rectangle((int)x,(int)y,width,height);
	}
	
	//������
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
	//�չ�����
	public GameObject(){
		
	}

}
