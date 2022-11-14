package com.liceokeplero.school.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="teacher")
public class TeacherEntity {

    @Id
    @Column(name = "teacher_id",nullable = false,length = 255)
    private String teacherId;

    @Column(name = "name", nullable = false, length = 20)
    private String name;

    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @Column(name = "address", nullable = false, length = 100)
    private String address;

    @Column(name = "birth_date", nullable = false, length = 20)
    private String birthDate;

    @Column(name = "hiring_date",nullable = false, length = 20)
    private Date hiringDate;

    @Column(name = "phone_number",nullable = false, length = 30)
    private String phoneNumber;
}
