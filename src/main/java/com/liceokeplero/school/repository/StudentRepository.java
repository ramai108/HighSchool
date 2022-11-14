package com.liceokeplero.school.repository;

import com.liceokeplero.school.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <StudentEntity,String>
{

}
