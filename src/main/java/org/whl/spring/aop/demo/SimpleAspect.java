package org.whl.spring.aop.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SimpleAspect {

    @Pointcut("execution(* org.whl.spring.aop.demo.*Service*.*(..))")
    public void pointCut() {
        System.out.println("I am point cut ...");
    }
    
    @After("pointCut()")
    public void after() {
        System.out.println("After aspect executed.");
    }
    
    @Before("pointCut()")
    public void before() {
        System.out.println("Befor aspect executed.");
    }
    
    @AfterReturning(pointcut="pointCut()", returning="returnValue")
    public void afterReturning (JoinPoint joinPoint, Object returnValue) {
        System.out.println("After returning executed, return result is " + returnValue);
    }
    
    @Around("pointCut()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around start.");
        
        try {
            pjp.proceed();
        } catch (Exception e) {
            System.out.println("error in around.");
            throw e;
        }
        
        System.out.println("around end.");
    }
    
    @AfterThrowing(pointcut="pointCut()", throwing="error")
    public void afterThrowing (JoinPoint jp, Throwable error) {
        System.out.println("error: " + error);
    }
}
