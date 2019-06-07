package com.arampur.spring.basics.Spring_Basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicsApplication {

	public static void main(String[] args) {
		//BinarySearchImpl binary = new BinarySearchImpl(new BubbleSortAlgorithm());
		
		System.out.println("Coupling results");
		ApplicationContext appContext = SpringApplication.run(SpringBasicsApplication.class, args);
		BinarySearchImpl binary = appContext.getBean(BinarySearchImpl.class);
		int result = binary.binarySearch(new int[] {2,3,4}, 3);
		System.out.println(result);
	}

}
