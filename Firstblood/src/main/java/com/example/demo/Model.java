package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Bloody")
public class Model {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String name;
private Long ph;
private String btype;
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public Long getPh() {
return ph;
}
public void setPh(Long ph) {
this.ph = ph;
}
public String getBtype() {
return btype;
}
public void setBtype(String btype) {
this.btype = btype;
}


}