package com.linkedin.entities.database.repo;

import com.linkedin.entities.database.Connection;
import com.linkedin.entities.database.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EducationRepository extends JpaRepository<Education, Long> {

    @Query(value = "select e from Education e where e.userId = :userId")
    List<Education> findByUserId(@Param("userId")Long userId);

}
