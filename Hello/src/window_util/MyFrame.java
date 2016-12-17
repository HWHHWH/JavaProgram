package window_util;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {
	/**
	 * 定义父类
	 */
	private static final long serialVersionUID = 1L;

	public void lanchFrame(){
		setSize(Constant.GAME_WIDTH,Constant.GAME_HEIGTH);     //设置窗口大小
		setLocation(Constant.LOCATION_X,Constant.LOCATION_Y);  //设置窗口位置
		setVisible(true);                                      //可视化，默认为非可视
		
		new PaintThread().start();
		
		//监听功能，用匿名内部类做窗口退出功能
		addWindowListener(new WindowAdapter(){                 //匿名内部类

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);//窗口退出
				super.windowClosing(e);
			}
			
			
		});
	}
	
	//动画的实现：定义一个重画线程类，内部类
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
	//双缓冲
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
