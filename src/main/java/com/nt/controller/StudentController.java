package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nt.Model.Course;
import com.nt.Model.Student;
import com.nt.service.CourseService;
import com.nt.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentservice;
	
	@Autowired
	private CourseService = new courseService;
	
	@GetMapping("/add")
	public String add(Model model) {
		Student student=new Student();
		model.addAttribute("student",student);
		
		return "Student-form";
	}
	
	@GetMapping("")
	public String findAll(Model model) {
		List<Student> student=studentservice.findAll();
		model.addAttribute("student",student);
		
		return "Student-list";
	}
	@GetMapping("/{sid}/adddcourse")
	public String addCourse(@PathVariable("sid") int sid,@RequestParam("cid") int cid) {
			Student student=studentservice.findById(sid);
			Course course=courseService.findById(cid);
		
	
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("student") Student student) {
		studentservice.save(student);
		
		return "redirect:/Students";
	}
	
	
	
}
