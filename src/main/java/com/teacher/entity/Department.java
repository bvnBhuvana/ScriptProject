package com.teacher.entity;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Department {
	private Integer id;
	private String name;
	private String discription;

}
