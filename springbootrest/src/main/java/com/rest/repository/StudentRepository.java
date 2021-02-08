package com.rest.repository;

import org.springframework.data.repository.CrudRepository;

import com.rest.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
