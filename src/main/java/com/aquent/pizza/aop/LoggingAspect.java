package com.aquent.pizza.aop;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * @author asundaramoorthy
 *
 */
@Aspect
@Configuration
public class LoggingAspect {
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * @param joinPoint
	 */
	@Before("execution(* com.aquent.pizza..*.*(..))")
	public void logBefore(JoinPoint joinPoint) {
		Date today = new Date();
		LOGGER.info(today+" ::: FUNC_START::: "+joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
	}
	
	/**
	 * @param joinPoint
	 */
	@After("execution(* com.aquent.pizza..*.*(..))")
	public void logAfter(JoinPoint joinPoint) {
		Date today = new Date();
		LOGGER.info(today+" ::: FUNC_END::: "+joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
	}
}
