/*package com.javatpoint;  
import org.springframework.beans.factory.*;  
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Test
{   
	public static void main(String[] args) 
	{     
		//Resource r=new ClassPathResource("applicationContext.xml");  
		//BeanFactory b=new XmlBeanFactory(r);  
		
		BeanFactory bean = new ClassPathXmlApplicationContext("applicationContext.xml");
		MailMail m=(MailMail)bean.getBean("mailMail");  
		String sender="pratiksb93@gmail.com";//write here sender gmail id  
		String receiver="methil77.9@gmail.com";//write here receiver id  
		m.sendMail(sender,receiver,"hi","welcome");  
		      
		System.out.println("success");  
	}  
}  */