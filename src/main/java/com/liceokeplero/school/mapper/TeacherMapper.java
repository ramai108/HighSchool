package com.liceokeplero.school.mapper;

import com.liceokeplero.school.entity.TeacherEntity;
import com.liceokeplero.school.model.Teacher;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TeacherMapper {
    TeacherEntity toEntity (Teacher teacher);
    Teacher toModel (TeacherEntity teacherEntity);
}
