package com.ServiceI;

import java.util.List;

import com.model.Student;

public interface StudentServiceI {

public	Student addStudent(Student stu);

public void deletedata(int id);

public List<Student> getAllData();

public Student updateData(Student stu);

}
