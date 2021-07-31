package chapter3MethodAndClass.optionA.task1;

import java.math.BigInteger;

public class Student {
    private int id;
    private String lastName;
    private String firstName;
    private String patronymic;
    private int dateOfBirth;
    private String address;
    private long numberPhone;
    private String faculty;
    private String course;
    private String group;

    public Student(int id, String lastName, String firstName, String patronymic, int dateOfBirth, String address, long numberPhone, String faculty, String course, String group) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.numberPhone = numberPhone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public long getNumberPhone() {
        return numberPhone;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address='" + address + '\'' +
                ", numberPhone=" + numberPhone +
                ", faculty='" + faculty + '\'' +
                ", course='" + course + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
