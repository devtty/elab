package com.devtty.elab.query;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import com.devtty.elab.model.planner.Employee;

@RequestScoped
public class AllEmployeesQuery {

	@Produces
	@Named
	private List<Employee> allEmployees;
	
	@Inject
	public void init(EntityManager em){
		this.allEmployees = em.createQuery("select e from Employee e", Employee.class).getResultList();
	}
	
}
