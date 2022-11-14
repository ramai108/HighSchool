package com.liceokeplero.school.mapper;

import com.liceokeplero.school.entity.StudentEntity;
import com.liceokeplero.school.model.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper
{
    StudentEntity toEntity(Student student);
    Student toModel(StudentEntity studentEntity);

}
