package com.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Repository.StudentRepo;
import com.ServiceI.StudentServiceI;
import com.model.Student;

@Service
public class StudentServiceimpl implements StudentServiceI{
	
	@Autowired
	StudentRepo sr;

	@Override
	public Student addStudent(Student stu) {
		return	sr.save(stu);
		 
	}

	@Override
	public void deletedata(int id) {
		sr.deleteById(id);
		
	}

	@Override
	public List<Student> getAllData() {
		List<Student> stu=sr.findAll();
		return stu;
	}

	@Override
	public Student updateData(Student stu) {
	Student st	=sr.save(stu);
		return st;
	}

	

}
