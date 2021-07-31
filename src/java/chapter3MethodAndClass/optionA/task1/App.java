package chapter3MethodAndClass.optionA.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Khai", "Mike", "Igorowuch", 1996,
                "lviv,", 380961909999l, "1", "101", "1001" );
        Student student2 = new Student(2, "fsdaf", "sdfa", "sdfad", 1994,
                "lviv,", 380961909999l, "1", "101", "1001" );
        Student student3 = new Student(3, "ZCZzC", "CZC", "ZXCcxz", 1998,
                "lviv,", 380961909999l, "2", "102", "1002" );
        Student student4 = new Student(4, "sadfAS", "ASFD", "ASFAS", 1993,
                "lviv,", 380961909999l, "3", "103", "1003" );
        Student student5 = new Student(5, "asd", "DASSC", "ASD", 1999,
                "lviv,", 380961909999l, "3", "103", "1003" );
        Student[] students = {student1,student2,student3,student4,student5};
        List<Student> studentList = new ArrayList<Student>(Arrays.asList(students));
        FilterStudent filterStudent = new FilterStudent();

//        filterStudent.printStudentsInFaculty(studentList, "3");
//        filterStudent.printStudentsAfterYear(studentList, 1995);
        filterStudent.printStudentInGroup(studentList, "1003");


    }
}
