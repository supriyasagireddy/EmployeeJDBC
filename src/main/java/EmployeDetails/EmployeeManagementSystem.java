package EmployeDetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Date;

public class EmployeeManagementSystem {
    String url = "jdbc:mysql://localhost:3306/EmployeesDetails";
    String user = "root";
    String password = "Suppu@09091999";

    public void insertEmployee(int EmpId, String EmpName ,String Dob,String Doj ) {
        try {
            String insertQuery = "INSERT INTO Employee (empId, empName, Dob, Doj) VALUES (" + EmpId + ", '" + EmpName + "','"+Dob+"','"+Doj+"')";
            System.out.println(insertQuery);
            Connection c = DriverManager.getConnection(url, user, password);
            Statement s = c.createStatement();
            int i = s.executeUpdate(insertQuery);
            if (i == 1) {
                System.out.println("Employee data inserted successfully");
            } else {
                System.out.println("Insertion of employee data failed");
            }
            s.close();
            c.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Implement methods to update and retrieve employee data

    public void updateEmployee(int EmpId, String EmpName, String Dob, String Doj) {
        try {
            String updateQuery = "UPDATE Employee SET empName = '" + EmpName + "', dob = '" + Dob + "', doj = '" + Doj + "' WHERE empId = " + EmpId;
            Connection c = DriverManager.getConnection(url, user, password);
            Statement s = c.createStatement();
            int i = s.executeUpdate(updateQuery);
            if (i == 1) {
                System.out.println("Employee data updated successfully");
            } else {
                System.out.println("Update of employee data failed");
            }
            s.close();
            c.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void getEmployeeById(int empId) {
        Employee employee = null;
        try {
            Connection c = DriverManager.getConnection(url, user, password);
            Statement s = c.createStatement();
            String selectQuery = "SELECT empName, dob, doj FROM Employee WHERE empId = " + empId;
            ResultSet resultSet = s.executeQuery(selectQuery);
            if (resultSet.next()) {
                String empName = resultSet.getString("empName");
                Date dob = resultSet.getDate("dob");
                Date doj = resultSet.getDate("doj");
                employee = new Employee(empId, empName, dob, doj);
            }
            s.close();
            c.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(employee);
    }

    // Implement methods to insert and retrieve attendance data

    public void insertAttendance(int empId, String empName, int daysPresent) {
        try {
            Connection c = DriverManager.getConnection(url, user, password);
            Statement s = c.createStatement();
            String insertQuery = "INSERT INTO EmployeeAttendance (empId, empName, daysPresent) VALUES (" + empId + ", '" + empName + "', " + daysPresent + ")";
            int i = s.executeUpdate(insertQuery);
            if (i == 1) {
                System.out.println("Attendance data inserted successfully");
            } else {
                System.out.println("Insertion of attendance data failed");
            }
            s.close();
            c.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public EmployeeAttendance getAttendance(int empId) {
        EmployeeAttendance attendance = null;
        try {
            Connection c = DriverManager.getConnection(url, user, password);
            Statement s = c.createStatement();
            String selectQuery = "SELECT empName, daysPresent FROM EmployeeAttendance WHERE empId = " + empId;
            ResultSet resultSet = s.executeQuery(selectQuery);
            if (resultSet.next()) {
                String empName = resultSet.getString("empName");
                int daysPresent = resultSet.getInt("daysPresent");
                attendance = new EmployeeAttendance(empId, empName, daysPresent);
            }
            s.close();
            c.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return attendance;
    }

    // Implement methods to calculate pay details

    public void calculatePayDetails(int empId) {
        // Implement the logic to calculate pay details
        // You can retrieve relevant data from Employee and EmployeeAttendance tables
    }
}
