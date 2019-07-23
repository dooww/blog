package com.iammahfuz.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Date;
import java.util.Set;

public class event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String formateur_linkedin_url;
    private String Description;
    private Date deadline_to_applay;
    private Date  formation_date ;
    @ManyToMany
    private Set<User> people_applayfortheformation;

}
