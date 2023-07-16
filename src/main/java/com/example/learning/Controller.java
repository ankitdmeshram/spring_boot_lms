package com.example.learning;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.learning.FetchCourseService;
import com.example.learning.FetchLessonService;
import com.example.learning.FetchOrderService;

@RestController
public class Controller {
	
	@Autowired
	FetchCourseService fetchCourseService;
	@Autowired
	FetchLessonService fetchLessonService;
	@Autowired
	FetchOrderService fetchOrderService;
	
    @CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(path="courses")
	List<CourseModel> getCourses() {
		return fetchCourseService.findAll();
	}
    
    @CrossOrigin(origins = "http://localhost:4200")
  	@GetMapping(path="lessons")
  	List<LessonModel> getLessons() {
  		return fetchLessonService.findAll();
  	}
    
    @CrossOrigin(origins = "http://localhost:4200")
  	@GetMapping(path="myorders")
  	List<OrderModel> getOrders() {
  		return fetchOrderService.findAll();
  	}
	
}
