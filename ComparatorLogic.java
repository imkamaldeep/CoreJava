package Comparator;

import java.util.*;
//Pojo class
class Student {
    private int marks;
    private String name;
    private int year;

    // Constructor
    public Student(String name, int marks, int year)
    {
        this.name = name;
        this.marks = marks;
        this.year = year;
    }

    // Getter methods for accessing private data
    public int getMarks() { return marks; }
    public String getName() { return name; }
    public int getYear()    { return year; }
}
// Sorting Class ByYear
class SortByYear implements Comparator<Student> {

    public int compare(Student student1, Student student2) {
        return student1.getYear() - student2.getYear();

    }

}

// Sorting class ByMarks
class SortByMarks implements Comparator<Student> {

    public int compare(Student student1, Student student2) {
        return student1.getMarks() - student2.getMarks();
    }

}

// Main class
public class ComparatorLogic
{
    public static void main(String[] args)
    {
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("John Mayer", 89, 2015));
        studentList.add(new Student("Doja Cat", 87, 1977));
        studentList.add(new Student("Eric Clapton", 85, 1980));
        studentList.add(new Student("Andrew NG", 86, 1983));
        Collections.sort(studentList, new SortByMarks());

        System.out.println("Students after sorting based on age: ");
        for (Student student: studentList)
        {
            System.out.println(student.getName() + " " +
                    student.getMarks() + " " +
                    student.getYear());
        }
        Collections.sort(studentList, new SortByYear());

        System.out.println("Students after sorting based on year  : ");
        for (Student student: studentList)
        {
            System.out.println(student.getName() + " " +
                    student.getMarks() + " " +
                    student.getYear());
        }
    }
}