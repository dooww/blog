package com.iammahfuz.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java .util.Set;

@Entity
@Data
public class formation
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String formateur_linkedin_url;
    private String Description;
    private Date deadline_to_applay;
    private Date  formation_date ;
    private int price ;

    @ManyToMany
    private Set<User> people_applayfortheformation;

}
