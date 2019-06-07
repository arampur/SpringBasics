package com.arampur.spring.basics.Spring_Basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Quick")
public class BubbleSortAlgorithm implements SortAlgorithm{
	public int[] sort(int[] numbers){
		System.out.println("BubbleSortMethod");
		return numbers;
	}
}
