package solar;

import java.awt.Graphics;
import java.awt.Image;

import window_util.GameUtil;

//̫��

public class Sun {
	Image img;
	double x,y;
	double width,heigth;//ͼƬ�ĳ���
	//������
	public void draw(Graphics g){
		g.drawImage(img, (int)x, (int)y, null);
	}
	//������
	//�չ�����
	public Sun(){
		
	}
	//������1
	public Sun(Image img){
		this.img=img;
		this.width=img.getWidth(null);
		this.heigth=img.getHeight(null);
		
	}
	//������2
	public Sun(Image img,double x,double y){
		this(img);//���ù�����1
		this.x=x;
		this.y=y;
	}
	//��·��������
	public Sun(String imgpath,double x,double y){
		this(GameUtil.getImage(imgpath),x,y);//���ù�����2
		
	}

}
