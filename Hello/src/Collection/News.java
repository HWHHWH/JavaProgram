package Collection;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * java.lang.Comparable
 * 
 * 新闻类
 * 新闻标题，新闻点击率，新闻发布时间
 * 业务排序规则：时间倒序，点击率升序，标题倒序
 * 依据业务规则重写该类的compare to 方法
 * @author HWH
 *
 */

public class News implements java.lang.Comparable<News>{//实现comparable接口
	private String title;//新闻标题
	private int hits;//新闻点击率
	private Date pubTime;//新闻发布时间
	//无参构造器
	public News() {
		
	}
	//带参构造器
	public News(String title, int hits, Date pubTime) {
		super();
		this.title = title;
		this.hits = hits;
		this.pubTime = pubTime;
	}
	//set get方法
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
	//重写compare to方法
	//业务排序规则：时间倒序，点击率升序，标题降序
	//compare to 返回值 0，-1【降序】，1【升序】
	public int compareTo(News o) {
		int result;
		result=-this.pubTime.compareTo(o.pubTime);//降序
		if(0==result){
			result=-(this.hits-o.hits);//降序
			if(0==result){
				result=-this.title.compareTo(o.title);//降序
			}
		}		
		return result;
	}
	//重写输出格式方法
	@Override
	public String toString() {
		StringBuffer sb=new StringBuffer();
		sb.append("标题：").append(this.title);
		sb.append("  时间：").append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.pubTime));
		sb.append("  点击量：").append(this.hits).append("\n");
		return sb.toString();
	}
	
}
