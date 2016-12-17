package springMVC;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import models.LoginMessage;

public class RegController extends SimpleFormController{
	public RegController() {
		setCommandClass(LoginMessage.class);
	}
	
	@Override
	protected ModelAndView onSubmit(Object command) throws Exception {
		LoginMessage user=(LoginMessage)command;
		return new ModelAndView(this.getSuccessView(), "user", user);
	}

}
