package com.example.learning;
import jakarta.persistence.*;

@Entity
@Table(name="lessons")

public class LessonModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	Integer id;
	@Column(name = "course_id")
	String course_id;
	@Column(name = "lesson_name")
	String lesson_name; 
	@Column(name = "lesson_description")
	String lesson_description;
	@Column(name = "lesson_type")
	String lesson_type;
	@Column(name = "lesson_url")
	String lesson_url;
	@Column(name = "created_at")
	String created_at;
	@Column(name = "updated_at")
	String updated_at;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public String getLesson_name() {
		return lesson_name;
	}
	public void setLesson_name(String lesson_name) {
		this.lesson_name = lesson_name;
	}
	public String getLesson_description() {
		return lesson_description;
	}
	public void setLesson_description(String lesson_description) {
		this.lesson_description = lesson_description;
	}
	public String getLesson_type() {
		return lesson_type;
	}
	public void setLesson_type(String lesson_type) {
		this.lesson_type = lesson_type;
	}
	public String getLesson_url() {
		return lesson_url;
	}
	public void setLesson_url(String lesson_url) {
		this.lesson_url = lesson_url;
	}
	public String getcreated_at() {
		return created_at;
	}
	public void setcreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getupdated_at() {
		return updated_at;
	}
	public void setupdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	
	
}
