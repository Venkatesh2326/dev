package com.teachers.teachers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teachers.teachers.entity.Teacher;
import com.teachers.teachers.repository.TeacherRepository;


@Service
public class TeachersService {
	
	@Autowired
	private TeacherRepository teacherrepo;
	
    public String createTeacher(Teacher teacher) {
       
        teacherrepo.save(teacher);
    	
    	return "teacher has been added";
    }
    
    public List<Teacher> getAllTeachers() {
        return teacherrepo.findAll();
    }
    
    public  Teacher getTeacherById(Long id) {
        return teacherrepo.findById(id).orElse(null);
    }
    
    public  Teacher updateTeacher(Long id,  Teacher teacher) {
    	teacher.setId(id);
        return teacherrepo.save(teacher);
    }
    

    public void deleteTeacher(Long id) {
    	teacherrepo.deleteById(id);
    }

}
