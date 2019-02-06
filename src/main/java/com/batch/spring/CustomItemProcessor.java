package com.batch.spring;

import org.springframework.batch.item.ItemProcessor;

//Implementing the ItemProcessor interface 
public class CustomItemProcessor implements ItemProcessor<Student, Student> {

	@Override
	public Student process(Student student) throws Exception {
		System.out.println("Processing..." + student);
		return student;
	}
}