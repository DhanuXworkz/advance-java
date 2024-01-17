package com.xworkz.task.entity;

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
@NoArgsConstructor
@Table(name = "sports")
public class Sports {
    @Id
    @Column(name = "id")
    private  int id;
    @Column(name = "name")
    private  String name;
    @Column(name = "originCountry")
    private  String originCountry;
    @Column(name = "captainName")

    private  String captainName;
    @Column(name = "totalplayer")

    private  int totalplayer;

}
