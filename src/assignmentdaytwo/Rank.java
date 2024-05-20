/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentdaytwo;

import Model.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//Rank
public class Rank {
    
    public static List<Student> StudentRanking(List<Student> studentList){
       
        List<Student> student = studentList.stream().sorted((a,b)->(b.getMarks()).compareTo(a.getMarks())).collect(Collectors.toList());
       
        Integer studentlen = student.size();
         for(int i=0;i<studentlen;i++){
             if(i==0){
                 student.get(i).setStatus("First");
             }
             else if(i==1){
                 student.get(i).setStatus("Second");
             }
             else if(i==2){
                 student.get(i).setStatus("Third");
             }
             else if(student.get(i).getMarks()>50){
                 student.get(i).setStatus("Pass");
             }
             else{
                 student.get(i).setStatus("Fail");
             }
         }
        return student;
    }
}
