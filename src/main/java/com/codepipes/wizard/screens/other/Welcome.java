/**
 * 
 */
package com.codepipes.wizard.screens.other;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * The first page that describes the functionality
 * as provided by VMware.
 * 
 * @author kkapelonis
 * 
 */
@Controller
public class Welcome {

	private static final Logger logger = LoggerFactory.getLogger(Welcome.class);

	private ModelAndView mav = null;
	

	public Welcome() {
		mav = new ModelAndView();
		mav.setViewName("other/welcome");
		mav.addObject("selectedTab", "welcome");
		mav.addObject("pageName", "Welcome to VM creator");
	}

	@RequestMapping(value = "/index.html", method = RequestMethod.GET)
	public ModelAndView index() {
		logger.debug("Welcome page is showing");
		return mav;
	}
	
}
