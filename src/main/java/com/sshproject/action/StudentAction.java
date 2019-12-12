package com.sshproject.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.sshproject.pojo.Student;
import com.sshproject.service.StudentService;

@Controller
public class StudentAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private StudentService studentService;
	
	public String findstudent() {
		
		List<Student> stulist = studentService.findstudent();
		
		for(Student stu : stulist) {
			
			System.out.println(stu.getId() + " ----------------- " + stu.getName() + " ----------------- " + stu.getName());
			
		}
		
		return "success";
		
	}

}
