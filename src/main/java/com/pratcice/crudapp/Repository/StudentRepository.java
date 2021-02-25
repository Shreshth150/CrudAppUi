package com.pratcice.crudapp.Repository;

import com.pratcice.crudapp.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student , Long> {

    List<Student> findByName(String name);
}
