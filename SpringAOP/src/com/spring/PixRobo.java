package com.spring;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class PixRobo {
	
//	@Before("execution(public void *())")
//	public void roboStart() {
//		System.out.println("Hi! My name is PixRobo. You are welcome.");
//	}
	
	
	
	
	// using Point Cut
//	@Before("pointCut()")
//	public void roboStart() {
//		System.out.println("Hi! My name is PixRobo. You are welcome.");
//	}
	
	
	
	
	
	// Get Method Details form our advice
//	@Before("pointCut()")
//	public void roboStart(JoinPoint j) {
////		System.out.println("Hi! My name is PixRobo. You are welcome. Device Name : "+j.getArgs()[0]);
////		System.out.println("Hi! My name is PixRobo. You are welcome. Total Device : "+j.getArgs()[1]);
//		
//		
//		System.out.println("Hi! My name is PixRobo. You are welcome. method argument : "+j.getSignature());
//		System.out.println("Hi! My name is PixRobo. You are welcome. method name : "+j.getSignature().getName());
//		System.out.println("Hi! My name is PixRobo. You are welcome. Class details : "+j.getTarget().getClass());
//		System.out.println("Hi! My name is PixRobo. You are welcome. Class name : "+j.getTarget().getClass().getName());
//		System.out.println("Hi! My name is PixRobo. You are welcome. Proxy details : "+j.getThis().getClass().getName());
//	}
	
	
	
	

	// Method in Advice in AOP......
	// This all are Advice in AOP
	
//	@After("execution(public void robo*())")
//	public void roboStop() {
//		System.out.println("Bye Bye my DebTeam\n");
//	}
	
//	@After("execution(public * robo*())")
//	public void roboStop() {
//		System.out.println("Bye Bye my DebTeam\n");
//	}
//	
//	
//	// pointCut
//	@Pointcut("execution(public void roboSoft(..))")
//	public void pointCut() {}
	
	
	
	// ...............................................................................
	
	
	// After Returning ..................
	
	
//	@AfterReturning(pointcut = "pointCut()", returning  = "valueReturned" )
//	public void roboStop(int valueReturned) {
//		System.out.println("Advice Returing Value : "+valueReturned );
//		
//	}
//		
//		
////	// pointCut
//	@Pointcut("execution(public * com.spring.HardDept.*())")
//	public void pointCut() {}
	
	
	
	
	
	// After Throwing ......................
	
	
	
//	@AfterThrowing(pointcut = "pointCut()", throwing  = "valueReturned" )
//	public void roboStop(MyException valueReturned) {
//		System.out.println("Throw Exception : "+valueReturned );
//		
//	}
//		
//		
////	// pointCut
//	@Pointcut("execution(public * com.spring.MarkRobo.*())")
//	public void pointCut() {}

	
	
	
	
	// Around ............................................
	
	
	@Around("pointCut()" )
	public Object roboWork(ProceedingJoinPoint jp) throws Throwable {
		//System.out.println("Main Value :  "+jp.proceed());
		//jp.proceed();
		
		
		Object[] obj = jp.getArgs();
		
		obj[1] = Integer.parseInt(obj[1]+"")-4;
		
		obj[0] = Integer.parseInt(obj[0]+"")-20;
		
		System.out.println(obj[1]);
		System.out.println(obj[0]);
		
		return jp.proceed();
		
	}
		
		
//	// pointCut
	@Pointcut("execution(public * roboWorkingHour(..))")
	public void pointCut() {}


}
