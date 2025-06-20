package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ServiceI.StudentServiceI;
import com.model.Student;

@RestController
public class StudentController {
	
	@Autowired
	StudentServiceI ssi;
	
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student stu) {
		
	Student st	=ssi.addStudent(stu);
	return st;
		
	}
	
	@GetMapping("/getalldata")
	public List<Student> getAllData(){
	List<Student> list	=ssi.getAllData();
	return list;
	}
	
	@PutMapping("/updatadata/{rollno}")
	public Student updateData(@PathVariable("rollno") int rollno, @RequestBody Student stu) {
	    stu.setRollno(rollno);  
	    Student updatedStudent = ssi.updateData(stu);
	    return updatedStudent;
	}
		
	
	@DeleteMapping("/deletedata/{id}")
	public String deletedata(@PathVariable("id") int id) {
		ssi.deletedata(id);
		return "data detete sucessfully";
		
	}

}
