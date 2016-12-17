package window_util;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {
	/**
	 * ���常��
	 */
	private static final long serialVersionUID = 1L;

	public void lanchFrame(){
		setSize(Constant.GAME_WIDTH,Constant.GAME_HEIGTH);     //���ô��ڴ�С
		setLocation(Constant.LOCATION_X,Constant.LOCATION_Y);  //���ô���λ��
		setVisible(true);                                      //���ӻ���Ĭ��Ϊ�ǿ���
		
		new PaintThread().start();
		
		//�������ܣ��������ڲ����������˳�����
		addWindowListener(new WindowAdapter(){                 //�����ڲ���

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);//�����˳�
				super.windowClosing(e);
			}
			
			
		});
	}
	
	//������ʵ�֣�����һ���ػ��߳��࣬�ڲ���
	class PaintThread extends Thread{
		public void run(){
			while (true){
				repaint();
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	//˫����
	private Image offScreenImage=null;
	public void update(Graphics g){
		if(offScreenImage==null){
			offScreenImage=this.createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGTH);
		}
		Graphics goff=offScreenImage.getGraphics();
		paint(goff);
		g.drawImage(offScreenImage, 0, 0, null);
		
	}
	  
}
