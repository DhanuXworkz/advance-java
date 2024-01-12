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
@NoArgsConstructor@AllArgsConstructor
@Table(name = "sports_info")

public class Sports {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "noofplayers")
    private int noofplayers;
    @Column(name = "famousplayer")
    private String famousplayer;
    @Column(name = "country")
    private String country;
}
