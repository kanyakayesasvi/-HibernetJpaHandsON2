package com.accolite.SpringHiberNetJpaMTM.Services;


import com.accolite.SpringHiberNetJpaMTM.Entites.Students;
import com.accolite.SpringHiberNetJpaMTM.Repositary.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentsServiceImp implements StudentsServices {
    @Autowired
    private StudentRepo repo;

    @Override
    public List<Students> getAllStudents() {
        return this.repo.findAll();
    }

    @Override
    public Students CreateStudents(Students S) {
        return this.repo.save(S);
    }
}
