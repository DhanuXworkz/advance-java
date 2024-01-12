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
@Table(name = "traffic_info")
@AllArgsConstructor
@NoArgsConstructor
public class Traffic {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "area")
    private String area ;
    @Column(name = "city")
    private String city ;
    @Column(name = "state")
    private String state;
    @Column(name = "country")
    private String country;
}
