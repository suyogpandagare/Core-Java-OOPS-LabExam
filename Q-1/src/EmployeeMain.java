import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) throws IOException {

		ArrayList<Employee> list = new ArrayList<Employee>();
		Scanner sc = new Scanner(System.in);
		int choice;
		list.add(new Employee("Suyog", 12, "Dveloper"));
		list.add(new Employee("Sanket", 16, "Tester"));
		list.add(new Employee("Piyush", 19, "Operator"));
		list.add(new Employee("Shubham", 11, "Hacker"));


		do {

			System.out.println("---------------------------");
			System.out.println("Enter your choice: \n"
					+ "1. Add Employee To The List: \n"
					+ "2. Remove Employee From List: \n"
					+ "3. Show All Employee: \n"
					+ "4. Show All Employee In Sorted Order(on basis of empId): \n"
					+ "5. Find A EMployee With empName: \n"
					+ "6. Save All EMployees Into File: \n"
					+ "7. Quit");

			choice  = sc.nextInt();
			switch(choice) {

			case 1: {
				System.out.println("Enter Employee Name: \n"
						+ "Employee Id: \n"
						+ "Employee Role");
				String name = sc.next();
				int eId = sc.nextInt();
				String role = sc.next();

				list.add(new Employee(name, eId, role));
				System.out.println("Employee Added Successfully: ");
				break;
			}

			case 2: {
				System.out.println("Emter Employee Name to Remove: ");
				String name = sc.next();
				for (int i = 0; i < list.size(); i++) {

					if(list.get(i).getEmpName().equals(name))
					{
						list.remove(i);
					}
				}
				break;
			}

			case 3: {
				if(list.isEmpty())
					System.out.println("No Employee In The List");
				else
				{
					for (Employee employee : list) {
						System.out.println(employee);
					}
				}
				break;
			}

			case 4: {
				Collections.sort(list);
				for (Employee employee : list) {
					System.out.println(employee);
				}
				break;
			}

			case 5: {
				System.out.println("Enter Employee Name: ");
				String name = sc.next();
				for (int i = 0; i < list.size(); i++) {
					if(list.get(i).getEmpName().equals(name))
					{
						System.out.println(list.get(i));
					}
					else
						System.out.println("Employee Not Found");
				}
				break;
			}

			case 6: {
				FileOutputStream fout = new FileOutputStream("E:\\OOPS\\employee.txt",true);
				ObjectOutputStream oout = new ObjectOutputStream(fout);
				
					for (Employee employee : list) {
						oout.writeObject(employee);
						oout.flush();
					}
					
					oout.close();
					
				break;
			}

			case 7: {
				System.out.println("Thank you...!!!");
				break;
			}

			}//end of switch

		}while(choice != 7);

	}//end of main

}//end of class
