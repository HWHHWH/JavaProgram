package solar;

import java.awt.Color;
import java.awt.Graphics;
import window_util.GameUtil;

public class Planet extends Sun {
	double longAxis,shortAxis;//��Բ�ĳ���Ͷ���
	double degree; 
	double speed; //��ת�ٶ�
	Sun center;//��ת������
	boolean satellite;//�Ƿ������ǣ�Ĭ�ϲ���
	//��������
	public void draw(Graphics g){
		
		super.draw(g);//������
		move(g);
		if(!satellite){
			drawOrbit(g);
		}
		
		
	}
	//�����
	public void drawOrbit(Graphics g){
		double ovalWidth=2*longAxis;
		double ovalHeigth=2*shortAxis;
		double ovalX=center.x+center.width/2-longAxis;
		double ovalY=center.y+center.heigth/2-shortAxis;
		g.setColor(Color.blue);
		g.drawOval((int)(ovalX),(int)(ovalY),(int)(ovalWidth),(int)(ovalHeigth));
	
	}
	
	//������ת
	public void move(Graphics g){
		//��������
		x=(center.x+center.width/2)+longAxis*Math.cos(degree);
		y=(center.y+center.heigth/2)+shortAxis*Math.sin(degree);
		degree +=speed;//���������ٶ�
	}
	
	//��������ʼ��
	public Planet(Sun center,String imgpath,double longAxis, double shortAxis,
			double speed) {
		super(GameUtil.getImage(imgpath));//���ø���Ĺ�����
		
		//��ʼ���긳ֵ
		this.x = center.x+longAxis-3*center.width;
		this.y = center.y-100*center.heigth;
		//��������ֵ
		this.longAxis=longAxis;
		this.shortAxis=shortAxis;
		this.speed = speed;
		this.center = center;
	}
	//���ǹ�����2
	public Planet(Sun center,String imgpath,double longAxis, double shortAxis,
			double speed,boolean satellite) {
		this(center, imgpath, longAxis, shortAxis, speed);
		this.satellite=satellite;
		
	}

}
