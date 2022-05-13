package models.entities;
public class EmployeeEnti {
    private int Id;
    private String Full_name;
    private String Father_name;
    private int Age;
    private String Address;
    private String Degree;
    private String Landline;
    private String Phone;
    private int Dept_Id;
    private String Position;
    private int Salary;

    public int getId() {
        return Id;
    }

    public EmployeeEnti setId(int id) {
        Id = id;
        return this;
    }

    public String getFull_name() {
        return Full_name;
    }

    public EmployeeEnti setFull_name(String full_name) {
        Full_name = full_name;
        return this;
    }

    public String getFather_name() {
        return Father_name;
    }

    public EmployeeEnti setFather_name(String father_name) {
        Father_name = father_name;
        return this;
    }

    public int getAge() {
        return Age;
    }

    public EmployeeEnti setAge(int age) {
        Age = age;
        return this;
    }

    public String getAddress() {
        return Address;
    }

    public EmployeeEnti setAddress(String address) {
        Address = address;
        return this;
    }

    public String getDegree() {
        return Degree;
    }

    public EmployeeEnti setDegree(String degree) {
        Degree = degree;
        return this;
    }

    public String getLandline() {
        return Landline;
    }

    public EmployeeEnti setLandline(String landline) {
        Landline = landline;
        return this;
    }

    public String getPhone() {
        return Phone;
    }

    public EmployeeEnti setPhone(String phone) {
        Phone = phone;
        return this;
    }

    public int getDept_Id() {
        return Dept_Id;
    }

    public EmployeeEnti setDept_Id(int dept_Id) {
        Dept_Id = dept_Id;
        return this;
    }

    public String getPosition() {
        return Position;
    }

    public EmployeeEnti setPosition(String position) {
        Position = position;
        return this;
    }

    public int getSalary() {
        return Salary;
    }

    public EmployeeEnti setSalary(int salary) {
        Salary = salary;
        return this;
    }

}
