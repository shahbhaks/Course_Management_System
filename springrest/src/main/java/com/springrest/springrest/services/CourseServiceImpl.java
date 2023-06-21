package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDAO;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	//List<Course> list;
	@Autowired
	private CourseDAO courseDao;
	
	public CourseServiceImpl() {
//		list=new ArrayList<>();
//		list.add(new Course(123,"Java Course","This is java course",3));
//		list.add(new Course(213,"SpringBoot Course","This is Spring course",4));
		
		
	}

	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Course getCourse(int courseId) {

//		Course c=null;
//		for(Course course:list) {
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//		}
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		//list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
//		list.forEach(e->{
//			if(e.getId()==course.getId()) {
//				e.setName(course.getName());
//				e.setDescription(course.getDescription());
//				e.setDuration(course.getDuration());
//				
//			}
//		});
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(int parseInt) {
		//list=this.list.stream().filter(e->e.getId()!=parseInt).collect(Collectors.toList());
		Course entity=courseDao.getOne(parseInt);
		courseDao.delete(entity);
	}
	

}
