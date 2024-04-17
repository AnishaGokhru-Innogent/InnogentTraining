/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentdaytwo;

import Model.Student;
import static assignmentdaytwo.AssignmentDayTwo.addressList;
import static assignmentdaytwo.AssignmentDayTwo.classList;
import static assignmentdaytwo.AssignmentDayTwo.studentList;
import assignmentdaytwo.Model.Address;
import assignmentdaytwo.Model.Classes;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author lenovo
 */
public class Upload {
    public static void uploadStudent(File file) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = "";

		// skipping the first line
		line = br.readLine();

		while ((line = br.readLine()) != null) {
			String[] studentArr = line.split(",");
			Student student1 = new Student();
			student1.setId(Integer.parseInt(studentArr[0]));
			student1.setName(studentArr[1]);
			student1.setClass_id(Integer.parseInt(studentArr[2]));
			student1.setMarks(Integer.parseInt(studentArr[3]));
			student1.setGender(studentArr[4].toCharArray()[0]);
			student1.setAge(Integer.parseInt(studentArr[5]));
			studentList.add(student1);
		}

//		studentList.stream().forEach(System.out::println);

		br.close();
	}

	public static void uploadClass(File file) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(file));

		// skipping the first line
		String line = br.readLine();

		while ((line = br.readLine()) != null) {
			String[] classArr = line.split(",");
			Classes classes = new Classes();
			classes.setId(Integer.parseInt(classArr[0]));
			classes.setName(classArr[1].toCharArray()[0]);
			classList.add(classes);
		}
//		classList.stream().forEach(System.out::println);
		br.close();
	}

	public static void uploadAddress(File file) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(file));

		// skipping the first line
		String line = br.readLine();

		while ((line = br.readLine()) != null) {
			String[] addArr = line.split(",");
			Address add = new Address();
			add.setId(Integer.parseInt(addArr[0]));
			add.setPin_code(Integer.parseInt(addArr[1]));
			add.setCity(addArr[2]);
			add.setStudent_id(Integer.parseInt(addArr[3]));
			addressList.add(add);
		}

//		addressList.stream().forEach(System.out::println);
		br.close();
	}
}
