package aopTest;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class WelcomeUser implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		
	}

}
