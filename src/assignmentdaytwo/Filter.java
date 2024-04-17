package assignmentdaytwo;
import Model.Student;
import static assignmentdaytwo.AssignmentDayTwo.addressList;
import static assignmentdaytwo.AssignmentDayTwo.classList;
import static assignmentdaytwo.AssignmentDayTwo.studentList;
import assignmentdaytwo.Model.Address;
import assignmentdaytwo.Model.Classes;
import java.util.ArrayList;
import java.util.List;


public class Filter {
    
            public static List<Student> filterByCity(String city){
                List<Student> student = new ArrayList<Student>();
                List<Integer> studentId = new ArrayList<Integer>();
                
                for(Address address: addressList){
                    if(address.getCity().equals(city)){
                        studentId.add(address.getStudent_id());
                    }
                }
                
                for(Student s :studentList){
                    if(studentId.contains(s.getId())){
                        student.add(s);
                    }
                }
                return student;
            }
            
            //Filter By Pincode
             public static List<Student> filterByPincode(Integer pincode){
            List<Student> student = new ArrayList<Student>();
            List<Integer> studentId = new ArrayList<Integer>();
            
            for(Address address : addressList){
                if(address.getPin_code()==pincode){
                    studentId.add(address.getStudent_id());
                }
            }
            
            for(Student s :studentList){
                if(studentId.contains(s.getId())){
                        student.add(s);
                }
            }     
//            studentId.stream().forEach(System.out::println);
             return student;
          }
             
           //Filter By Age
           public static List<Student> filterByAge(List<Student> studentList ,Integer age){
            List<Student> student = new ArrayList<Student>();
           
            for(Student s :studentList){
                if(s.getAge()==age){
                        student.add(s);
                }
            }     
//            studentId.stream().forEach(System.out::println);
             return student;
          }
             
           //Filter By Classname
            public static List<Student> filterByClass(Character className){
            List<Student> student = new ArrayList<Student>();
            List<Integer> classId = new ArrayList<Integer>();
           
            for(Classes c :classList){
                if(c.getName().equals(className)){
                        classId.add(c.getId());
                }
            }  
            
            for(Student s :studentList){
                if(classId.contains(s.getClass_id())){
                    student.add(s);
                }
            }
//            studentId.stream().forEach(System.out::println);
             return student;
          }
           
//          (Without Stream........)
            public static List<Student> getByCity(String city,Character gender, Integer age, Integer classes){
            List<Student> student = new ArrayList<Student>();
            List<Integer> studentId = new ArrayList<Integer>();
            
            for(Address address : addressList){
                if(address.getCity().equals(city)){
                    studentId.add(address.getStudent_id());
                }
            }
            
            for(Student s : studentList){
                if(studentId.contains(s.getId())){
                     if(s.getGender()==gender && s.getAge()==age && s.getClass_id() == classes){
                         student.add(s);
                     }
                }
            }
            return student; 
        }
             
//       Filter By Gender
        public static List<Student> filterByGender(List<Student> studentList , Character gender){
            List<Student> student = new ArrayList<Student>();
            
            for(Student s : studentList){
                if(s.getGender()== gender){
                    student.add(s);
                }
            }
            return student;
        }
        
//        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        
        
        //Without Stream
        public static List<Student> getByPincode(Integer pincode, Character gender, Integer age, Integer classes){
            List<Student> student = new ArrayList<Student>();
            List<Integer> studentId = new ArrayList<Integer>();
            
            for(Address address : addressList){
                if(address.getPin_code()==pincode){
                    studentId.add(address.getStudent_id());
                }
            }
            
            for(Student s :studentList){
                if(studentId.contains(s.getId())){
                    if(s.getGender()==gender && s.getAge()==age && s.getClass_id()==classes){
                        student.add(s);
                    }
                }
            }     
//            studentId.stream().forEach(System.out::println);
            return student;
            
        }
        
        public static List<Student> passStuFilterByGenderAgeClass(List<Student> studentList,Integer age,Integer classId,Character gender){
            List<Student> student = new ArrayList<Student>();
           
            for(Student s:studentList){
              if(s.getGender()==gender && s.getAge()==age && s.getClass_id()==classId){
                  student.add(s);
              }
            }
            return student;
        }
        
        public static List<Integer> passStuIdByCityPincode(String city,Integer pincode){
            List<Integer> studentId = new ArrayList<Integer>();
            
            for(Address address: addressList ){
                if(address.getPin_code()==pincode && address.getCity().equals(city)){
                    studentId.add(address.getStudent_id());
                }
            }
            return studentId;
            
            
        }
}
