package com.example.demo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Component
@Aspect
public class UserAspect {

	@Before("execution(* com.example.demo.*.*.*(..))")
	public void moringMsg() {
		System.out.println("Good Morning");
	}

	@After("execution(* com.example.demo.controller.AOPController.*())")
	public void welcome() {
		System.out.println("Welcome To StudyRoom");
	}

	/*
	 * @Around("execution(* com.example.demo.controller.AOPController.*())") 
	 * public void around()
	 *  { System.out.println("i am enjoying"); }
	 */
	
	 /* @Around("execution(* sumOfTwoNumbers(..))")
	  public int around() {
	  System.out.println("sum is getting seven"); 
	  return 0;*/
	  
	@Around("execution(* sumOfTwoNumbers(..))")
	  public int around(ProceedingJoinPoint pjoin) {
	  System.out.println("sum is getting seven"); 
	  int x=(int) pjoin.getArgs()[0];
	  int y=(int) pjoin.getArgs()[1];
	  return x+10 + y+5;
	  
}
}
