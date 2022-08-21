package dao;

import javax.persistence.EntityManager;

import entity.Employee;

public class EmployeeDaoImplement implements EmployeeDao {
	private EntityManager entityManager;
	public EmployeeDaoImplement(EntityManager entityManager) {
		super();
		this.entityManager = JPAUtil.getEntityManager();
		
	}

	@Override
	public Employee getEmployeeById(int eid) {
	  Employee employee=entityManager.find(Employee.class,eid);
		return employee;
	}

	@Override
	public void addEmployee(Employee employee) {
		entityManager.persist(employee);
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		entityManager.merge(employee);
	}

	@Override
	public void removeEmployee(Employee employee) {
		entityManager.remove(employee);
	}

	@Override
	public void begainTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
