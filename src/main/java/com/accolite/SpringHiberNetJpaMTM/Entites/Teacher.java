package com.accolite.SpringHiberNetJpaMTM.Entites;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Teacher")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "Teacher_id")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Teacher_id;

    private String TeacherName;


    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "TeaList", fetch = FetchType.EAGER)
    List<Students> StuList = new ArrayList<>();

    public Teacher(String teacherName) {
        TeacherName = teacherName;
    }
}



