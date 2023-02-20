package myPack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestCompanyApp {
	
	private static ApplicationContext ctx;

		
	public static void main(String[] args) {
		
		ctx = new AnnotationConfigApplicationContext(CompanyConfig.class);
		
		Company companyObj =  ctx.getBean("companyBean",Company.class);
		companyObj.setCompanyNm("TATA Motors Ltd");
		System.out.println(companyObj);
	}
}