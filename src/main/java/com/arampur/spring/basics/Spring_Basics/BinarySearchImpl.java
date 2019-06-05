package com.arampur.spring.basics.Spring_Basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired //Telling Spring that it is a Dependency BinarySearch depends on Sort Algorithm
	private SortAlgorithm sortAlgorithm;//Private because its an instance
	
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}


	public int binarySearch(int[] numbers, int numtoSearch){
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		return 3;
	}
}
