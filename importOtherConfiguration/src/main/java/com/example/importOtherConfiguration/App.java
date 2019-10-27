package com.example.importOtherConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.importOtherConfiguration.bean.BeanTarget;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig1.class);
		BeanTarget target = context.getBean(BeanTarget.class);
		System.out.println(target);
	}
}
