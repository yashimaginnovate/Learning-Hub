package com.imaginnovate.learninghub.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Courses")
public class Course {
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private long id;
	
	@Column
	private String title;
	
	@Column
	private String courseLink;
	
	@Column
	private String imagURL;
	
	@Column
	private String courseType;
	
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCourseLink() {
		return courseLink;
	}
	public void setCourseLink(String courseLink) {
		this.courseLink = courseLink;
	}
	public String getImagURL() {
		return imagURL;
	}
	public void setImagURL(String imagURL) {
		this.imagURL = imagURL;
	}
	public String getCourseType() {
		return courseType;
	}
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	
	
}
