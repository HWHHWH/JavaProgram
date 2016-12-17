package solar;

import java.awt.Graphics;
import java.awt.Image;

import window_util.GameUtil;

//太阳

public class Sun {
	Image img;
	double x,y;
	double width,heigth;//图片的长宽
	//画自身
	public void draw(Graphics g){
		g.drawImage(img, (int)x, (int)y, null);
	}
	//构造器
	//空构造器
	public Sun(){
		
	}
	//构造器1
	public Sun(Image img){
		this.img=img;
		this.width=img.getWidth(null);
		this.heigth=img.getHeight(null);
		
	}
	//构造器2
	public Sun(Image img,double x,double y){
		this(img);//调用构造器1
		this.x=x;
		this.y=y;
	}
	//带路径构造器
	public Sun(String imgpath,double x,double y){
		this(GameUtil.getImage(imgpath),x,y);//调用构造器2
		
	}

}
