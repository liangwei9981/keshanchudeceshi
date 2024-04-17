package com.liangwei.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//@Aspect
//@Component
public class ZhouyuAspect {

	@Pointcut("execution(public void com.liangwei.service.UserService.test())")
	public void a(){

	}

	@Before("a()")
	public void zhouyuBefore(JoinPoint joinPoint) {
		System.out.println("zhouyuBefore");
	}


}
