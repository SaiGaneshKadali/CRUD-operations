package dao;

import entity.Employee;

public interface EmployeeDao {
    public abstract Employee getEmployeeById(int eid);
    public abstract void addEmployee(Employee employee);
    public abstract void updateEmployee(Employee employee);
    public abstract void removeEmployee(Employee employee);
    
    
    public abstract void begainTransaction();
    public abstract void commitTransaction();
    
}
