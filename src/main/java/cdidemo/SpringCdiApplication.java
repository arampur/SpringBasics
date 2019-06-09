package cdidemo;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.arampur.spring.basics.Spring_Basics.BinarySearchImpl;

import cdidemo.CdiDemoClass;

@SpringBootApplication
@ComponentScan("com.arampur.spring.basics.Spring_Basics")
public class SpringCdiApplication {
	//Creating logger
	private static Logger LOGGER = LoggerFactory.getLogger(SpringCdiApplication.class);

	public static void main(String[] args) {
		
		ApplicationContext appContext = SpringApplication.run(SpringCdiApplication.class, args);
		cdidemo.CdiDemoClass cdidemodao = appContext.getBean(cdidemo.CdiDemoClass.class);	
		
		LOGGER.info("{}",cdidemodao, cdidemodao.getCdidemoDao());
		
	}

}
