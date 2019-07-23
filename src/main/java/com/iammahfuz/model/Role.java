package com.iammahfuz.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "roles")

public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	



}
