package com.teachers.teachers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teachers.teachers.entity.Teacher;


public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
