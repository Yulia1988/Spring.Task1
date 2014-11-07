package com.academysmart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"WEB.xml");
		RealKnight Arthur = (RealKnight) context.getBean("knightArthur");
		Arthur.embarkOnQuest();
	}

}
