package com.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "roll_no")
	private long student_rollno;

	@Column(name = "name")
	private String student_name;

	public long getStudent_rollno() {
		return student_rollno;
	}

	public void setStudent_rollno(long student_rollno) {
		this.student_rollno = student_rollno;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

}
