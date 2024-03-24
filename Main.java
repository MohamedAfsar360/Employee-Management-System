package project1;
import java.util.Scanner;
public class Main {
	EmployeeService service=new EmployeeService();
	static boolean ordering = true;
	public static void menu() {
        System.out.println("*****Welcome To Employee Managment System **** "
        		+ "\n	1.Add Employee "
        		+ "\n	2.View Employee"
        		+ "\n	3.Update Employee"
        		+ "\n	4.Delete Employee"
        		+ "\n	5.View All Employee"
        		+ "\n	6.Exist ");
    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService service=new EmployeeService();

		do {
			menu();
			System.out.println("Enter your CHOICE");
			int choice=sc.nextInt();
			switch(choice) {

			case 1:
				System.out.println("ADD EMPLOYEE");
				service.addEmp();
				break;
			case 2:
				System.out.println("VIEW EMPLOYEE");
				service.viewEmp();
				break;
			case 3:
				System.out.println("UPDATE EMPLOYEE");
				service.updateEmployee();
				break;
			case 4:
				System.out.println("DELETE EMPLOYEE");
				service.deleteEmp();
				break;
			case 5:
				System.out.println("VIEW ALL EMPLOYEE");
				service.viewAllEmps();
				break;
			case 6:
				System.out.println("THANK YOU FOR USING APPLICATION!!");
				break;
			default:
				System.out.println("PLEASE ENTER VALID CHOICE");
			}
		}while(ordering);
		sc.close();
			}
	}
