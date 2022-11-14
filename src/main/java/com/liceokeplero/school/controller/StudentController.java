package com.liceokeplero.school.controller;

import com.liceokeplero.school.model.JsonResponse;
import com.liceokeplero.school.model.Student;
import com.liceokeplero.school.model.StudentRequest;
import com.liceokeplero.school.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController
{
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/createstudent")
    public ResponseEntity<?> saveStudent (@RequestBody StudentRequest studentRequest) {
        String id = studentRequest.getId();
        String name = studentRequest.getName();
        String lastName = studentRequest.getLastName();
        String address = studentRequest.getAddress();
        String birth_date = studentRequest.getBirthDate();
        Integer academic_year = studentRequest.getAcademicYear();
        String phone_number = studentRequest.getPhoneNumber();
        JsonResponse jsonResponse = new JsonResponse();

        if(id == null || (id.equals("")))
        {
            jsonResponse.setStatusCode(400);
            jsonResponse.setCode("ERR_MISSING_REQUIRED_PROPERTIES");
            jsonResponse.setError("Bad Request");
            jsonResponse.setMessage("Please, enter a valid code");
            return new ResponseEntity<>(jsonResponse, HttpStatus.BAD_REQUEST);
        }

        if(name == null || (name.equals("")))
        {
            jsonResponse.setStatusCode(400);
            jsonResponse.setCode("ERR_MISSING_REQUIRED_PROPERTIES");
            jsonResponse.setError("Bad Request");
            jsonResponse.setMessage("Please, enter a valid name");
            return new ResponseEntity<>(jsonResponse, HttpStatus.BAD_REQUEST);
        }

        if (lastName == null || (lastName.equals("")))
        {
            jsonResponse.setStatusCode(400);
            jsonResponse.setCode("ERR_MISSING_REQUIRED_PROPERTIES");
            jsonResponse.setError("Bad Request");
            jsonResponse.setMessage("Please, enter a valid last name");
            return new ResponseEntity<>(jsonResponse, HttpStatus.BAD_REQUEST);
        }

        if(address == null || (address.equals("")))
        {
            jsonResponse.setStatusCode(400);
            jsonResponse.setCode("ERR_MISSING_REQUIRED_PROPERTIES");
            jsonResponse.setError("Bad Request");
            jsonResponse.setMessage("Please, enter a valid address");
            return new ResponseEntity<>(jsonResponse, HttpStatus.BAD_REQUEST);
        }

        if(birth_date == null || (birth_date.equals("")))
        {
            jsonResponse.setStatusCode(400);
            jsonResponse.setCode("ERR_MISSING_REQUIRED_PROPERTIES");
            jsonResponse.setError("Bad Request");
            jsonResponse.setMessage("Please, enter a valid date");
            return new ResponseEntity<>(jsonResponse, HttpStatus.BAD_REQUEST);
        }

        if(academic_year == null )
        {
            jsonResponse.setStatusCode(400);
            jsonResponse.setCode("ERR_MISSING_REQUIRED_PROPERTIES");
            jsonResponse.setError("Bad Request");
            jsonResponse.setMessage("Please, enter a valid academic year");
            return new ResponseEntity<>(jsonResponse, HttpStatus.BAD_REQUEST);
        }

        if(phone_number == null || (phone_number.equals("")))
        {
            jsonResponse.setStatusCode(400);
            jsonResponse.setCode("ERR_MISSING_REQUIRED_PROPERTIES");
            jsonResponse.setError("Bad Request");
            jsonResponse.setMessage("Please, enter a valid phone number");
            return new ResponseEntity<>(jsonResponse, HttpStatus.BAD_REQUEST);
        }

        Student savedStudent = new Student();
        savedStudent = studentService.saveStudent(studentRequest);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }
}
