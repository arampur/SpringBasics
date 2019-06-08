package cdidemo;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Named
public class CdiDemoClass {
	@Inject
	CdiDemoDao cdidemoDao;

	public CdiDemoDao getCdidemoDao() {
		return cdidemoDao;
	}

	public void setCdidemoDao(CdiDemoDao cdidemoDao) {
		this.cdidemoDao = cdidemoDao;
	}
	
	
}
