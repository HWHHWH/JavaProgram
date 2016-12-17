package interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

//�Զ����¼������LoginInterceptor
public class LoginInterceptor extends MethodFilterInterceptor{
	@Override
	public String doIntercept(ActionInvocation arg) throws Exception {
		//��ȡsession����
		Map session=arg.getInvocationContext().getSession();
		//��ȡsession�����е�username���󣬲���ֵ��uname����
		String uname=(String)session.get("username");
		//���uname��ֵ�������Ϊnull�򡰡�������к�������
		if(null!=uname&&!uname.equals("")){
			return arg.invoke();
		}
		else{
			session.put("errorMsg", "����δ��¼�����¼��");
			return Action.LOGIN;
		}
	}

}
