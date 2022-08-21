package service;

import entity.Employee;

public interface EmployeeService {
	public abstract Employee getEmployeeById(int eid);
    public abstract void addEmployee(Employee employee);
    public abstract void updateEmployee(Employee employee);
    public abstract void removeEmployee(Employee employee);
}