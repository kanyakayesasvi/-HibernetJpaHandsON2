package com.accolite.SpringHiberNetJpaMTM.Repositary;

import com.accolite.SpringHiberNetJpaMTM.Entites.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Students,Integer> {

}
