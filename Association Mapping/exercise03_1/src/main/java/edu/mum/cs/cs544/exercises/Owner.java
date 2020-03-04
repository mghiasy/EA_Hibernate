package edu.mum.cs.cs544.exercises;

import javax.persistence.*;

@Entity
public class Owner {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "Name",nullable = false,length = 255)
    private String name;
    @Column(name = "Address",nullable = false,length = 255)
    private String address;

    public Owner() {
    }

    public Owner(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
