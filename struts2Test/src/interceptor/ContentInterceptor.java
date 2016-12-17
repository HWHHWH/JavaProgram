package interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import actions.ContentAction;

//�������ֹ�����
public class ContentInterceptor extends AbstractInterceptor{
	@Override
	public String intercept(ActionInvocation arg) throws Exception {
		Object obj=arg.getAction();//��ȡaction��ʵ��
		if(null!=obj){
			if(obj instanceof ContentAction){
				ContentAction ca=(ContentAction)obj;//ʵ����ContentAction��
				String content=ca.getContent();//����û��ύ��������Ϣ
				int startIndex=content.indexOf("��");//����ַ����ֵ�λ��
				//��ȡ�����ֿ�ʼ��������ַ���
				String str=content.substring(startIndex, startIndex+3);
				//����û����۵����ݰ�����Ҫ���˵�����
				if(str.equals("��Ʒ��")){
					//�滻�����ַ�
					System.out.println(str);
					content=content.replace("��Ʒ��", "*");
					//�滻������ݸ�ֵ��content������
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