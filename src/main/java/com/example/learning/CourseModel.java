package com.example.learning;

import jakarta.persistence.*;

@Entity
@Table(name="courses")

public class CourseModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Integer id;
	@Column(name = "course_name")
	String course_name;
	@Column(name = "course_description")
	String course_description;
	@Column(name = "course_discount_price")
	Long course_discount_price;
	@Column(name = "course_price")
	Long course_price;
	@Column(name = "course_extended_duration")
	Long course_extended_duration;
	@Column(name = "course_duration")
	Long course_duration;
	@Column(name = "course_image")
	String course_image;
	@Column(name = "course_instructor")
	String course_instructor;
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
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getCourse_description() {
		return course_description;
	}
	public void setCourse_description(String course_description) {
		this.course_description = course_description;
	}
	public Long getCourse_discount_price() {
		return course_discount_price;
	}
	public void setCourse_discount_price(Long course_discount_price) {
		this.course_discount_price = course_discount_price;
	}
	public Long getCourse_price() {
		return course_price;
	}
	public void setCourse_price(Long course_price) {
		this.course_price = course_price;
	}
	public Long getCourse_extended_duration() {
		return course_extended_duration;
	}
	public void setCourse_extended_duration(Long course_extended_duration) {
		this.course_extended_duration = course_extended_duration;
	}
	public Long getCourse_duration() {
		return course_duration;
	}
	public void setCourse_duration(Long course_duration) {
		this.course_duration = course_duration;
	}
	public String getCourse_image() {
		return course_image;
	}
	public void setCourse_image(String course_image) {
		this.course_image = course_image;
	}
	public String getCourse_instructor() {
		return course_instructor;
	}
	public void setCourse_instructor(String course_instructor) {
		this.course_instructor = course_instructor;
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

	public CourseModel(String course_name, String course_description, Long course_discount_price, Long course_price,
			Long course_extended_duration, Long course_duration, String course_image, String course_instructor) {
		super();
		this.course_name = course_name;
		this.course_description = course_description;
		this.course_discount_price = course_discount_price;
		this.course_price = course_price;
		this.course_extended_duration = course_extended_duration;
		this.course_duration = course_duration;
		this.course_image = course_image;
		this.course_instructor = course_instructor;
	}
	
	
	public CourseModel() {
		super();
	}
	
}
