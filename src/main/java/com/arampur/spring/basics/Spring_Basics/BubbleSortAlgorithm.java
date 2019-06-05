package com.arampur.spring.basics.Spring_Basics;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm{
	public int[] sort(int[] numbers){
		System.out.println("BubbleSortMethod");
		return numbers;
	}
}
