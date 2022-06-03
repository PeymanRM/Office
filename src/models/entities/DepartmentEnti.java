package models.entities;

public class DepartmentEnti
{
    private String id,name,duties,time,date;

    public String getId() {
        return id;
    }

    public DepartmentEnti setId(String id) {
        this.id = id;
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

    public String getTime() {
        return time;
    }

    public DepartmentEnti setTime(String time) {
        this.time = time;
        return this;
    }

    public String getDate() {
        return date;
    }

    public DepartmentEnti setDate(String date) {
        this.date = date;
        return this;
    }
}
