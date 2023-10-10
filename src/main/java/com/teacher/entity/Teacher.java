package com.teacher.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Teacher {
	private Integer id;
	private String name;
	@OneToMany
	@JoinColumn(name="s_id")
	private Student student;
	
	

}
