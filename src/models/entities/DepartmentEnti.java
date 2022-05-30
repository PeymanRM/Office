package models.entities;

public class DepartmentEnti
{
    private String deptId,name,duties,employeeNumber;
    private int time,date;

    public String getDeptId() {
        return deptId;
    }

    public DepartmentEnti setDeptId(String deptId) {
        this.deptId = deptId;
        return this;
    }

    public String getName() {
        return name;
    }

    public DepartmentEnti setName(String name) {
        this.name = name;
        return this;
    }

    public String getDuties() {
        return duties;
    }

    public DepartmentEnti setDuties(String duties) {
        this.duties = duties;
        return this;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public DepartmentEnti setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
        return this;
    }

    public int getTime() {
        return time;
    }

    public DepartmentEnti setTime(int time) {
        this.time = time;
        return this;
    }

    public int getDate() {
        return date;
    }

    public DepartmentEnti setDate(int date) {
        this.date = date;
        return this;
    }
}
