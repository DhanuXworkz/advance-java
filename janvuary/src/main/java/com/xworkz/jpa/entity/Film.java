package com.xworkz.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Data
@AllArgsConstructor
@Table(name = "film_info")

@NoArgsConstructor
public class Film {
    @Id
    @Column(name = "id")
private int id;
    @Column(name = "name")
private String name;
    @Column(name = "heroName")
private String heroName;
    @Column(name = "director")
private  String director;
    @Column(name = "producer")
private String producer;

}
