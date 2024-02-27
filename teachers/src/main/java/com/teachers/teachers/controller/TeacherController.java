package com.teachers.teachers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teachers.teachers.entity.Teacher;
import com.teachers.teachers.service.TeachersService;

@RestController
@RequestMapping("/api/teachers")
public class TeacherController {
	
	 
	    @Autowired
	    private TeachersService teacherService;

	    @PostMapping("/create")
	    public String createTeacher(@RequestBody Teacher teacher) {
	        return teacherService.createTeacher(teacher);
	    }
	    
	    @GetMapping
	    public List<Teacher> getAllTeachers() {
	        return teacherService.getAllTeachers();
	    }
	    
	    @GetMapping("/{id}")
	    public Teacher getTeacherById(@PathVariable Long id) {
	        return teacherService.getTeacherById(id);
	    }
	    
		/*
		 * @PutMapping("/{id}") public Teacher updateTeacher(@PathVariable Long
		 * id, @RequestBody Teacher teacher) { return
		 * teacherService.createTeacher(teacher); }
		 */
	    

	    @DeleteMapping("/{id}")
	    public void deleteTeacher(@PathVariable Long id) {
	    	teacherService.deleteTeacher(id);
	    }

}
