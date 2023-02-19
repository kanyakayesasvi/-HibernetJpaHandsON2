package com.accolite.SpringHiberNetJpaMTM.Repositary;

import com.accolite.SpringHiberNetJpaMTM.Entites.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<Teacher,Integer> {
}
