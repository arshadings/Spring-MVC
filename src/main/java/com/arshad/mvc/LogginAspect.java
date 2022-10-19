package com.arshad.mvc;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogginAspect {
	
	@Before("execution(public * com.arshad.mvc.AlienController.getAliens())")
	public void log() {
		System.out.println("Get Aliens methods execution started");
	}
}
