package models.entities;

public class DepartmentEnti {
    private String Dept_Id;
    private String Name;
    private String Duties;
    private String Employee_Number;
    private String Time;
    private String Date;

    public String getDept_Id() {
        return Dept_Id;
    }

    public DepartmentEnti setDept_Id(String dept_Id) {
        Dept_Id = dept_Id;
        return this;
    }

    public String getName() {
        return Name;
    }

    public DepartmentEnti setName(String name) {
        Name = name;
        return this;
    }

    public String getDuties() {
        return Duties;
    }

    public DepartmentEnti setDuties(String duties) {
        Duties = duties;
        return this;
    }

    public String getEmployee_Number() {
        return Employee_Number;
    }

    public DepartmentEnti setEmployee_Number(String employee_Number) {
        Employee_Number = employee_Number;
        return this;
    }

    public String getTime() {
        return Time;
    }

    public DepartmentEnti setTime(String time) {
        Time = time;
        return this;
    }

    public String getDate() {
        return Date;
    }

    public DepartmentEnti setDate(String date) {
        Date = date;
        return this;
    }
}
