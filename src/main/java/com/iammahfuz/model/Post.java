package com.iammahfuz.model;

import javax.persistence.*;

@Entity
@Table(name = "posts")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public class Post {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY) //incrémentation automatique de l'identifiant
	private Long id;

	private String content;
	private int status;
}
