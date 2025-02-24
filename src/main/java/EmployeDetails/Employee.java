package EmployeDetails;
import java.util.Date;
public class Employee {
    private int empId;
    private String empName;
    private Date dob;
    private Date doj;

    public Employee(int empId,String empName,Date dob,Date doj){
        this.empId=empId;
        this.empName=empName;
        this.dob=dob;
        this.doj=doj;
    }
    public int getEmpId(){
        return empId;
    }
    public void setEmpId(int empId){
        this.empId=empId;
    }
    public String getEmpName(){
        return empName;
    }
    public void setEmpName(String empName){
        this.empName=empName;
    }
    public Date getDob(){
        return dob;
    }
    public void setDob(Date dob){
        this.dob=dob;
    }
    public Date getDoj(){
        return doj;
    }
    public void setDoj(Date doj){
        this.doj=doj;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", dob=" + dob +
                ", doj=" + doj +
                '}';
    }
}
