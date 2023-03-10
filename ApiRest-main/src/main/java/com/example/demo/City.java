 package com.example.demo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "city")
public class City {
@Id
@Column(name = "city_id")
Integer id;
@Column(name = "city")
String  firstName;
@Column(name = "country_id")
String lastName ;
@Column(name = "last_update")
Date lastUpdate ;
public City() {
}
public Integer getId() {
    return id;
}
public void setId(Integer id) {
    this.id = id;
}
public String getFirstName() {
    return firstName;
}
public void setFirstName(String firstName) {
    this.firstName = firstName;
}
public String getLastName() {
    return lastName;
}
public void setLastName(String lastName) {
    this.lastName = lastName;
}

public Date getLastUpdate() {
    return lastUpdate;
}
public void setLastUpdate(Date lastUpdate) {
    this.lastUpdate = lastUpdate;
}

}