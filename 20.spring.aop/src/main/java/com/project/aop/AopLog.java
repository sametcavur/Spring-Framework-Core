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
		System.out.println("��lem Ba�lat�l�yor ");
	}
	
	@After("execution (public * findProductNames())")
	public void afterAdvice() {
		System.out.println("��lem Kapat�l�yor. ");
	}
	
	
	------JO�N PO�NT--------
	@Before("execution (public * findProductNames())")
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("��lem Ba�lat�l�yor " +joinPoint);
	}
	
	@After("execution (public * findProductNames())")
	public void afterAdvice(JoinPoint joinPoint) {
		System.out.println("��lem Kapat�l�yor. " +joinPoint);
	}
	
	
	--------PO�NTCUT VE JO�N PO�NT---------
	@Before("findProductNames()")
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("��lem Ba�lat�l�yor " + joinPoint);
	}
	
	@After("findProductNames()")
	public void afterAdvice(JoinPoint joinPoint) {
		System.out.println("��lem Kapat�l�yor. " + joinPoint);
	}
	@Pointcut("execution (public * findProductNames())")
	public void findProductNames() {
	}
	
	
	--------PO�NTCUT VE JO�N PO�NT (B�T�N CLASSLARA LOGLAMA-W�TH�N �ZELL���)---------
	@Before("pointCutProductRepository()")
	public void beforeAdvice1(JoinPoint joinPoint) {
		System.out.println("��lem Ba�lat�l�yor " + joinPoint);
	}
	
	@After("pointCutProductRepository()")
	public void afterAdvice1(JoinPoint joinPoint) {
		System.out.println("��lem Kapat�l�yor. " + joinPoint);
	}
	@Pointcut("within (com.project.repositoryImp.*)")
	public void pointCutProductRepository() {
	}
	
	
	--------AFTER RETURN�NG---------
	@AfterReturning(pointcut = "execution (public * findProductNames())",returning = "string")
	public void afterReturn(JoinPoint joinPoint,List<String> string) {
		System.out.println("Return edildikten hemen sonra");
		for (String string2 : string) {
			System.out.println(string2);
		}
	}
	
	
	--------AFTER THROW�NG--------
	@AfterThrowing(pointcut = "execution (public * com.project.repositoryImp.ProductRepository.findProductById(*))",throwing = "exception")
	public void afterThrowingAdvice(JoinPoint joinPoint,RuntimeException exception) {
		System.out.println("Ge�ersiz index de�eri HATA*HATA*HATA*HATA*HATA");
		System.out.println("METOD= " + joinPoint);
		System.out.println("HATA= " + exception);
	}
	
	
	--------AROUND--------
	@Around("findProductByIdAdvice()")
	public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable  {
		
		System.out.println("Around ba�lad�" + proceedingJoinPoint);
		Object object =proceedingJoinPoint.proceed();
		System.out.println("Around bitti" + proceedingJoinPoint);
		return object;
	}
	@Pointcut("within (com.project.repositoryImp.*)")
	public void findProductByIdAdvice() {
	}
		*/	
}
