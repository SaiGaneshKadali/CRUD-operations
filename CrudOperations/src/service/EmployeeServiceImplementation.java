package service;

import dao.EmployeeDao;
import dao.EmployeeDaoImplement;
import entity.Employee;

public class EmployeeServiceImplementation implements EmployeeService {
	
	private EmployeeDao dao;

	public EmployeeServiceImplementation() {
		dao=new EmployeeDaoImplement(null);
	}
	@Override
	public Employee getEmployeeById(int eid) {
		Employee employee=dao.getEmployeeById(eid);
		return null;
	}

	@Override
	public void addEmployee(Employee Employee) {
		dao.begainTransaction();
		dao.addEmployee(Employee);
		dao.commitTransaction();
	}

	@Override
	public void updateEmployee(Employee employee) {
		dao.begainTransaction();
		dao.updateEmployee(employee);
		dao.commitTransaction();
		
	}

	@Override
	public void removeEmployee(Employee employee) {
		dao.begainTransaction();
		dao.removeEmployee(employee);
		dao.commitTransaction();
		
	}
	public EmployeeDao getDao() {
		return dao;
	}
	public void setDao(EmployeeDao dao) {
		this.dao = dao;
	}

}
