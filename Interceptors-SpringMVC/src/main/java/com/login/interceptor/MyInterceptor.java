package com.login.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterceptor extends HandlerInterceptorAdapter{
public boolean preHandler(HttpServletRequest request,HttpServletResponse response,Object handler)throws Exception{
	System.out.println("MyInterceptor.preHandler()");
	
	//return super.preHandle(request, response, handler);
	return true;
	
}

public boolean postHandler(HttpServletRequest request,HttpServletResponse response,Object handler)throws Exception{
	System.out.println("MyInterceptor.postHandler()");
	
	//return super.preHandle(request, response, handler);
	return true;
	
}

}
