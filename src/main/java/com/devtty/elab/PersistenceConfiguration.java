package com.devtty.elab;

import javax.enterprise.context.ConversationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.jboss.solder.core.ExtensionManaged;

public class PersistenceConfiguration {

	@Produces
	@ExtensionManaged
	@ConversationScoped
	@PersistenceUnit
	private EntityManagerFactory primary;
	
}
