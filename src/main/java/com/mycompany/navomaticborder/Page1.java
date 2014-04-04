package com.mycompany.navomaticborder;

import org.apache.wicket.markup.html.WebPage;

public class Page1 extends WebPage {
	 public Page1() {
	        add(new NavomaticBorder("navomaticBorder"));
	    }
}
