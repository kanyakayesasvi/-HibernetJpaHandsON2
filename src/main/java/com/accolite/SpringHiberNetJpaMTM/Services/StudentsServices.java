package com.accolite.SpringHiberNetJpaMTM.Services;


import com.accolite.SpringHiberNetJpaMTM.Entites.Students;

import java.util.List;

public interface StudentsServices {
    List<Students>getAllStudents();
    Students CreateStudents(Students S);

}