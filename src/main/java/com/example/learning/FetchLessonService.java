package com.example.learning;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FetchLessonService extends JpaRepository<LessonModel, Integer> {

	@Override
	public List<LessonModel> findAll();
	
}
