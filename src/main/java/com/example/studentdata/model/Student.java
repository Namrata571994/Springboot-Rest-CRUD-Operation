package com.example.studentdata.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/*Question : Create a java application to implement CRUD operation to get student data from the database using Java and Spring framework.  
1.Add new student.(i.e page for adding a student)
2.Edit student. (i.e page for editing a student)
3.Display all student records (StudentName, Age, Class) (i.e page for displaying all students)
4.Provision to delete a student record. ((i.e page for deleting a student)

Expected output from candidate: Candidate is expected to share the complete project details including java code, configuration, and DB tables with below running UI code.
*/

@Entity
public class Student {
	
	@Id
	@Column(name="STUDENT_NAME")
	private String studentname;
	
	@Column(name="AGE")
	private int age;
	
	@Column(name="CLASS")
	private int studentclass;

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getStudentclass() {
		return studentclass;
	}

	public void setStudentclass(int studentclass) {
		this.studentclass = studentclass;
	}
	
	

}
