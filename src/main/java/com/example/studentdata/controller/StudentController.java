package com.example.studentdata.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentdata.model.Student;
import com.example.studentdata.repositary.StudentRepo;

/*Question : Create a java application to implement CRUD operation to get student data from the database using Java and Spring framework.  
1.Add new student.(i.e page for adding a student)
2.Edit student. (i.e page for editing a student)
3.Display all student records (StudentName, Age, Class) (i.e page for displaying all students)
4.Provision to delete a student record. ((i.e page for deleting a student)

Expected output from candidate: Candidate is expected to share the complete project details including java code, configuration, and DB tables with below running UI code.
*/

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	StudentRepo studentrepo;
	//1.Add new student
	@PostMapping("/createStudents")
	public ResponseEntity<String> createStudents(@RequestBody List<Student> students){
		
		studentrepo.saveAll(students);
		return new ResponseEntity<>("New Students CREATED successfully",HttpStatus.CREATED);
		
	}
	
	//2. Edit student
	@PutMapping("/editstudent")
	public ResponseEntity<String> editStudent(@RequestBody List<Student> students){
		studentrepo.saveAll(students);
		return new ResponseEntity<> ("Student UPDATED successfully",HttpStatus.ACCEPTED);
		
	}
	
	//3.Display all student records
	@GetMapping("/displayallstudents")
	public ResponseEntity<List<Student>> getallStudents(){
		List<Student> findAll = studentrepo.findAll();
		return new ResponseEntity<> (findAll,HttpStatus.OK);
		
	}
	
	//4.Provision to delete a student record.
	@DeleteMapping("/deletestudent/{studentname}")
	public ResponseEntity<String> deletestudent(@PathVariable String studentname ){
		studentrepo.deleteById(studentname);
		
		return new ResponseEntity<String> ("Removed  Student successfully",HttpStatus.OK);
		
	}
	
	//4.Display  student record as per name
		@GetMapping("/displaystudent/{name}")
		public ResponseEntity<Student> getallStudents(@PathVariable String name){
			
		Optional<Student> optionalEntity = studentrepo.findById(name);
		
		Student s = optionalEntity.get();
		
			return new ResponseEntity<> (s,HttpStatus.OK);
			
		}
	
	
	
	
	
	
	
	


}
