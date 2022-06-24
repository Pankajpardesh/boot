package com.nt.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.nt.Model.Course;
import com.nt.Model.Student;
import com.nt.repo.StudentRepository;

@Service
public class StudentService {

	
	@Autowired
	private StudentRepository studentRepo;
	
	public List<Student> findAll(){
		return studentRepo.findAll();
		
	}
	@Transactional
	public Student save(Student student) {
		return studentRepo.save(student);
		
	}
	
	
}
	
	
}
