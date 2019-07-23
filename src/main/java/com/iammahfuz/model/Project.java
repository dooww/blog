package com.iammahfuz.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Data
public class Project {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name ;
private String description;


@OneToMany
    private Set<Module> tab;





}
