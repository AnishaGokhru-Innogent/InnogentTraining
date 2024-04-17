/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentdaytwo.Model;

/**
 *
 * @author lenovo
 */
public class Address {
    private Integer id;
	private Integer pin_code;
	private String city;
	private Integer student_id;

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", pin_code=" + pin_code + ", city=" + city + ", student_id=" + student_id + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPin_code() {
		return pin_code;
	}

	public void setPin_code(int pin_code) {
		this.pin_code = pin_code;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

}
