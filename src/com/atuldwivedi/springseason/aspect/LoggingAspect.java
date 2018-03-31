package com.atuldwivedi.springseason.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Before("execution(* com.atuldwivedi.springseason..*.*(..))")
	public void methodEntryLog() {
		System.out.println(">> Method started");
	}
}
