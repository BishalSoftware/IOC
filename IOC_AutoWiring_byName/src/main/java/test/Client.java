package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Client {

	public static void main(String[] args) {
			ApplicationContext ap=new ClassPathXmlApplicationContext("resources/config.xml");
			Car ca=(Car) ap.getBean("c");
			ca.printData();
	}
}
