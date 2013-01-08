package com.devtty.elab;

import org.jboss.seam.faces.rewrite.FacesRedirect;
import org.jboss.seam.faces.rewrite.UrlMapping;
import org.jboss.seam.faces.security.LoginView;
import org.jboss.seam.faces.view.config.ViewConfig;
import org.jboss.seam.faces.view.config.ViewPattern;
import org.jboss.seam.security.annotations.LoggedIn;

@ViewConfig
public interface ElabViewConfig {
	
	
	static enum Views {
		@LoggedIn
		@UrlMapping(pattern="/")
		@ViewPattern("/index.xhtml")
		@LoginView("/login.xhtml")
		ROOT,
		
		@LoggedIn
		@UrlMapping(pattern="/employee/*")
		@ViewPattern("/faces/employee.xhtml")
		EMPLOYEE_ALL,
		
		@FacesRedirect
		@ViewPattern("/*")
		ALL
	}

}
