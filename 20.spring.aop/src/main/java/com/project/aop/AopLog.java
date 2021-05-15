package com.project.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopLog {
	/* 
	------BEFORE-AFTER--------
	@Before("execution (public * findProductNames())")
	public void beforeAdvice() {
		System.out.println("Ýþlem Baþlatýlýyor ");
	}
	
	@After("execution (public * findProductNames())")
	public void afterAdvice() {
		System.out.println("Ýþlem Kapatýlýyor. ");
	}
	
	
	------JOÝN POÝNT--------
	@Before("execution (public * findProductNames())")
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("Ýþlem Baþlatýlýyor " +joinPoint);
	}
	
	@After("execution (public * findProductNames())")
	public void afterAdvice(JoinPoint joinPoint) {
		System.out.println("Ýþlem Kapatýlýyor. " +joinPoint);
	}
	
	
	--------POÝNTCUT VE JOÝN POÝNT---------
	@Before("findProductNames()")
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("Ýþlem Baþlatýlýyor " + joinPoint);
	}
	
	@After("findProductNames()")
	public void afterAdvice(JoinPoint joinPoint) {
		System.out.println("Ýþlem Kapatýlýyor. " + joinPoint);
	}
	@Pointcut("execution (public * findProductNames())")
	public void findProductNames() {
	}
	
	
	--------POÝNTCUT VE JOÝN POÝNT (BÜTÜN CLASSLARA LOGLAMA-WÝTHÝN ÖZELLÝÐÝ)---------
	@Before("pointCutProductRepository()")
	public void beforeAdvice1(JoinPoint joinPoint) {
		System.out.println("Ýþlem Baþlatýlýyor " + joinPoint);
	}
	
	@After("pointCutProductRepository()")
	public void afterAdvice1(JoinPoint joinPoint) {
		System.out.println("Ýþlem Kapatýlýyor. " + joinPoint);
	}
	@Pointcut("within (com.project.repositoryImp.*)")
	public void pointCutProductRepository() {
	}
	
	
	--------AFTER RETURNÝNG---------
	@AfterReturning(pointcut = "execution (public * findProductNames())",returning = "string")
	public void afterReturn(JoinPoint joinPoint,List<String> string) {
		System.out.println("Return edildikten hemen sonra");
		for (String string2 : string) {
			System.out.println(string2);
		}
	}
	
	
	--------AFTER THROWÝNG--------
	@AfterThrowing(pointcut = "execution (public * com.project.repositoryImp.ProductRepository.findProductById(*))",throwing = "exception")
	public void afterThrowingAdvice(JoinPoint joinPoint,RuntimeException exception) {
		System.out.println("Geçersiz index deðeri HATA*HATA*HATA*HATA*HATA");
		System.out.println("METOD= " + joinPoint);
		System.out.println("HATA= " + exception);
	}
	
	
	--------AROUND--------
	@Around("findProductByIdAdvice()")
	public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable  {
		
		System.out.println("Around baþladý" + proceedingJoinPoint);
		Object object =proceedingJoinPoint.proceed();
		System.out.println("Around bitti" + proceedingJoinPoint);
		return object;
	}
	@Pointcut("within (com.project.repositoryImp.*)")
	public void findProductByIdAdvice() {
	}
		*/	
}
