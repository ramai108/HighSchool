package com.liceokeplero.school.repository;

import com.liceokeplero.school.entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository <TeacherEntity, String> {
}
