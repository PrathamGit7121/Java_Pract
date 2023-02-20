package myPack;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLookupDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("bookConfig.xml");
		
		Publisher pbObj = (Publisher) ctx.getBean("publisherBean");
		
		System.out.println("Book information at Pubisher : ");
		System.out.println("Book Name: " + pbObj.getBookInfo().getBookNm());
		System.out.println("Book price: " + pbObj.getBookInfo().getPrice());
		System.out.println(pbObj);
		
		Seller selObj = (Seller) ctx.getBean("sellerBean");
		
		System.out.println("\nBook information at Seller : ");
		System.out.println("Book Name: " + selObj.getBookDetails().bookNm);
		System.out.println("Book price: " + selObj.getBookDetails().price);
		System.out.println(selObj);
		
		Student studObj = (Student) ctx.getBean("studentBean");
		
		System.out.println("\nBook information at Student : ");
		System.out.println("Book Name: " + studObj.getBooksDetailsInfo().bookNm);
		System.out.println("Book price: " + studObj.getBooksDetailsInfo().price);
		System.out.println(studObj);
	}
}