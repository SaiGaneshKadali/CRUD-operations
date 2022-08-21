package Client;

import java.util.Scanner;

import entity.Employee;
import service.EmployeeServiceImplementation;
import service.EmployeeService;

public class Client {

	public static void main(String[] args) {
	   EmployeeService service =new EmployeeServiceImplementation();
	   Employee employee = new Employee ();
	   try {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter Employee data");
		   employee.setEid(sc.nextInt());
		   employee.setEname(sc.next());
		   employee.setEsal(sc.next());
		   employee.setBonus(sc.nextInt());
		   service.addEmployee(employee);
		   
	   }
	   catch(Exception ex){
		   System.out.println("the entered input is not according to the type defiend");
		   
	   }
	   System.out.println("added employee data");
	   

	}
	
	

}
