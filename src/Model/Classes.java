/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentdaytwo.Model;

/**
 *
 * @author lenovo
 */
public class Classes {
    private Integer id;
	private Character name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Character getName() {
		return name;
	}

	public void setName(Character name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Classes [id=" + id + ", name=" + name + "]";
	}

}
