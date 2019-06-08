package com.arampur.spring.basics.Spring_Basics;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	
	private Logger logging = LoggerFactory.getLogger(this.getClass()); 
	
	@Autowired //Telling Spring that it is a Dependency BinarySearch depends on Sort Algorithm
	@Qualifier(value="bubble")
	private SortAlgorithm sortAlgorithm;//Private because its an instance


	public int binarySearch(int[] numbers, int numtoSearch){
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		return 3;
	}
	
	@PostConstruct
	public void postConstrMethod(){
		logging.info("Post construct");
	}
	
	@PreDestroy
	public void predestroyMehtod(){
		logging.info("Post construct");
	}
}
