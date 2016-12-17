package springMVC;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

//�ද��������
public class UserMultiActionController extends MultiActionController{
	//ʵ���û���¼��ʾ
	public ModelAndView showUser(HttpServletRequest request,HttpServletResponse response){
		Map<String, String> model=new HashMap<String,String>();
		model.put("success", "�ɹ�");
		return new ModelAndView("list", "model", model);
	}
	//ʵ���û���ɾ��
	public ModelAndView delUser(HttpServletRequest request,HttpServletResponse response){
		Map<String, String> model=new HashMap<String,String>();
		model.put("success", "ɾ���û��ɹ�");
		return new ModelAndView("del","model", model);
	}
}
