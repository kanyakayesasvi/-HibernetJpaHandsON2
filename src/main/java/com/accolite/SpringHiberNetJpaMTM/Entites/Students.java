package com.accolite.SpringHiberNetJpaMTM.Entites;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Students")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String Name;
    private String email;
    private Long phonenumber;
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name = "students_Teacher",joinColumns = @JoinColumn(name = "id"),inverseJoinColumns = @JoinColumn(name="Teacher_id"))
    List<Teacher> TeaList=new ArrayList<>();

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", email='" + email + '\'' +
                ", phonenumber=" + phonenumber +
                ", TeaList=" + TeaList +
                '}';
    }
}
