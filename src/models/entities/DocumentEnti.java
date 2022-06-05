package models.entities;

public class DocumentEnti {
    private String name,subject,nameOfReceiver,nameOfSender,time,date;
    private int id;

    public int getId() {
        return id;
    }

    public DocumentEnti setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public DocumentEnti setName(String name) {
        this.name = name;
        return this;
    }

    public String getSubject() {
        return subject;
    }

    public DocumentEnti setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public String getNameOfReceiver() {
        return nameOfReceiver;
    }

    public DocumentEnti setNameOfReceiver(String nameOfReceiver) {
        this.nameOfReceiver = nameOfReceiver;
        return this;
    }

    public String getNameOfSender() {
        return nameOfSender;
    }

    public DocumentEnti setNameOfSender(String nameOfSender) {
        this.nameOfSender = nameOfSender;
        return this;
    }

    public String getTime() {
        return time;
    }

    public DocumentEnti setTime(String time) {
        this.time = time;
        return this;
    }

    public String getDate() {
        return date;
    }

    public DocumentEnti setDate(String date) {
        this.date = date;
        return this;
    }
}
