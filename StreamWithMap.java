package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


class Employee{

    public Employee(String id, String name, Integer salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    String id;
    String name;
    Integer salary;

        }

public class StreamWithMap {

    public static void main(String args[]) {

List<Employee> emp = Arrays.asList(
  new Employee("1","DayaVandant",340000),
        new Employee("1","kamakKant",230000),
        new Employee("1","Vijesh",940000),
        new Employee("1","Ankush",440000)

);

 List<Integer> filterWithMapList =  emp.stream().filter(e-> e.salary>50000).map(e->e.salary).toList();

    }
}
