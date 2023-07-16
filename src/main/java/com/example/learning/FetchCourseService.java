package com.example.learning;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FetchCourseService extends JpaRepository<CourseModel, Integer> {

	@Override
	public List<CourseModel> findAll();
		
}
