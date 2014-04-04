package com.mycompany.guestbook;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

public class GuestBookApplication extends WebApplication {

	@Override
	public Class<? extends Page> getHomePage() {
		// TODO Auto-generated method stub
		return GuestBook.class;
	}

}
