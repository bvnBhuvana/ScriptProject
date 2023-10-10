package com.teacher.entity;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Student {
	private Integer id;
	private String name;
	private Integer roll_number;

}
