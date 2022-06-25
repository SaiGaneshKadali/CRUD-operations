
public class Employee {
	
	   String name;

	   double salary;

	   public Employee (String empName) {
	      name = empName;
	   }

	   public void setSalary(double empSal) {
	      salary = empSal;
	   }

	   public void printEmp() {
	      System.out.println("name  : " + name );
	      System.out.println("salary :" + salary);
	   }

	   public static void main(String args[]) {
	      Employee empOne = new Employee("Akash");
	      empOne.setSalary(20000);
	      empOne.printEmp();
	   }
	}