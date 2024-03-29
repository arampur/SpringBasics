package com.arampur.spring.basics.Spring_Basics.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class JDBCConnection {
	public JDBCConnection(){
		System.out.println("JDBC Connection");
	}
}
