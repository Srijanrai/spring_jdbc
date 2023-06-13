package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.Student;

public interface StudentDao {
public int insert(Student st);
public int change (Student st);
public int delete(Student st);
// to get a single row information
public Student getInfo(int studentId);
public List<Student> getList();
}
