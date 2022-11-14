package com.liceokeplero.school.service;

import com.liceokeplero.school.entity.StudentEntity;
import com.liceokeplero.school.mapper.StudentMapper;
import com.liceokeplero.school.model.Student;
import com.liceokeplero.school.model.StudentRequest;
import com.liceokeplero.school.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class StudentService
{
    public final StudentRepository studentRepository;
    public final StudentMapper studentMapper;

    public StudentService(StudentRepository studentRepository, StudentMapper studentMapper)
    {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }

    public Student saveStudent(StudentRequest studentRequest)
    {
        StudentEntity entity = new StudentEntity();
        entity.setStudentId(studentRequest.getId());
        entity.setName(studentRequest.getName());
        entity.setLastName(studentRequest.getLastName());
        entity.setAddress(studentRequest.getAddress());
        entity.setBirthDate(studentRequest.getBirthDate());
        entity.setEnrollmentDate(new Date());
        entity.setAcademicYear(studentRequest.getAcademicYear());
        entity.setPhoneNumber(studentRequest.getPhoneNumber());
        return studentMapper.toModel(studentRepository.save(entity));
    }
}
