/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Part2;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author lenovo
 */
public class Method {
    
    public static void countMaleAndFemale(List<Employee> empList){
        Long maleCount = empList.stream().filter(e->e.getGender().equalsIgnoreCase("Male")).count();
        Long femaleCount = empList.stream().filter(e->e.getGender().equalsIgnoreCase("Female")).count();
        System.out.println("Male Employee : "+maleCount);
        System.out.println("Female Employee :"+femaleCount);   
    }
    
    public static void getDepartment(List<Employee> empList){
        Set<String> dptList = empList.stream().map(e->e.getDepartment()).collect(Collectors.toSet());
        dptList.forEach(System.out::println);
    }
    
    public static void averageAge(List<Employee> empList){
        double avgMale = empList.stream().filter(e->e.getGender().equalsIgnoreCase("Male")).mapToInt(e->e.getAge()).average().orElse(0);
        double avgFemale = empList.stream().filter(e->e.getGender().equalsIgnoreCase("Female")).mapToInt(e->e.getAge()).average().orElse(0);
        
        System.out.println("Average Male Employee :"+avgMale);
        System.out.println("Average Female Employee :"+avgFemale);
        
    }
    
    public static void highestPaidEmployee(List<Employee> empList){
//        Optional<Employee> employee = empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst();
//        System.out.println("Highest paid Employee details : \n" + employee);
        
        Employee employee = empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst().get();
        System.out.println("Highest paid Employee details : \n" + employee);
    }
    
    public static void employeesJoinedAfter2015(List<Employee> empList,Integer year){
         List<String> employee = empList.stream().filter(e->e.getYearOfJoining()>year).map(e->e.getName()).collect(Collectors.toList());
         employee.forEach(System.out::println);
    }
    
    public static void countDept(List<Employee> empList){
         Map<String,Long> countDept = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
         countDept.forEach((department,count)->System.out.println("Department :" +department +"\nCount :"+count+"\n"));
    }
    
    public static void avgSalaryOfEachDept(List<Employee> empList){
        Map<String,Double> avgSalaryByDept = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        avgSalaryByDept.forEach((department,avgSalary)->System.out.println("Department :" +department +"\nAverage Salary :"+avgSalary+"\n"));
    }
    
    public static void youngestMale(List<Employee> empList,String dept){
        Employee youngestMale = empList.stream().filter(e->e.getDepartment().equals(dept)).filter(e->e.getGender().equalsIgnoreCase("female")).sorted(Comparator.comparing(Employee::getAge)).findFirst().get();
        System.out.println(youngestMale);
    }
    
    public static void employeesInSalesAndMarketing(List<Employee> empList){
             Long maleEmp = empList.stream().filter(e->e.getDepartment().equalsIgnoreCase("Sales and Marketing")).filter(e->e.getGender().equalsIgnoreCase("Male")).count();
             Long femaleEmp = empList.stream().filter(e->e.getDepartment().equalsIgnoreCase("Sales and Marketing")).filter(e->e.getGender().equalsIgnoreCase("Female")).count();
             System.out.println("Male Employee In Sales and Marketing : "+maleEmp);
             System.out.println("Female Employee In Sales and Marketing : "+femaleEmp);
     }
    
    public static void avgSalaryOfMaleAndFemale(List<Employee> empList){
       double avgSalaryMale = empList.stream().filter(e->e.getGender().equalsIgnoreCase("Male")).mapToDouble(e->e.getSalary()).average().orElse(0);
       double avgSalaryFemale = empList.stream().filter(e->e.getGender().equalsIgnoreCase("Female")).mapToDouble(e->e.getSalary()).average().orElse(0);
      System.out.println(avgSalaryMale);
      System.out.println(avgSalaryFemale);
      
    }
    
     public static void nameEmpInEachDept(List<Employee> empList){
        Map<String,List<String>> e = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName,Collectors.toList())));
        e.forEach((department,name)->System.out.println("Department :" +department +"\nName :"+name+"\n"));
     }
    
      public static void averageAndTotalSalary(List<Employee> empList){
          double avgSalary = empList.stream().mapToDouble(e->e.getSalary()).average().orElse(0);
          double totalSalary = empList.stream().mapToDouble(e->e.getSalary()).sum();
          System.out.println(avgSalary);
          System.out.println(totalSalary);
          
      }
      
      public static void separateTheEmployees(List<Employee> empList){
          List<Employee> otherThan25 =  empList.stream().filter(e->e.getAge()>25).collect(Collectors.toList());
           List<Employee> youngerThan25 =  empList.stream().filter(e->e.getAge()<=25).collect(Collectors.toList());
           otherThan25.forEach(System.out::println);
           System.out.println();
           System.out.println("Younger Than 25");
           youngerThan25.forEach(System.out::println);
      }
      
      public static void oldestEmployee(List<Employee> empList){
          Employee employee = empList.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).findFirst().get();
           System.out.println("Age :"+employee.getAge() +" "+" Department :"+employee.getDepartment());
      }
    
    
    

}
