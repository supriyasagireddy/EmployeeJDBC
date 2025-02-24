package EmployeDetails;
import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class EmployeeManagement {
    public static void main(String[] args) throws ParseException {
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("1.insert employee");
            System.out.println("2.Update employee by id");
            System.out.println("3.get employee by id");
            System.out.println("4.insert attendance");
            System.out.println("5.get attendance");
            System.out.println("6.exit");
            System.out.println("Enter your choice");
            int choice=scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("EmpId= ");
                    int empId=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("empName=");
                    String empName=scanner.nextLine();

                    System.out.print("Enter dob (yyyy-MM-dd): ");
                    String Dob = scanner.nextLine();

                    System.out.println("enter doj (yyyy-MM-dd) ");
                    String Doj=scanner.nextLine();

                    EmployeeManagementSystem ems=new EmployeeManagementSystem();
                    ems.insertEmployee(empId, empName, Dob, Doj);
                    break;
                case 2:
                    System.out.println("EmpId= ");
                    int empId1=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("empName=");
                    String empName1=scanner.nextLine();

                    System.out.print("Enter dob (yyyy-MM-dd): ");
                    String Dob1 = scanner.nextLine();

                    System.out.println("enter doj (yyyy-MM-dd) ");
                    String Doj1=scanner.nextLine();

                    EmployeeManagementSystem ems1=new EmployeeManagementSystem();
                    ems1.updateEmployee(empId1, empName1, Dob1, Doj1);
                    break;
                case 3:
                    System.out.println("EmpId= ");
                    int empId2=scanner.nextInt();
                    scanner.nextLine();
                    EmployeeManagementSystem ems2=new EmployeeManagementSystem();
                    ems2.getEmployeeById(empId2);
                    break;
                case 4:
                    System.out.println("EmpId= ");
                    int empId3=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("empName=");
                    String empName3=scanner.nextLine();
                    System.out.print("Days Present");
                    int daysPresent = scanner.nextInt();
                    scanner.nextLine();
                    EmployeeManagementSystem ems3=new EmployeeManagementSystem();
                    ems3.insertAttendance(empId3, empName3, daysPresent);
                    break;
                case 5:
                    System.out.println("EmpId= ");
                    int empId4=scanner.nextInt();
                    scanner.nextLine();
                    EmployeeManagementSystem ems4=new EmployeeManagementSystem();
                    ems4.getAttendance(empId4);
                    break;
            }

        }
    }
}
