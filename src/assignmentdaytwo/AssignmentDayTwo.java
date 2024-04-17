	
package assignmentdaytwo;

import Model.Student;

import assignmentdaytwo.Model.Address;
import assignmentdaytwo.Model.Classes;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class AssignmentDayTwo {
    public static List<Student> studentList = new ArrayList<Student>();
    public static List<Classes> classList = new ArrayList<Classes>();
    public static List<Address> addressList = new ArrayList<Address>();  

	public static void main(String[] args) throws IOException {
//		upload the csv data files
		Upload.uploadStudent(new File("C:\\Users\\lenovo\\Documents\\NetBeansProjects\\AssignmentDayTwo\\src\\CSVFiles\\Student.csv"));
                Upload.uploadClass(new File("C:\\Users\\lenovo\\Documents\\NetBeansProjects\\AssignmentDayTwo\\src\\CSVFiles\\Class.csv"));
                Upload.uploadAddress(new File("C:\\Users\\lenovo\\Documents\\NetBeansProjects\\AssignmentDayTwo\\src\\CSVFiles\\Address.csv"));

                //Filter By Gender
//		List<Student> gender = Filter.filterByGender('F');
//              gender.forEach(System.out::println);

                //Filter By City
//                List<Student> city = Filter.filterByCity("indore");
//                city.forEach(System.out::println);

                //Filter By Pincode
//                List<Student> pincode = Filter.filterByPincode(452002);
//                pincode.forEach(System.out::println);
                
                
                //Filter By Age
//                List<Student> age = Filter.filterByAge(11);
//                age.forEach(System.out::println);

//               Filter By Class
//                List<Student> c= Filter.filterByClass('A');
//                c.forEach(System.out::println);


                
//		1.Find all students of pincode X(ex X = 482002). I can pass different filters like gender, age, class
                List<Student> pincode = Filter.filterByPincode(482002);
//                pincode.forEach(System.out::println);
                
                //Pincode Filtered by gender
                List<Student> gender = Filter.filterByGender(pincode,'F');
//                gender.forEach(System.out::println);
                
//              Pincode Filtered by Age
                List<Student> age = Filter.filterByAge(pincode,22);
                age.forEach(System.out::println);
                
                
                
//	;	2.Find all students of city ex X = Indore. I can pass different filters like gender, age, class
//		List<Student> city = Filter.getByCity("indore", 'F', 10, 1);
//              city.forEach(System.out::println);

//		3.marks < 50 failed else passed
//		Give ranks to highest mark achievers.
//		Highest marks - First
//		Third Highest marks - third
//		Rest of all pass / fail
//                List<Student> rank = Rank.StudentRanking(studentList);
//                rank.forEach(System.out::println);

//		4.Get the passed students. I can pass different filters like gender, age, class, city, pincode
//		List<Student> passedStudent = Pass.StudentPassed(studentList, 'F', 11, 1, 442002,"indore");
//		passedStudent.forEach(System.out::println);
                
                

//		5.Get the failed students. I can pass different filters like gender, age, class, city, pincode
//		List<Student> failedStudent = FailedStudent.getFailStudent(studentList, 'F', 35, 3, "mumbai", 482002);
//		failedStudent.forEach(System.out::println);

//		6.Find all student of class X (ex X = A).  I can pass different filters like gender, age, class, city, pincode
//		List<Student> classStudent = ClassStudent.getStudentByClass(studentList, 'A', 'F', 35, "indore", 452002);
//		classStudent.forEach(System.out::println);

//		7.It should fail if student record is having age > 20.
//		List<Student> failedStudentByAge = Ranking.failStudentByAge(20);
//		studentList.forEach(System.out::println);

//		8.I should be able to delete student. After that it should delete the respective obj from Address & Student.
//		System.out.println(deleteStudent(1));
//		studentList.forEach(System.out::println);
//		addList.forEach(System.out::println);

//		9.I should be able to delete student. After that it should delete the respective obj from Address & Student.

//		10	If there is no student remaining in that class. Class should also be deleted.
//		System.out.println(deleteClass());
//		classList.forEach(System.out::println);

//		11	I should be able to read paginated students.
//		like : read female students first 1-9
//		like : read female students first 7-8 order by name	
//		like : read female students first 1-5 order by marks
//		like : read female students first 9-50 order by marks
//		getSortedStudentByOrder(studentList, 'F', 1, 4, "marks", false).forEach(System.out::println);;
		
//		List<Student> studList, Character gender, int start, int end, String sortBy, boolean ReverseOrder

	}

    
}


