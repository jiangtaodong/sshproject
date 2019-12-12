package com.sshproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sshproject.dao.StudentDao;
import com.sshproject.pojo.Student;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDao studentDao;
	
	@Override
	public List<Student> findstudent() {
		
		return studentDao.findstudent();
	}

}
