package springMVC;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

//多动作控制器
public class UserMultiActionController extends MultiActionController{
	//实现用户登录显示
	public ModelAndView showUser(HttpServletRequest request,HttpServletResponse response){
		Map<String, String> model=new HashMap<String,String>();
		model.put("success", "成功");
		return new ModelAndView("list", "model", model);
	}
	//实现用户的删除
	public ModelAndView delUser(HttpServletRequest request,HttpServletResponse response){
		Map<String, String> model=new HashMap<String,String>();
		model.put("success", "删除用户成功");
		return new ModelAndView("del","model", model);
	}
}
