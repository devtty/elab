package com.devtty.elab;

import org.jboss.seam.faces.rewrite.FacesRedirect;
import org.jboss.seam.faces.rewrite.UrlMapping;
import org.jboss.seam.faces.view.config.ViewConfig;
import org.jboss.seam.faces.view.config.ViewPattern;

@ViewConfig
public interface ElabViewConfig {
	
	static enum Views {
		@UrlMapping(pattern="/")
		@ViewPattern("/index.xhtml")
		ROOT,
		
		@UrlMapping(pattern="/employee/*")
		@ViewPattern("/faces/employee.xhtml")
		EMPLOYEE_ALL,
		
		/*
		@UrlMapping(pattern="/employee/#{id}")
		@ViewPattern("/employee.xhtml")
		EMPLOYEE,
		*/
		
		@FacesRedirect
		@ViewPattern("/*")
		//@AccessDeniedView("/index.xhtml")
		//@LoginView("/index.xhtml")
		ALL
	}

}
