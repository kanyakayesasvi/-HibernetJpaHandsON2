package com.accolite.SpringHiberNetJpaMTM.Services;

import com.accolite.SpringHiberNetJpaMTM.Entites.Students;
import com.accolite.SpringHiberNetJpaMTM.Entites.Teacher;

import java.util.List;

public interface TeacherServices {
    List<Teacher> getAllStudents();
    Teacher CreateStudents(Teacher T);
}
