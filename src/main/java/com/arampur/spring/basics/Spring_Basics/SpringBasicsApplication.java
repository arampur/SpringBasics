package com.arampur.spring.basics.Spring_Basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBasicsApplication {

	public static void main(String[] args) {
		BinarySearchImpl binary = new BinarySearchImpl(new BubbleSortAlgorithm());
		int result = binary.binarySearch(new int[] {2,3,4}, 3);
		System.out.println("Coupling results");
		System.out.println(result);
		
		SpringApplication.run(SpringBasicsApplication.class, args);
	}

}
