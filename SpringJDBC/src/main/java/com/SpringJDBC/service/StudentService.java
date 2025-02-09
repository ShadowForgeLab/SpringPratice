package com.SpringJDBC.service;

import com.SpringJDBC.model.Student;
import com.SpringJDBC.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudetns(Student s) {
       repo.save(s);
    }

    public List<Student> getStudents() {

        return repo.findAll();
    }
}
