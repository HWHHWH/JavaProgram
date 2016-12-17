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
	ArrayList bulletList=new ArrayList();//����װ�ӵ�
	
	
	public void paint(Graphics g){
		g.drawImage(bg, 0, 0, null);//�ű���ͼƬ
		plane.draw(g);//���÷ɻ�����
	
		//���ӵ�
		for(int i=0;i<bulletList.size();i++){
			Bullet bullet=(Bullet)bulletList.get(i);//���������ӵ�
			bullet.draw(g);
			//��ײ���
			boolean peng=bullet.getRect().intersects(plane.getRect());
			if(peng){
				System.out.println("peng!!!");
				plane.setLive(false);//�ɻ�����
				if(explode==null){
					explode=new Explode(plane.x,plane.y);
				}
				explode.draw(g);//��ըЧ��
			    System.out.println("die!!");
			    break;
			}

			
		}
		
	}
	
	//���̼��������ڲ������ʹ���ⲿ������
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
	//��дlanch����
	public void lanchFrame(){
		super.lanchFrame();
		addKeyListener(new KeyMonitor());
		
		//�����ӵ�
		for(int i=0;i<1;i++){
			Bullet bullet=new Bullet("planeimages/bullte.png");
			bulletList.add(bullet);//װ�ӵ�
		}
	}

	//������
	public static void main(String[] args) {
		new PlaneGameFrame().lanchFrame();
			
	}
	

}
