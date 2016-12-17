package interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

//自定义登录拦截器LoginInterceptor
public class LoginInterceptor extends MethodFilterInterceptor{
	@Override
	public String doIntercept(ActionInvocation arg) throws Exception {
		//获取session对象
		Map session=arg.getInvocationContext().getSession();
		//获取session对象中的username对象，并赋值给uname对象
		String uname=(String)session.get("username");
		//检测uname的值，如果不为null或“”，则进行后续操作
		if(null!=uname&&!uname.equals("")){
			return arg.invoke();
		}
		else{
			session.put("errorMsg", "您还未登录，请登录！");
			return Action.LOGIN;
		}
	}

}
