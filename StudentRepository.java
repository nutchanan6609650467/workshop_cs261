package com.example.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends JpaRepository<Student, Long> {
	// You can define custom query methods here if needed
	 //save(Student student);
	//findById(Long id);
	//findAll();
	//deleteById(Long id);

}
