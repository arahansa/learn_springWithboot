package com.example.learn.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop4Message {

	@Pointcut("@annotation(com.example.learn.aop.PreAuth)")  
	public void pointcut() { 
		System.out.println(" 포인트컷 프로필 설정");
	} 
	
	@Around("pointcut()")
	public Object getAround(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println(" 어라운드 ");
		return joinPoint.proceed();
	}
	
	
}
