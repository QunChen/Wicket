package com.mycompany.navomaticborder;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

public class NavomaticApplication extends WebApplication {

	@Override
	public Class<? extends Page> getHomePage() {
		// TODO Auto-generated method stub
		return Page1.class;
	}

}
