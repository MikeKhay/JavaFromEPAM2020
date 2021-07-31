package chapter3MethodAndClass.optionA.task1;


import java.util.List;
import java.util.stream.Stream;

public class FilterStudent {
    public void printStudentsInFaculty(List<Student> list, String text){
        list.stream().filter(a -> a.getFaculty().equalsIgnoreCase(text)).forEach(System.out::println);
    }

    public void printStudentsAfterYear(List<Student> list, int year){
        list.stream().filter(a -> a.getDateOfBirth() > year).forEach(System.out::println);
    }

    public void printStudentInGroup(List<Student> list, String text){
        list.stream().filter(a -> a.getGroup().equalsIgnoreCase(text)).forEach(System.out::println);
    }
}
