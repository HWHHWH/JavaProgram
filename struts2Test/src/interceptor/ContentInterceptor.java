package interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import actions.ContentAction;

//评论文字过滤器
public class ContentInterceptor extends AbstractInterceptor{
	@Override
	public String intercept(ActionInvocation arg) throws Exception {
		Object obj=arg.getAction();//获取action的实例
		if(null!=obj){
			if(obj instanceof ContentAction){
				ContentAction ca=(ContentAction)obj;//实例化ContentAction类
				String content=ca.getContent();//获得用户提交的评论信息
				int startIndex=content.indexOf("人");//检测字符出现的位置
				//截取从人字开始后的三个字符串
				String str=content.substring(startIndex, startIndex+3);
				//如果用户评论的内容包含需要过滤的文字
				if(str.equals("人品差")){
					//替换过滤字符
					System.out.println(str);
					content=content.replace("人品差", "*");
					//替换后的内容赋值给content的属性
					ca.setContent(content);
				}
				return arg.invoke();
			}else{
				return Action.LOGIN;
			}
		}
		return Action.LOGIN;
	}

}
