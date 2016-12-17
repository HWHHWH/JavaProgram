package Collection;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * java.lang.Comparable
 * 
 * ������
 * ���ű��⣬���ŵ���ʣ����ŷ���ʱ��
 * ҵ���������ʱ�䵹�򣬵�������򣬱��⵹��
 * ����ҵ�������д�����compare to ����
 * @author HWH
 *
 */

public class News implements java.lang.Comparable<News>{//ʵ��comparable�ӿ�
	private String title;//���ű���
	private int hits;//���ŵ����
	private Date pubTime;//���ŷ���ʱ��
	//�޲ι�����
	public News() {
		
	}
	//���ι�����
	public News(String title, int hits, Date pubTime) {
		super();
		this.title = title;
		this.hits = hits;
		this.pubTime = pubTime;
	}
	//set get����
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public Date getPubTime() {
		return pubTime;
	}
	public void setPubTime(Date pubTime) {
		this.pubTime = pubTime;
	}
	
	@Override
	//��дcompare to����
	//ҵ���������ʱ�䵹�򣬵�������򣬱��⽵��
	//compare to ����ֵ 0��-1�����򡿣�1������
	public int compareTo(News o) {
		int result;
		result=-this.pubTime.compareTo(o.pubTime);//����
		if(0==result){
			result=-(this.hits-o.hits);//����
			if(0==result){
				result=-this.title.compareTo(o.title);//����
			}
		}		
		return result;
	}
	//��д�����ʽ����
	@Override
	public String toString() {
		StringBuffer sb=new StringBuffer();
		sb.append("���⣺").append(this.title);
		sb.append("  ʱ�䣺").append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.pubTime));
		sb.append("  �������").append(this.hits).append("\n");
		return sb.toString();
	}
	
}
