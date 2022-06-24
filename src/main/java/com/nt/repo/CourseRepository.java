package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.Model.Course;
import com.nt.Model.Student;


@Repository
public interface CourseRepository extends JpaRepository<Course,Integer>{


	
	
}
