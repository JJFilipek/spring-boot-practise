package com.jf.cruddemo.dao;

import com.jf.cruddemo.entity.Student;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);
}
