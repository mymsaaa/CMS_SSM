package com.ms.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Component
@Aspect  
public class myAspect {
	@Around(value = "execution(* com.lp.*.Service.*Imp.*(..))")
	public void openSession(ProceedingJoinPoint pjp){
		System.out.println("hi");
		try {
			pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("hello");
	}
}
