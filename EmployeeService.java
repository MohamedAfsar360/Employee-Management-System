package employee;


import java.util.HashSet;
import java.util.Scanner;


public class EmployeeService1 {

	HashSet<Employee1> empset=new HashSet<Employee1>();

	Employee1 emp1=new Employee1(101, "Afsar", 21, "Developer", "IT", 30000);
	Employee1 emp2=new Employee1(102, "Shuail", 22, "Tester","CO", 35000);
	Employee1 emp3=new Employee1(103, "Avinash", 22, "Tester","co", 35000);
	Employee1 emp4=new Employee1(104, "halith", 21, "System Eng","CO",  70000);
	Employee1 emp5=new Employee1(105, "chetta", 22, "developer","IT",  30000);

	Scanner sc=new Scanner(System.in);
	boolean found=false;

	int id;
	String name;
	int age;
	String department;
	String desiganation;
	double sal;

	public EmployeeService1() {

		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);

	}

	//view all employees
	public void viewAllEmps() {
		for(Employee1 emp:empset) {
			System.out.println(emp);
		}
	}
	//view emp based on there id
	public void viewEmp(){
		System.out.println("0 is use to exite\n");
		System.out.println("Enter id: ");
		id=sc.nextInt();
		for(Employee1 emp:empset) {
			if(emp.getId()==id) {
				System.out.println(emp);
				found=true;
			}
		}
		if(!found) {
			System.out.println("Employee with this id is not present");
		}
		if(id==0) {
			System.out.println("EXIT...!!");
		}
		else {
			viewEmp();
			
		}
		
	}
	//update the employee
	public void updateEmployee() {
		System.out.println("0 is use to exit\n");
		System.out.println("Enter id: ");
		id=sc.nextInt();
		boolean found=false;
		for(Employee1 emp:empset) {
			if(emp.getId()==id) {
				System.out.println("Enter name: ");
				name=sc.next();
				System.out.println("Enter new Salary");
				sal=sc.nextDouble();
				emp.setName(name);
				emp.setSalary(sal);
				System.out.println("Updated Details of employee are: ");
				System.out.println(emp);
				found=true;
			}
		}
		if(!found) {
			System.out.println("Employee is not present");
		}
		else {
			System.out.println("Employee details updated successfully !!");
		}
		if(id==0) {
			System.out.println("EXIT...!!");
		}
		else {
			updateEmployee();
			
		}
	}
	//delete emp
	public void deleteEmp() {
		System.out.println("0 is use to exit\n");
		System.out.println("Enter id");
		id=sc.nextInt();
		boolean found=false;
		Employee1 empdelete=null;
		for(Employee1 emp:empset) {
			if(emp.getId()==id) {
				empdelete=emp;
				found=true;
			}
		}
		if(!found) {
			System.out.println("Employee is not present");
		}
		else {
			empset.remove(empdelete);
			System.out.println("Employee deleted successfully!!");
		}
		if(id==0) {
			System.out.println("EXIT...!!");
		}
		else {
			deleteEmp();
			
		}
	}
	//add emp
	public void addEmp() {
		System.out.println("0 is use to exit\n");
		System.out.println("Enter id:");
		id=sc.nextInt();
		if(empset.containsAll(empset)) {
			System.out.println("this id  already exist");
			id=0;
		}
		if(id==0) {
			System.out.println("EXIT...!!");
		}	
		else {
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
		sc.nextLine();
		System.out.println("enter Desiganation");
		desiganation=sc.nextLine();
		System.out.println("Enter Department");
		department=sc.next();
		System.out.println("Enter salary");
		sc.nextDouble();
		System.out.print("\n");
		Employee1 emp=new Employee1(id, name, age, desiganation, department, sal);
		empset.add(emp);
		System.out.println(emp);
		System.out.println("Employtee addeed successsfully");
		addEmp();
		}
	}

	}
