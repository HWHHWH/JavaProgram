package solar;

import java.awt.Color;
import java.awt.Graphics;
import window_util.GameUtil;

public class Planet extends Sun {
	double longAxis,shortAxis;//椭圆的长轴和短轴
	double degree; 
	double speed; //旋转速度
	Sun center;//旋转的中心
	boolean satellite;//是否是卫星，默认不是
	//行星运行
	public void draw(Graphics g){
		
		super.draw(g);//画自身
		move(g);
		if(!satellite){
			drawOrbit(g);
		}
		
		
	}
	//画轨道
	public void drawOrbit(Graphics g){
		double ovalWidth=2*longAxis;
		double ovalHeigth=2*shortAxis;
		double ovalX=center.x+center.width/2-longAxis;
		double ovalY=center.y+center.heigth/2-shortAxis;
		g.setColor(Color.blue);
		g.drawOval((int)(ovalX),(int)(ovalY),(int)(ovalWidth),(int)(ovalHeigth));
	
	}
	
	//行星旋转
	public void move(Graphics g){
		//行星运行
		x=(center.x+center.width/2)+longAxis*Math.cos(degree);
		y=(center.y+center.heigth/2)+shortAxis*Math.sin(degree);
		degree +=speed;//行星运行速度
	}
	
	//构造器初始化
	public Planet(Sun center,String imgpath,double longAxis, double shortAxis,
			double speed) {
		super(GameUtil.getImage(imgpath));//调用父类的构造器
		
		//起始坐标赋值
		this.x = center.x+longAxis-3*center.width;
		this.y = center.y-100*center.heigth;
		//基本量赋值
		this.longAxis=longAxis;
		this.shortAxis=shortAxis;
		this.speed = speed;
		this.center = center;
	}
	//卫星构造器2
	public Planet(Sun center,String imgpath,double longAxis, double shortAxis,
			double speed,boolean satellite) {
		this(center, imgpath, longAxis, shortAxis, speed);
		this.satellite=satellite;
		
	}

}
