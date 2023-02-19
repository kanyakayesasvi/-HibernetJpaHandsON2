package com.accolite.SpringHiberNetJpaMTM.Services;

import com.accolite.SpringHiberNetJpaMTM.Entites.Teacher;
import com.accolite.SpringHiberNetJpaMTM.Repositary.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherServicesImp implements TeacherServices{
    @Autowired
    TeacherRepo repo;
    @Override
    public List<Teacher> getAllStudents() {
        return this.repo.findAll();
    }

    @Override
    public Teacher CreateStudents(Teacher T) {
        return this.repo.save(T);
    }
}
