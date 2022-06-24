package com.nt.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Student {

	
	@Id
	@GeneratedValue
	private int id;
	
	
	@Column
	private String name;
	@Column
	private String Email;
	@Column
	private Long mobNo;
	
	@ManyToMany
	@JoinTable(name="Student_Course",@JoinColumn=@JoinColumn(name="Student_id"),
	inverseJoinColumn=@JoinColumn(name="course_id"))
	private List<Course> course=new ArrayList<>();

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Long getMobNo() {
		return mobNo;
	}
	public void setMobNo(Long mobNo) {
		this.mobNo = mobNo;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Email=" + Email + ", mobNo=" + mobNo + ", course=" + course
				+ "]";
	}
	
}
