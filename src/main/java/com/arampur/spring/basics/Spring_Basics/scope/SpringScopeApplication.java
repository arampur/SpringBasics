package com.arampur.spring.basics.Spring_Basics.scope;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.arampur.spring.basics.Spring_Basics.BinarySearchImpl;

@SpringBootApplication
public class SpringScopeApplication {
	//Creating logger
	private static Logger LOGGER = LoggerFactory.getLogger(SpringScopeApplication.class);

	public static void main(String[] args) {
		
		ApplicationContext appContext = SpringApplication.run(SpringScopeApplication.class, args);
		personDao personDao = appContext.getBean(personDao.class);
		personDao personDao2 = appContext.getBean(personDao.class);
		
		LOGGER.info("{}",personDao);
		LOGGER.info("{}",personDao.getJdbcConnection());
		LOGGER.info("{}",personDao2);
		LOGGER.info("{}",personDao2.getJdbcConnection());
	}

}
