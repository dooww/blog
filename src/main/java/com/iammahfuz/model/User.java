package com.iammahfuz.model;

import java.util.Collection;
import java.util.Set;

import javax.persistence.*;

import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Transient;
@Data
@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class User {
	@Id

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	@NotEmpty(message = "*Please provide you name")
	private String name;
	@Column(name = "email")
	@Email(message = "*Please provide a valid email")
	@NotEmpty(message = "*Please provide your email")
	private String email;



	@Column(name = "password")
	@Length(min = 5, message = "*Your password must be at least 5 characters")
	@NotEmpty(message = "*Please provide your password")
	@Transient
	private String password;


	@Column(name = "active")
	private int active;
	@NotEmpty(message = "1 mean active 0 not ")





    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_projects", joinColumns = @JoinColumn(name = "users_id"), inverseJoinColumns = @JoinColumn(name = "project_id"))
    private Set<Project> projects;



	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_skills", joinColumns = @JoinColumn(name = "users_id"), inverseJoinColumns = @JoinColumn(name = "skill_id"))
	private Collection<skill> required_skills ;









}
