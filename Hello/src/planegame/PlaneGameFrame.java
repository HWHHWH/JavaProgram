package planegame;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import window_util.GameUtil;
import window_util.MyFrame;

public class PlaneGameFrame extends MyFrame{
	Graphics g ;
	Image bg=GameUtil.getImage("planeimages/bg.jpg");
	
	Plane plane=new Plane("planeimages/plane.png",250,500);
	
	Explode explode;
	ArrayList bulletList=new ArrayList();//容器装子弹
	
	
	public void paint(Graphics g){
		g.drawImage(bg, 0, 0, null);//放背景图片
		plane.draw(g);//调用飞机方法
	
		//画子弹
		for(int i=0;i<bulletList.size();i++){
			Bullet bullet=(Bullet)bulletList.get(i);//从容器拿子弹
			bullet.draw(g);
			//碰撞检测
			boolean peng=bullet.getRect().intersects(plane.getRect());
			if(peng){
				System.out.println("peng!!!");
				plane.setLive(false);//飞机死亡
				if(explode==null){
					explode=new Explode(plane.x,plane.y);
				}
				explode.draw(g);//爆炸效果
			    System.out.println("die!!");
			    break;
			}

			
		}
		
	}
	
	//键盘监听器，内部类可以使用外部类属性
	class KeyMonitor extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			plane.addDirection(e);
			
			plane.fire(e,g);
	
		}

		@Override
		public void keyReleased(KeyEvent e) {
			plane.minusDirection(e);
		}
		
	}
	//重写lanch方法
	public void lanchFrame(){
		super.lanchFrame();
		addKeyListener(new KeyMonitor());
		
		//生成子弹
		for(int i=0;i<1;i++){
			Bullet bullet=new Bullet("planeimages/bullte.png");
			bulletList.add(bullet);//装子弹
		}
	}

	//主方法
	public static void main(String[] args) {
		new PlaneGameFrame().lanchFrame();
			
	}
	

}
