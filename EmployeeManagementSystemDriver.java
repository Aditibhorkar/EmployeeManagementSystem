package Projects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeManagementSystemDriver {

	static Scanner scanner = new Scanner(System.in);
	static ArrayList<EmployeeManagementSystem> e1 = new ArrayList<EmployeeManagementSystem>();

	public static void main(String[] args) {
		e1.add(new EmployeeManagementSystem(7369, "SMITH", "CLERK", "7902", "17-DEC-80", 800, 000, 20));
		e1.add(new EmployeeManagementSystem(7499, "ALLEN", "SALESMAN", "7698", "20-FEB-81", 1600, 300, 30));
		e1.add(new EmployeeManagementSystem(7521, "WARD", "SALESMAN", "7698", "22-FEB-81", 1250, 500, 30));
		e1.add(new EmployeeManagementSystem(7566, "JONES", "MANAGER", "7839", "02-APR-81", 2975, 000, 20));
		e1.add(new EmployeeManagementSystem(7654, "MARTIN", "SALESMAN", "7698", "28-SEP-81", 1250, 1400, 30));
		e1.add(new EmployeeManagementSystem(7698, "BLAKE", "MANAGER", "7839", "01-MAY-81", 2850, 000, 30));
		e1.add(new EmployeeManagementSystem(7782, "CLARK", "MANAGER", "7839", " 09-JUN-81", 2450, 000, 10));
		e1.add(new EmployeeManagementSystem(7788, "SCOTT", "ANALYST", "7566", "19-APR-87", 3000, 000, 20));
		e1.add(new EmployeeManagementSystem(7839, "KING", "PRESIDENT", null, "17-NOV-81", 5000, 000, 10));
		e1.add(new EmployeeManagementSystem(7844, "TURNER", "SALESMAN", "7698", "08-SEP-81", 1500, 000, 30));
		e1.add(new EmployeeManagementSystem(7876, "ADAMS", "CLERK", "7788", "23-MAY-87", 1100, 000, 20));
		e1.add(new EmployeeManagementSystem(7900, "JAMES", "CLERK", "7698", "03-DEC-81", 950, 000, 30));
		e1.add(new EmployeeManagementSystem(7902, "FORD", "ANALYST", "7566", "03-DEC-81", 3000, 000, 20));
		e1.add(new EmployeeManagementSystem(7934, "MILLER", "CLERK", "7782", "23-JAN-82", 1300, 000, 10));
		
		
		while (true) {
			System.out.println("++-----------------  Employee Management System  -----------------++");
			System.out.println("********************************************************************");
			
			System.out.println("*          Please select the operation you want to perform :       *");
			System.out.println("*                 1.List all the employee                          * \n*                 2.Search the employee                            * \n*                 3.Sort the employee alphabetically               *");
			System.out.println("*                 4.Exit                                           *");
			System.out.println("********************************************************************");
			int ch=scanner.nextInt();
			switch (ch) {
			case 1:
				listEmployee();
				break;
			case 2:
				System.out.println("Enter the name of the employee you want to search");
				String n1=scanner.next();
				searchEmployeeByName(n1);
				break;
				
			case 3:
				sortEmployee();
				break;
				
			case 4:
				System.out.println("***********  Thank You  ***********");
				break;
			default:
				System.out.println("Invalid Choice");
			}
			
			if (ch==4) {
				break;
			}
		}
	}

	public static void searchEmployeeByName(String search) {

		for (Object o : e1) {
			EmployeeManagementSystem s1 = (EmployeeManagementSystem) o;

			if (s1.eName.equalsIgnoreCase(search)) {
				System.out.println("Employee Found");
				return;
			}
		}
		System.out.println("Employee Not Found");
	}

	public static void addEmployee() {
		System.out.println("Enter id , name ,job,manager,hiredate,sal,commission,department number");
		int id = scanner.nextInt();
		String name = scanner.next();
		String job = scanner.next();
		String mgr = scanner.next();
		String hiredate = scanner.next();
		int comm = scanner.nextInt();
		int sal = scanner.nextInt();
		int deptno = scanner.nextInt();
		e1.add(new EmployeeManagementSystem(id, name, job, mgr, hiredate, sal, comm, deptno));
		System.out.println("Employee added successfully");

	}
	
	public static void listEmployee()
	{
		for (EmployeeManagementSystem employeeManagementSystem : e1) {
			System.out.println(employeeManagementSystem);
		}
		
	}
	
	public static void sortEmployee()
	{
		Collections.sort(e1);
		listEmployee();
	}
	

}
