package EmployeDetails;

public class EmployeeAttendance {
    private int empId;
    private String empName;
    private int daysPresent;
    public EmployeeAttendance(int empId, String empName, int daysPresent){
        this.empId=empId;
        this.empName=empName;
        this.daysPresent=daysPresent;
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
    public int getDaysPresent(){
        return daysPresent;
    }
    public void setDaysPresent(int daysPresent){
        this.daysPresent=daysPresent;
    }
}
