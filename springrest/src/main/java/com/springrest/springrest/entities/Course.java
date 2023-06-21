package com.springrest.springrest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="course_info")
public class Course {

	@Id
	private int id;
	private String name;
	private String description;
	private int duration;
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", description=" + description + ", duration=" + duration + "]";
	}
	
	
	public Course(int id, String name, String description, int duration) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.duration = duration;
	}


	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}


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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
}
