package com.spring.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.spring.entity.Address;
import com.spring.entity.Emp1;

public class TestEmp1WithAddress {
  public static void main(String[] args) {
	  Resource resource= new    // resource -- object of Resource Interface, represent the info  of xml file 
				ClassPathResource("ApplicationContext.xml");
		// ClassPathResource -- it is an implementation of class of Resource Interface
		BeanFactory bf = new XmlBeanFactory(resource);
		// BeanFactory -- it is an interface which return the bean 
		// XmlBeanFactory -- it is the implementation class of the beanfactory  
//		Address add = (Address) bf.getBean("a");
		Emp1 emp = (Emp1) bf.getBean("e1");

		emp.display();
}
} 
