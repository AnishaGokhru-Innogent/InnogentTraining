/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentdaytwo;

import Model.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class Pass {
    public static List<Student> StudentPassed(List<Student> studentList , Character gender,Integer age, Integer classId,Integer pincode,String city){
        List<Student> rankStudent = Rank.StudentRanking(studentList);
        List<Student> passedStudent = Filter.passStuFilterByGenderAgeClass(rankStudent,age,classId,gender);
        List<Integer> studentId = Filter.passStuIdByCityPincode(city,pincode); 
        List<Student> student  = new ArrayList<Student>();
        for(Student s :passedStudent){
            if(studentId.contains(s.getId())){
                student.add(s);
            }
        }
        return student;
        
    }
}
