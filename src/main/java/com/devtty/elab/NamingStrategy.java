package com.devtty.elab;

import org.hibernate.cfg.ImprovedNamingStrategy;

public class NamingStrategy extends ImprovedNamingStrategy {

	@Override
	public String classToTableName(String className) {
		String name = super.classToTableName(className);
		
		/* TODO: this could create errors, improve it */
		if(name.length() > 30){
			name = name.substring(0, 25);
		}		
		
		/* TODO: make prefix flexible */
		return "DE_" + name;
	}

}
