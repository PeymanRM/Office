package models.entities;

public class EmployeeEnti {
    private String id, name, fatherName, address, phone, landLine, degree, position;
    private int salary, deptId, age;

    public String getId() {
        return id;
    }

    public EmployeeEnti setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public EmployeeEnti setName(String name) {
        this.name = name;
        return this;
    }

    public String getFatherName() {
        return fatherName;
    }

    public EmployeeEnti setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public EmployeeEnti setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public EmployeeEnti setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getLandLine() {
        return landLine;
    }

    public EmployeeEnti setLandLine(String landLine) {
        this.landLine = landLine;
        return this;
    }

    public String getDegree() {
        return degree;
    }

    public EmployeeEnti setDegree(String degree) {
        this.degree = degree;
        return this;
    }

    public String getPosition() {
        return position;
    }

    public EmployeeEnti setPosition(String position) {
        this.position = position;
        return this;
    }

    public int getSalary() {
        return salary;
    }

    public EmployeeEnti setSalary(int salary) {
        this.salary = salary;
        return this;
    }

    public int getDeptId() {
        return deptId;
    }

    public EmployeeEnti setDeptId(int deptId) {
        this.deptId = deptId;
        return this;
    }

    public int getAge() {
        return age;
    }

    public EmployeeEnti setAge(int age) {
        this.age = age;
        return this;
    }
}
