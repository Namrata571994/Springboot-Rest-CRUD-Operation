package com.example.studentdata.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.studentdata.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, String> {
	
	
	

}
